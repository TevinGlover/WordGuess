package com.github.zipcodewilmington;


/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
 public static void main ( String [] args ) {

 }
    String[] animalsWithThreeLetters = "cat dog rat hen fox".split(" "); //array from 0 - 4
    int random = (int) (Math.random() * animalsWithThreeLetters.length); // choose a random number from array

    public String randomAnimalName() {
        int arrayNum = random;
        ; // the number selected form the random generator

        String animalPicked = animalsWithThreeLetters[arrayNum]; // array number to String

        System.out.println(animalPicked);

        return animalPicked;
    }

//while (you want to play) { //outer loop
    public void startOfGame() {
        for (int i = 0; i < randomAnimalName().length(); i++){
            System.out.println( randomAnimalName());
        }
        return;
        // start the game
    }
    // set word guessed to false
    // while (the word isn't guessed) { //inner loop
    //  print the current game state
//ask for a guess (a single letter)

    // check the letter against the word
    //using the two character arrays discussed above
    // increment the number of guesses

    // if the word is guessed
    //player won, congrats

    // if too many guesses
    //player lost, too bad, quit game

    // ask if player wants to play again

    // display game over


}













