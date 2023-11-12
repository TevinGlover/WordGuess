package com.github.zipcodewilmington;

import org.junit.Assert;
import org.junit.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.*;

class RandomWordGenaratorTest {
    @org.junit.jupiter.api.Test
    public void testGetRandomWordNumber(){
// need the min and max value that can be selected in the word array

        int min = 1;// need the number to be returned in between 0 and 5,
        int max = 5;
        int wordPlaceInArray= 0;
        int actual = 0;
        RandomWordGenarator RandomWordGenarator = new RandomWordGenarator();
        System.out.println(wordPlaceInArray);
        Assert.assertTrue(actual <= max );// anything that returns with more then five is a failed test
        Assert.assertNotNull(RandomWordGenarator);

    }



    @Test
    public void testgetChosenWord(){

    Random random = new Random();

    wordPlaceInArray = random.nextInt(randomWord.length +1);
    // ^-->adds the range to 1 to 5 for random number picked


        }




    }

}


