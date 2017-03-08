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
public class BoniMichele extends GoldDigger{ //
int t=0;
   int j=99;
    @Override
    public int chooseDiggingSite(int[] distances) {
     
        for (int i=0; i<distances.length; i++){
          if (t==0){
            
            if (distances[i]==140) {
               j=i;
               t++;
            }
        }
     else   if (t<3) { 
          if (distances[i]== 30) {
               j=i;
               t=0;
              
            }
         }
     else {
        if (distances[i]== 200) {
               j=i;
               t=0;
     }
        }
        }
       
    return j;
          
        }
    
}
