
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
 * @author ABBATE JAMES 427511 TRIPODI GIOVANNA 427195
 */
public class AbbateJames extends GoldDigger{
    //Variabile che ritornerà l'indice del sito scelto
    private int sito;
        
    @Override
    public int chooseDiggingSite(int[] distances) {
        return sito;
    }
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) { 
       double g[] = new double[distances.length];
       double max = 0;
       
       //Scorriamo fra i siti in un giorno
       for(int i=0; i<distances.length; i++){
           //Calcolo il guadagno di tale sito
           g[i] = 5*((12 - ((2*distances[i])/60))/diggers[i]);
       }
       //Scorriamo nel vettore dei guadagni
       for(int j=0; j<g.length; j++){
           //Cerco quello con guadagno maggiore e ne catturo l'indice
           if (g[j] > max){
               max = g[j];
               sito = j;
           }
       }
       
    }

}
