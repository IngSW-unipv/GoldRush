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
 * @author Gaetano La Salvia
 */
public class LaSalviaMarco extends GoldDigger {
    private int scelta = -3;
    private int sceltaPrecedente;
    private int sommaMieiGuadagni = 0 ;
    private int day = 1;
    private int mediaGuadagni;
    private int[] guadagniGiornoPrima, diggersDayBefore, distanze;
    private int guadagnoMioPrecedente;
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        if(this.scelta <0){
            this.sceltaPrecedente = 1;
            this.scelta = 1;
            return this.scelta;
        }
       int media = this.calcolaMediaGuadagni();
       this.sommaMieiGuadagni += this.calcolaGudagno();
       
       if(this.day>1){
           this.mediaGuadagni = this.sommaMieiGuadagni/this.day;
       }
       if(this.checkMedia())
           return this.scelta;
       else{
           if(this.trovaSitoConMenoGente()>4){
                if(this.sommaMieiGuadagni<=this.calcolaPartecipanti()*4){
                    this.sceltaPrecedente = this.scelta;
                    this.scelta =  2;
                }else{
                    this.sceltaPrecedente = this.scelta;
                    this.scelta = 4;
                }
           }else
               this.sceltaPrecedente = this.scelta;
               this.scelta = this.trovaSitoConMenoGente();
       }

       this.day++;
       return this.scelta;
    }
    
    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        this.guadagniGiornoPrima = new int[distances.length];
        this.diggersDayBefore = new int[diggers.length];
        this.distanze = new int[distances.length];
        this.guadagnoMioPrecedente = revenue;
        this.diggersDayBefore = diggers;
        this.distanze = distances;
    }
    private int trovaSitoConMenoGente(){
       int migliore = this.calcolaPartecipanti();
       for(int i=0;i<this.diggersDayBefore.length;i++){
           if(this.diggersDayBefore[i]<migliore)
               migliore = this.diggersDayBefore[i];
       }
       return migliore;
    }
    
    private int calcolaMediaGuadagni(){
        int media = 0;
        for(int i=0; i<distanze.length;i++){
            if(this.diggersDayBefore[i]==0)
                continue;
            else
                this.guadagniGiornoPrima[i] = (60-distanze[i]/6)/this.diggersDayBefore[i];
            media += this.guadagniGiornoPrima[i]/this.distanze.length;
        }
    }
    private int calcolaPartecipanti(){
        int p = 0;
        for(int i=0; i<this.diggersDayBefore.length;i++){
            p += this.diggersDayBefore[i];
        }
        return p;
    }
    private double calcolaGudagno(){
        double guadagno =  (60 -(this.distanze[this.scelta]/6) ) / this.diggersDayBefore[this.scelta];
        return guadagno;
    }
    private boolean checkMedia(){
        if(this.calcolaGudagno()>=this.mediaGuadagni)
            return true;
        else
            return false;
    }
    
}
