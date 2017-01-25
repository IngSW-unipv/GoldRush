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

/**
 *
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class Town {
    List<GoldDigger> diggers_;
    Bank bank;
    static final int[] SITE_DISTANCES = {10, 30, 30};
    
    Town() {
        diggers_ = new ArrayList<>();
        diggers_.add(new RandomDigger());
        diggers_.add(new RotatingDigger()); 
        bank = new Bank();
    }
    
    public List<GoldDigger> diggers() {
        return diggers_;
    }

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
    
    public void simulateDay() {
        int N = SITE_DISTANCES.length;
        int[] counters = new int[N];
        int[] selection = new int[diggers_.size()];
        for (int i = 0; i < diggers_.size(); i++) {
            selection[i] = diggers_.get(i).chooseDiggingSite(SITE_DISTANCES);
            if (selection[i] >= 0 && selection[i] < N)
                counters[selection[i]]++;
        }
        
        int[] revenues = new int[N];
        for (int i = 0; i < N; i++)
            revenues[i] = Town.computeSiteRevenue(SITE_DISTANCES[i], counters[i]);
        
        for (int i = 0; i < diggers_.size(); i++) {
            int r = (selection[i] >= 0 && selection[i] < N ? revenues[selection[i]] : 0);
            bank.storeGold(diggers_.get(i), r);
            diggers_.get(i).dailyOutcome(r, SITE_DISTANCES, counters);
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
