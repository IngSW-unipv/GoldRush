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
 * @author Fabio Forni (418700)
 * @author Aurora Castro (426591)
 */
public class ForniFabio extends GoldDigger {

    @Override
    public int chooseDiggingSite(int[] distances) {
        for (int i = 0; i < distances.length; i++) {
            if (distances[i] == 240) {
                return i;
            }
        }
        return new RandomDigger().chooseDiggingSite(distances);
    }

}
