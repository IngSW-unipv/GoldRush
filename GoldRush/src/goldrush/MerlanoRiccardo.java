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
 * @author Merlano Riccardo 427720
 */
public class MerlanoRiccardo extends GoldDigger {
    
    int sito=5, i=0, flag=0;

    @Override
    public int chooseDiggingSite(int[] distances) {
        
        for(i=0; i<distances.length; i++){
            
//            if(flag<=2)
//            {
//                flag++;
//                sito = 5;
//            }
//            else
//            {
//                sito = 4;
//                flag = 0;
//            }
        }
            
   
        return sito;
    }
    
//    @Override
//        public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
//            
//        for(i=0; i<diggers.length; i++){
//            System.out.print(diggers[i] + " ");
//        }
//        
//        System.out.print("\n");
//        
//    }
    
    
}

