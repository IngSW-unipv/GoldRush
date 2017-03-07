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
 * @author Daniele
 */
public class DanieleTavazzi extends GoldDigger
{
    int days;
    int chosen;
    
    public DanieleTavazzi()
    {
        days=0;
    }

    @Override
    public int chooseDiggingSite(int[] distances) 
    {
        days++;
        if(days%6==0)
            chosen=1;
        else
            chosen=0;
        return chosen;
            
        
    }
    
}
