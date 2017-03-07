/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

/**
 *
 * @author Simone
 */
public class ColosiSimone extends GoldDigger{
    
    protected int revenue;
    protected int[] distances;
    protected int[] diggers;
    
    public ColosiSimone(){
        revenue=0;
        distances=new int[6];
        diggers=new int[6];
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        return 0;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        this.revenue=revenue;
        this.distances=distances.clone();
        this.diggers=diggers.clone();
        
    }
}
