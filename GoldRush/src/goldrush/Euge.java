/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/*
 * Matricola: 427263
*/

package goldrush;

import java.util.Random;

/**
 *
 * @author cl427263
 */
public class Euge extends GoldDigger {
    int chosenSite;
    int tmpchs;
    Euge()
    {
        
    }
    
    public void basicChoice(int[] distances)
    {
        Random rr = new Random();
            tmpchs = rr.nextInt(distances.length);
        
        for(int i = 0; i < distances.length; i++)
        {
            if(tmpchs == distances[i])
            {
                
                chosenSite = i;
            }
        }
    }
    
    @Override
    public int chooseDiggingSite(int[] distances)
    {
        basicChoice(distances);
        return chosenSite;
    }
    
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers)
    {
        
       
        /*
        while(false)
        {
            
            
            chooseDiggingSite(distances);
            
        }
        */
    }
    
    
}
