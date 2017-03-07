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
    /*
    DELBO 428034
    LA SALVIA 426730
    */
    private int guadagnoGiornoPrima;
    private int scelta = 2;
    private int[] diggersGiornoPrima;
    private int[] guadagniSiti;
    @Override
    public int chooseDiggingSite(int[] distances) {
        double guadagno = 0, media;
        this.guadagniSiti = new int[distances.length];
        for(int i = 0; i<distances.length;i++){
            if(this.diggersGiornoPrima==null){
                return this.scelta;
            }
            if(this.diggersGiornoPrima[i]==0){
                return i;
            }

            this.guadagniSiti[i] = (60-distances[i]/6)/this.diggersGiornoPrima[i];
            guadagno += this.guadagniSiti[i];
        }
        media = guadagno/distances.length;
        if(this.guadagnoGiornoPrima >= media){
            return this.scelta;
        }else{
            for(int i = 0;i<this.guadagniSiti.length;i++){
                if((this.guadagniSiti[i]-media)>0 && (this.guadagniSiti[i]-media)<4.2){
                    this.scelta = i;
                    return this.scelta;
                }
            }
            int max = 0;
            for(int i =0; i<this.guadagniSiti.length; i++){
                if(this.guadagniSiti[i]>max){
                    max=this.guadagniSiti[i];
                }
            }
            for(int i=0;i<this.guadagniSiti.length;i++){
                if(max -this.guadagniSiti[i]>=0 && (max -this.guadagniSiti[i])<8){
                    return i;
                }
            }
        }
        return this.scelta;

    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        this.diggersGiornoPrima = diggers;
        this.guadagnoGiornoPrima = revenue;
    }
    
}
