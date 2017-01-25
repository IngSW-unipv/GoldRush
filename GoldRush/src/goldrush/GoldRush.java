/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */
package goldrush;

import java.util.Map;

/**
 *
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class GoldRush {

    static final int DEFAULT_DAYS = 10;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Town town = new Town();
        for (int d = 0; d < 10; d++)
            town.simulateDay();
       
        int n = 0;
        for (Map.Entry<GoldDigger, Integer> e : town.richestDiggers()) {
            n++;
            System.out.print(n);
            System.out.println("\t" + e.getKey().getName() + "\t" + e.getValue());
        }
    }
}
