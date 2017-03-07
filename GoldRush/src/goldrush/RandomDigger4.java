package goldrush;


import java.util.Random;

/*
 * Code used in the "Software Engineering" course.
 *
 * Copyright 2017 by Claudio Cusano (claudio.cusano@unipv.it)
 * Dept of Electrical, Computer and Biomedical Engineering,
 * University of Pavia.
 */

/**
 * A digger who randomly selects its digging site among the first
 * four.
 * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class RandomDigger4 extends GoldDigger {
    
    Random randomGenerator;
    
    RandomDigger4() {
        randomGenerator = new Random();
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
	if (distances.length < 4)
	    return 0;
        return randomGenerator.nextInt(4);
    }
}
