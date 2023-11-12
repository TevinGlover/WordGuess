package com.github.zipcodewilmington;


import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {
 public static void main ( String [] args ) {

     //Scanner playerCharGuess = new Scanner(); // player inputs

     String[] animalsWithThreeLetters = "cat dog rat hen fox".split(" "); //array from 0 - 4
     int random = (int) (Math.random() * animalsWithThreeLetters.length); // choose a random number from array

     int arrayNum = random;
     // the number selected form the random generator

     String animalPicked = animalsWithThreeLetters[arrayNum]; // array number to String

     //System.out.println(animalPicked); // this check the random name is working

     char[] animalChars = animalPicked.toCharArray(); //the ANIMAL split into chars


     //while (you want to play) { //outer loop

     System.out.println("* welcome to animal word guess *");
     Scanner playerAnwser = new Scanner(System.in);// start the game
     System.out.println("Lets play A GAME !!");
     playerAnwser.nextLine();
     if (playerAnwser.equals("YES".compareToIgnoreCase("yes"))) {
         for (int i = 0; i <= animalChars.length; i++) {


         }


     } else {
         System.out.println(" thank you for your answer Bye!");
     }

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














