package com.github.zipcodewilmington;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class Hangman {


    public static void main(String[] args) {
        Scanner playerAnwser = new Scanner(System.in);// start the game
        //Scanner playerCharGuess = new Scanner(); // player inputs
      String[]  animalsWithThreeLetters = "cat dog rat hen fox".split(" ");


        System.out.println("* Welcome To Animal Word Guess *" + " \n" +"  ****************************");
        System.out.println("  Lets play A GAME !!");
        System.out.println("  TYPE BELOW: (Yes or No)");
        playerAnwser.nextLine();
        List<Character> playerGuess = new ArrayList<>();


        if (playerAnwser.equals("YES".compareToIgnoreCase("yes"))) {
            System.out.println(" Game Starting Now"); // StartGame();
        } else  {
            System.out.println(" thank you for your answer Bye!");
            System.out.println(" Game Over !!");
        }
    }
    //*****************************************************************
    public static String RandRandomPick(String[] Array) {
         // for any string array
        int random = (int) (Math.random() * Array.length); // choose a random number from array
        int arrayNum = random; // the number selected form the random generator


        return Array[arrayNum];
    }

    public static void  printWord(String word, List<Character> playerGuess) {


        for (int i = 0; i < word.length(); i++) {
            if (playerGuess.contains(word.charAt(i))) {
                System.out.print(word.charAt(i));
            } else {
                System.out.print("_");

            }

        }
    }

//     System.out.println(animalPicked); // this check the random name is working
//
//     char[] animalChars = animalPicked.toCharArray(); //the ANIMAL split into chars

//***********************************************************************************************
     //while (you want to play) { //outer loop


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
















