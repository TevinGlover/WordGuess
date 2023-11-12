package com.github.zipcodewilmington;

import java.util.Random;

public class RandomWordGenarator {


    String [] randomWord = "fox dog cow cat rat".split(" ");

    String chosenWord = "";
    int wordPlaceInArray= 0;

    public RandomWordGenarator() {

        Random random = new Random();

        wordPlaceInArray = random.nextInt(randomWord.length +1);
        // ^-->adds the range to 1 to 5 for random number picked


    }
// ^-->string array of animal separated by the space in between.


    public String getChosenWord() {

        // i want to take wordPlaceInArray
        chosenWord = String.valueOf(wordPlaceInArray);
        // and the use the number to call the string out from the randomWord

        return chosenWord;
    }
}
