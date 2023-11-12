package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

class RandomWordGenaratorTest {
    @Test
    public void testGetRandomWordNumber(){
// need the min and max value that can be selected in the word array

        int min = 1;
        int max = 5;
        int wordPlaceInArray = 0;
        int actual;
        RandomWordGenarator RandomWordGenarator = new RandomWordGenarator();



        // need the number to be returned in between 0 and 5,
        // anything that returns with more then five is a failed test



        Assert.assertTrue(actual <= max );
        Assert.assertTrue(actual >= min);

    }
}


