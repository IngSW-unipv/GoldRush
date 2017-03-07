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
 * @author cl418739
 */
public class RiccardoGhioni extends GoldDigger{
    int days=0;
    private String NomeCognome;     //riccardo ghioni 418739
    
    
    
    @Override
    public int chooseDiggingSite(int[] distanza) {
       
        int i=0;
        int x=1000;
        
        if (i<distanza.length){
            
        if(x>distanza[i]){
            
            x=distanza[i];
           
           i++;
            }
        
        return i;
        }
        
        return 0;
    
    
    }
    
    
}
