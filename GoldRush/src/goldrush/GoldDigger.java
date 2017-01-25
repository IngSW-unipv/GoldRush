package goldrush;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/**
 *
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public abstract class GoldDigger {
    int gold = 0;
    String name;
    
    GoldDigger(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    
    public abstract int chooseDiggingSite(int[] distances);
    
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        /* Do nothing by default. */
    }
}
