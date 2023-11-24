package com.github.zipcodewilmington;
import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static com.github.zipcodewilmington.Hangman.RandRandomPick;
import static com.github.zipcodewilmington.Hangman.printWord;

/**
 * @author xt0fer
 * @version 1.0.0
 * @date 5/27/21 11:02 AM
 */
public class HangmanTest {

    @Test
    public void testrandomAnimalName1() {
        String[] randomWord = {"fox", "bat", "cat" };
        String word = RandRandomPick(randomWord);
        String actual = word;
        String expected = "bat";

        Assert.assertSame(expected, actual);

    }


    @Test
    public void testrandomAnimalName2() { // check if it can return on of the words

        String[] randomWord = {"fox", "bat", "cat" };
        String word = RandRandomPick(randomWord);
        String pickOne = "fox ";
        String pickTwo = "bat";
        String pickThree = "cat";
        String actual = word;
        boolean isItRandom = Boolean.parseBoolean(String.valueOf(actual.equals(pickOne)
                || actual.equals(pickTwo) || actual.equals(pickThree)));
        Assert.assertTrue(isItRandom); // this was very annoying to do ( i will have to remember this pain)
    }

    @Test
    public void TestCompareChar() {
        List<Character> expected = new ArrayList<>();
        expected.add('c');
        expected.add('a');
        expected.add('t');
        String hidenWord = "cat";

       ArrayList actual = new ArrayList<>();
       actual =  printWord(hidenWord,expected);

        Assert.assertEquals(actual,expected);

    }
}
//    @Test
//    public void testIfGuessAreCorrect() {
//        Character guess = 'f';
//        Character expected = 'f';
//        Boolean isCorrect = GuessAreCorrect(guess,expected);
//        Assert.assertTrue(isCorrect);
//    }
//
//    @Test
//    public void testIfGuessAreWrong() {
//        char guess = 't';
//       char expected = 'f';
//        Boolean isWrong = GuessAreWrong(guess,expected);
//        Assert.assertTrue(isWrong);
//    }
//
//    @Test
//    public void testIfAllCorrect() {
//        char[] guess = "bat".toCharArray();
//        String word = "bat";
//        IfAllCorrect(word, guess);
//        boolean isWinner;
//        Assert.assertTrue(isWinner);
//    }
//
//
//
//    @Test
//    public void testTurnCount(){
//    char fristGuess = 'c';
//    char secondGuess = 'a';
//   int expected = TurnCount(fristGuess,secondGuess );
//     int actual = 2;
//     Assert.assertArrayEquals(expected , actual);
//    }
//
//    @Test
//    public void testCountUnderLimit(){
//        int guessCount = 3;
//
//        int maxNuberOfTurns = 4;
//        int actual = TurnCountUnderLimit(guessCount );
//        boolean expected =  actual < maxNuberOfTurns;
//
//
//        Assert.assertTrue(expected);
//    }
//
//    @Test
//    public void testCountOverLimit(){
//        int guessCount = 5;
//
//        int maxNuberOfTurns = 4;
//        int actual = TurnCountOverLimit(guessCount );
//        boolean expected =  actual < maxNuberOfTurns;
//
//
//        Assert.assertTrue(expected);
//    }
//
//    @Test
//    public void TestWin(){
//       int count =0;
//      Boolean isItAWin  = Win(CountUnderLimit(), GuessAreCorrect());
//       Assert.assertTrue(isItAWin);
//    }
//
//    @Test
//    public void TestLost(){
//        int count =0;
//        Boolean isItsALoss  = Lost(turnCountOverLimit());
//        Assert.assertTrue(isItsALoss);
//    }
//}
