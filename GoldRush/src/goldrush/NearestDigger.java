package goldrush;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/**
 * A digger that always chooses the closest digging site.
 * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class NearestDigger extends GoldDigger {

    @Override
    public int chooseDiggingSite(int[] distances) {
        int chosen = 0;
	for (int i = 1; i < distances.length; i++)
	    if (distances[i] < distances[chosen])
		chosen = i;
        return chosen;
    }
}
