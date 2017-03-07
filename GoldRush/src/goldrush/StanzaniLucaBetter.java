/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.HashMap;

/**
 *
 * @author Stanzani Luca 427957 & Michele Lombardo 427988
 */
public class StanzaniLucaBetter extends GoldDigger {

    
    private int day = 0;
    private int current;
    private int past;
    private int[] diggers;
    private int[] distances;
    private HashMap<Integer, Integer> jumps = new HashMap<>();
    private HashMap<Integer, Integer> revenues = new HashMap<>();
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        
        if (day == 0)
        {
            current = 2;
            jumps.put(day+1,1);
            day++;
            return current;
        }
        else if (day >= 1)
        {
            double currentGain;
            double max = 0;
            for (int i=0; i<diggers.length; i++)
            {
                //System.out.println("Il giorno " + day + " ci sono i seguenti guadagni: ");
                currentGain = (5*(12-(double)distances[i]/30.)/((double)diggers[i]+1));
                if (currentGain >= max)
                {
                    max = currentGain;
                    jumps.put(day+1, i);
                }
                //System.out.println(currentGain + "\nSito scelto: " + current);
            }
            day++;
            System.out.println(jumps.get(day-1));
            return jumps.get(day-1);
        }
        return 0;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        this.revenues.put(day-1, revenue);
        this.diggers = diggers;
        this.distances = distances;
        //System.out.println("Giorno " + (day - 1));
        for (int i = 0; i<diggers.length; i++)
        {
            System.out.println(distances[i] + " " + diggers[i] + " " );
            //System.out.println((5*(12-(double)distances[i]/30.)/((double)diggers[i]+1)));
        }
    }
    
    
    
}