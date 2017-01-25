package goldrush;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.reflections.Reflections;

/**
 *
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class Town {
    List<GoldDigger> diggers;
    Bank bank;
    int[] siteDistances;
    
    /**
     * Create a new town.
     * 
     * @param distances distances (in minutes) between the town and the mining sites
     * @throws InstantiationException
     * @throws IllegalAccessException
     */
    public Town(int[] distances) throws InstantiationException, IllegalAccessException {
        siteDistances = distances;
        diggers = Town.discoverDiggers();
        bank = new Bank();
    }
    
    static List<GoldDigger> discoverDiggers() throws InstantiationException, IllegalAccessException {
        Reflections reflections = new Reflections("goldrush");
        Set<Class<? extends GoldDigger>> subTypes;
        subTypes = reflections.getSubTypesOf(GoldDigger.class);
        
        List<GoldDigger> diggers = new ArrayList<>();
        for (Class<? extends GoldDigger> cls : subTypes)
            for (int j = 0; j < 100; j++)
            diggers.add(cls.newInstance());
        return diggers;
    }
    
    /**
     * The list of gold diggers in the town.
     * 
     * @return the diggers
     */
    public List<GoldDigger> getDiggers() {
        return diggers;
    }

    /**
     * Compute the amount of gold obtained by each of the diggers mining a site
     * at the given distance.
     * 
     * @param distance distance between the town and the mining site
     * @param diggers number of gold diggers at that site
     * @return grams of gold obtained
     */
    public static int computeSiteRevenue(int distance, int diggers) {
        // Perform computations in minutes to reduce the rounding error.
        if (diggers < 1)
            return 0;
        int num = 5 * (12*60 - distance * 2);
        if (num < 0)
            return 0;
        int den = diggers * 60;
        return (num + (den / 2)) / den;
    }
    
    /**
     * Simulate a single day for the gold diggers.
     */
    public void simulateDay() {
        // Arrays passed to diggers are cloned to prevent cheating.
        int N = siteDistances.length;
        int[] counters = new int[N];
        int[] selection = new int[diggers.size()];
        for (int i = 0; i < diggers.size(); i++) {
            selection[i] = diggers.get(i).chooseDiggingSite(siteDistances.clone());
            if (selection[i] >= 0 && selection[i] < N)
                counters[selection[i]]++;
        }
        
        int[] revenues = new int[N];
        for (int i = 0; i < N; i++)
            revenues[i] = Town.computeSiteRevenue(siteDistances[i], counters[i]);
        
        for (int i = 0; i < diggers.size(); i++) {
            int r = (selection[i] >= 0 && selection[i] < N ? revenues[selection[i]] : 0);
            bank.storeGold(diggers.get(i), r);
            diggers.get(i).dailyOutcome(r, siteDistances.clone(), counters.clone());
        }
    }
    
    /**
     * Compute a ranking of the diggers by decreasing amount of stored gold.
     * 
     * @return a list of digger/gold pairs
     */
    public List<Map.Entry<GoldDigger, Integer>> richestDiggers() {
        return bank.richestDiggers();
    }
}
