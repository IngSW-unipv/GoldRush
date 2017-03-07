/*
 I migliori!
Marco Prina(418308) e Argirov Lyubomir(420038)
 */
package goldrush;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author cl420038
 */
public class ARGIROV_PRINA extends GoldDigger {
    private int gruppo=2;
    private ArrayList<Integer> guadagnoxsito = new ArrayList<>();
    private int max=0, maxi=0;

    @Override
    public int chooseDiggingSite(int[] distances) {

        return maxi;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        int a=0;
        for(int i=0; i<distances.length ; i++){
            if(diggers[i]==0){
                diggers[i]=1;
            }
                a=(int)5*((12-2*distances[i]/60)/diggers[i]);
                guadagnoxsito.add(a);
            
        }
        
        for(int i=0; i<distances.length ; i++)
            if(max>guadagnoxsito.get(i)){
                max=guadagnoxsito.get(i);
                maxi=i;
            }
       
    }
}
