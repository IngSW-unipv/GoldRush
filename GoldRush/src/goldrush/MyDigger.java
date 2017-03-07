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
 * @author cl427176
 */
public class MyDigger extends GoldDigger{

    private int[] nMinatori;

    public MyDigger() {
        nMinatori = new int[6];
    }
    
    
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        int index = guadagno(distances);
        nMinatori[index]++;
        return index;
    }
       
    private int guadagno(int[] distMiniera){
        double[] money;
        money = new double[6];
        
        for (int i = 0; i<distMiniera.length;i++) {
            money[i] = 5 * (12 - 2*(distMiniera[i]/60))/(nMinatori[i]+1);
        }
        return sceltaMiniera(money);
        
    }
    
    private int sceltaMiniera(double[] money){
        double max = 0;
        int index = 0;
        
        for (int i = 0; i < money.length; i++) {
            if(money[i] > max){
                max = money[i];
                index = i;
            }
        }
        return index;
    }  
}
