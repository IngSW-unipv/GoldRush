package goldrush;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/**
 * Base class for all gold diggers.
 * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public abstract class GoldDigger {
    
    public final String getName() {
        return  this.getClass().getSimpleName();
    }
    
    /**
     * Ask the digger to chose his mining site.
     * 
     * @param distances array of distances between the town and the mining sites
     * @return and index in the array of distances indicating the site he want to min.
     */
    public abstract int chooseDiggingSite(int[] distances);
    
    /**
     * Inform the digger about the outcome of the digging day.
     *
     * @param revenue grams of gold gained during the day
     * @param distances distances between the town and the mining sites
     * @param diggers number of diggers who that day worked in the mining sites
     */
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        /* Do nothing by default. */
    }
}
