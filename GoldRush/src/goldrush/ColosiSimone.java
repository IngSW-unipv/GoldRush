/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import static java.lang.Math.abs;

/**
 *
 * @author Simone
 */
public class ColosiSimone extends GoldDigger{
    
    protected int revenue;
    protected int[] distances;
    protected int[] diggers;
    protected int posizione=3;
    protected final int[] tempi={30,140,200,240,280,310};
    
    public ColosiSimone(){
        revenue=3;
        distances=new int[6];
        diggers=new int[6];
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        
        
        return posizione;
    }

    @Override
    public void dailyOutcome(int revenue, int[] distances, int[] diggers) {
        this.revenue=revenue;
        this.distances=distances.clone();
        this.diggers=diggers.clone();
   
//        int i=0;
//        int max=0;
//        int count=0;
//                
//        for(Integer c:diggers){
//            if(c>max){
//                max=c;
//                count=i;
//            }
//            i++;
//        }
//        posizione=count;
       
       double[] g;
       g=new double[6];
       for(int i=0;i<diggers.length;i++)
         g[i]=5*((12-(double)tempi[i]*(2/60))/(double)diggers[i]);
       
       double media=0;
       for(Double c:g)
           media+=c;
       
       media=media/6;
       
       double[] error=new double[6];       
       for(int i=0;i<g.length;i++){
           error[i]=abs(g[i]-media);
           System.out.println(i+"  "+(int)error[i]);
       }
       
       int tmp=0;
       for(int i=0;i<error.length;i++)
           if(i==0)
               tmp=(int)error[i];
           else    
                if((int)error[i]<tmp)
                    tmp=(int)error[i];
       
       for(int i=5;i<=0;i--)
           if((int)error[i]<=tmp)
               posizione=i;
    }
}
