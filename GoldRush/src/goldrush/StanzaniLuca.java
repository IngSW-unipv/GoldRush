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
public class StanzaniLuca extends GoldDigger {

    
    private int day = 0;
    private int current;
    private HashMap<Integer, Day> days = new HashMap<>();
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        
        if (day == 0)
        {
            current = 1;
            day++;
            return current;
        }
        else if (day == 1 || day == 2)
        {
            current = 0;
            day++;
            return current;
        }
        else if (day >= 3 && current == 0)
        {
            if(days.get(day-3).getRevenue() < days.get(day-1).getRevenue())
            {
                current+=2;
            }
            day++;
            return current;
        }
        else
        {
            if (days.get(day-2).getRevenue() < days.get(day-1).getRevenue())
            {
                if (days.get(day-2).getCurrent()-days.get(day-1).getCurrent() < 0)
                {
                    if (current != 5)
                        current+=1;
                }
                else
                {
                    if (current != 0)
                        current-=1;
                }
                return current;
            }
        }
        return 0;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        days.put(day-1, new Day(revenue, current, diggers[current]));
    }
    
    
    
}

class Day{
    
    private int revenue;
    private int current;
    private int number;

    public Day(int revenue, int current, int number) {
        this.revenue = revenue;
        this.current = current;
        this.number = number;
    }

    public int getRevenue() {
        return revenue;
    }

    public int getCurrent() {
        return current;
    }

    public int getNumber() {
        return number;
    }
    
    
    
}
