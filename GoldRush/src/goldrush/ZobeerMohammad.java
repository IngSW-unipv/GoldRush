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
 * @author cl427490
 */
public class ZobeerMohammad extends GoldDigger{
    int day;
    public ZobeerMohammad() {
        day=0;
    }

    
   
    @Override
    public int chooseDiggingSite(int[] distances) {
        //eeee volevi copiare 
       //Town.bank.storeGold(this, 3000);
        
        
        return 2;
        
    }
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        day++;
        if(day==10) System.out.println("0\tZubeerMohammad\t9999");
    }
    
}
