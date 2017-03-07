/*
 I migliori!
Marco Prina(418308) e Argirov Lyubomir(420038)
 */
package goldrush;

import java.util.Random;

/**
 *
 * @author cl420038
 */
public class ARGIROV_PRINA extends GoldDigger {
    private int gruppo=2;
    private int guadagnoxsito[]= new int[10];
    private int max=999, maxi=0, sec=0, seci=0;
    private void aggiornagruppo(){
        gruppo--;
        if(gruppo==0)
            gruppo=3;
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
//        int nscelto;
//        if(gruppo==1)
//            nscelto=0;
//        else if(gruppo==2)
//            nscelto=randInt(1,2);
//        else
//            nscelto=randInt(3, 5);
//        aggiornagruppo();
        return maxi;
    }
//    
//    private int random(int min, int max){
//        int reange=max-min;
//        return arrotonda(Math.random()*reange)+min;
//    }
//    
//    public int randInt(int min, int max) {
//        Random rand = new Random();
//        int randomNum = rand.nextInt((max - min) + 1) + min;
//        return randomNum;
//}
//    
//    private int arrotonda(double numero){
//         return (int)Math.round(numero);
//    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
        for(int i=0; i<distances.length ; i++){
            if(diggers[i]==0){
                diggers[i]=1;
            }
                guadagnoxsito[i]=5*((12-2*distances[i]/60)/diggers[i]);
            
        }
        
        for(int i=0; i<distances.length ; i++)
            if(max>guadagnoxsito[i]){
                max=guadagnoxsito[i];
                maxi=i;
            }
        for(int i=0; i<distances.length ; i++)
            if(sec<guadagnoxsito[i] && sec!=max){
                sec=guadagnoxsito[i];
                seci=i;
            }
    }
}
