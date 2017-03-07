package goldrush;


import goldrush.GoldDigger;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/**
 *
 * @author Marcello
 */

/**
 Marcello Turri 427470
 Emanuele Nardi 427310*/
public class TurriMarcello extends GoldDigger {

    @Override
    
    public int chooseDiggingSite(int[] distances) {
       for(int i = 0; i < distances.length; i++){
           distances[i] = 0;
       }
       return distances[0];
    }
    
}
