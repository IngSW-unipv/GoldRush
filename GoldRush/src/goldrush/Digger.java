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
 * @author cl427169
 */
public class Digger extends GoldDigger{
public int chooseDiggingSite(int[] distances){
int r=0;
for(int i=1; i<distances.length; i++)
if(distances[r]>distances[i])
r=i;
return r;
}  
}
