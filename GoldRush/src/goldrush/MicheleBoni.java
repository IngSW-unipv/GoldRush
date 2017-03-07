/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

/**
 *  @author Reina Michele cl418656
 * @author Bonissone Davidecl427113
 */
public class MicheleBoni extends GoldDigger{ //

    @Override
    public int chooseDiggingSite(int[] distances) {
        int j=99;
        for (int i=0; i<distances.length; i++){
         if (distances[i]==200)
               j=i;
        }
    return j;
    }
    
}
