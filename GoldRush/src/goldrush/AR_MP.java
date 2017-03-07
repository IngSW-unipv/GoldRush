/*
 I migliori!
Marco Prina(418308) e Argirov Lyubomir(420038)
 */
package goldrush;

/**
 *
 * @author cl420038
 */
public class AR_MP extends GoldDigger {
    private int gruppo=2;
    
    private void aggiornagruppo(){
        gruppo--;
        if(gruppo==0)
            gruppo=3;
    }

    @Override
    public int chooseDiggingSite(int[] distances) {
        int nscelto;
        if(gruppo==1)
            nscelto=0;
        else if(gruppo==2)
            nscelto=random(1,2);
        else
            nscelto=random(3, 5);
        aggiornagruppo();
        return nscelto;
    }
    
    private int random(int min, int max){
        int reange=max-min;
        return arrotonda(Math.random()*reange)+min;
    }
    
    private int arrotonda(double numero){
         return (int)Math.round(numero);
    }
}
