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
 * A digger who randoly selects its digging site.
 * 
 * @author Claudio Cusano <claudio.cusano@unipv.it>
 */
public class RandomDigger extends GoldDigger {
    
    Random randomGenerator;
    
    RandomDigger() {
        super("RandomDigger");
        randomGenerator = new Random();
    }
    
    @Override
    public int chooseDiggingSite(int[] distances) {
        // Each site has the same chance of being chosen independently on its distance.
        return randomGenerator.nextInt(distances.length);
    }
}
