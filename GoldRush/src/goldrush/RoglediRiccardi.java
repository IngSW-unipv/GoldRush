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
 * @author cl418743
 */
public class RoglediRiccardi extends GoldDigger{
    private String namesurname;     //Rogledi 418743 Riccardi 418760
    
   
    @Override
    public int chooseDiggingSite(int[] distances) {
        int i;
        for(i=0;i<distances.length;i++){
            if(distances[i]>40){
                return i;
            }
            
        }         
        
        return i;
    }
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        //System.out.println("\ngrammi: "+ revenue);
        int i;
        //for(i=0;i<distances.length;i++){System.out.println("distanze: " + distances[i]);}
        //for(i=0;i<diggers.length;i++){System.out.println("diggers: " + diggers[i]);}
    }
    
    
    
}