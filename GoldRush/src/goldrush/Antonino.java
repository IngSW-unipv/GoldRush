/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.Arrays;

/**
 *
 * @author cl427169
 */
public class Antonino extends GoldDigger{
int r=0;
public int chooseDiggingSite(int[] distances){
return r;

}
public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 

 for(int i=1; i<distances.length; i++){
    if(distances[r]>distances[i])
    r=i;
   }
 for(int j=1; j<diggers.length; j++){
    if(diggers[r]>diggers[j])
    r=j;
   }
  }
}




/*
int r=0;
for(int i=1; i<distances.length; i++)
if(distances[r]>distances[i])
r=i;
return r;
*/