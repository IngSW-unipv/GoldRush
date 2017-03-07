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
 * @author Delbo
 */
public class DelboLasalvia extends GoldDigger {
//    private int guadagnoGiornoPrima;
//    private int scelta = 3;
//    private int[] diggersGiornoPrima;
//    private int[] guadagniSiti;
    @Override
    public int chooseDiggingSite(int[] distances) {
//        double guadagno = 0, media;

//        for(int i = 0; i<distances.length;i++){
//            this.guadagniSiti[i] = (60-distances[i]/6)/this.diggersGiornoPrima[i];
//            guadagno += this.guadagniSiti[i];
//        }
//        media = guadagno/distances.length;
//        if(this.guadagnoGiornoPrima > media){
//            return this.scelta;
//        }else{
//            for(int i = 0;i<this.guadagniSiti.length;i++){
//                if((this.guadagniSiti[i]-media)>0 && (this.guadagniSiti[i]-media)<1){
//                    this.scelta = i;
//                    return this.scelta;
//                }
//            }
//            int min = 0;
//            for(int i=0;i<this.guadagniSiti.length;i++){
//                if()
//            }
//        }
        return 2;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
//        this.diggersGiornoPrima = diggers;
//        this.guadagnoGiornoPrima = revenue;
    }
    
}
