/*
* [MultipleChoiceFlashCards].java
* Author: [Austin Wilburn]
* Submission Date: [9/26/2014]
*
* Purpose: WITHOUT LOOPS, The program outputs computer science quiz questions and 
* receives answers from the user, who receives a score after every
* question and after the final third question gives a end of game 
* statement based on the users score. Invalid answers end the game 
* with no score.

*/
import java.util.Scanner;
public class MultipleChoiceFlashCards {

	public static void main(String[] args) {
		//creating scanner for input, outputting welcome message, 
		//and declaring/initializing strings and integers.
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Welcome to CSCI 1301 Multiple Choice Flash Cards!");
		String questionAndChoices, choiceA, choiceB, choiceC, choiceD, answer, userAnswer;
		int userScore, possibleScore;
		possibleScore = 1;
		userScore = 0;
		//retrieving a question, it's choices, and the answer
		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		//outputting the question and telling user to enter a answer
		System.out.print("\n" + questionAndChoices);
		System.out.println("Enter your answer (a-d):");
		//inputting answer, setting it to the first character in the string
		userAnswer = keyboard.next();
		userAnswer = userAnswer.substring(0,1);
		//checking if the answer is valid and assigning it to true or false
		boolean invalidAnswerCheck = (!(userAnswer.equalsIgnoreCase("a")) &&  !(userAnswer.equalsIgnoreCase("b")) 
				&& !(userAnswer.equalsIgnoreCase("c")) && !(userAnswer.equalsIgnoreCase("d")));
		
		//setting the question's answer to its letter
		if (choiceA.equalsIgnoreCase(answer)) {
			answer = "A";
		}
		else if (choiceB.equalsIgnoreCase(answer)) {
			answer = "B";
		}
		else if (choiceC.equalsIgnoreCase(answer)) {
			answer = "C";
		}
		else if (choiceD.equalsIgnoreCase(answer)) {
			answer = "D";
		}
		//user answer is not valid, output message and exit
		if (invalidAnswerCheck) {
			System.out.println("Invalid Answer.");
			System.out.println("An answer must begin with a, A, b, B, c, C, D, or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}
		//answer is correct increase score by 1, and output message and current score
		else if (answer.equalsIgnoreCase(userAnswer)) {
			System.out.println("Correct Answer");
			userScore++;
			System.out.println("Your score: " + userScore + " out of " + possibleScore + " point(s)");
		}
		//answer is wrong, output message and current score
		else {
			System.out.println("Incorrect Answer!");
			System.out.println("Your score: " + userScore + " out of " + possibleScore + " point(s)");
		}
		
		//retrieving a second question, it's choices, and the answer
		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		//increasing the possible score to 2 since its the 2nd question
		possibleScore++;
		//outputting the question and telling user to enter a answer
		System.out.print("\n" + questionAndChoices);
		System.out.println("Enter your answer (a-d):");
		//inputting answer, setting it to the first character in the string
		userAnswer = keyboard.next();
		userAnswer = userAnswer.substring(0,1);
		//checking if the answer is valid and assigning it to true or false
		invalidAnswerCheck = (!(userAnswer.equalsIgnoreCase("a")) &&  !(userAnswer.equalsIgnoreCase("b")) 
				&& !(userAnswer.equalsIgnoreCase("c")) && !(userAnswer.equalsIgnoreCase("d")));
		
		//setting the question's answer to its letter
		if (choiceA.equalsIgnoreCase(answer)) {
			answer = "A";
		}
		else if (choiceB.equalsIgnoreCase(answer)) {
			answer = "B";
		}
		else if (choiceC.equalsIgnoreCase(answer)) {
			answer = "C";
		}
		else if (choiceD.equalsIgnoreCase(answer)) {
			answer = "D";
		}
		
		//if user answer is not valid, output message and exit
		if (invalidAnswerCheck) {
			System.out.println("Invalid Answer.");
			System.out.println("An answer must begin with a, A, b, B, c, C, D, or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}
		//if answer is correct increase score by 1, and output message and current score
		else if (answer.equalsIgnoreCase(userAnswer)) {
			System.out.println("Correct Answer");
			userScore++;
			System.out.println("Your score: " + userScore + " out of " + possibleScore + " point(s)");
		}
		//if answer is wrong, output message and current score
		else  {
			System.out.println("Incorrect Answer!");
			System.out.println("Your score: " + userScore + " out of " + possibleScore + " point(s)");
		}
		
		//retrieving a third question, it's choices, and the answer
		questionAndChoices = MultipleChoiceFlashCardsZoeyGameEngine001.getQuestionAndChoices();
		choiceA = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceA();
		choiceB = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceB();
		choiceC = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceC();
		choiceD = MultipleChoiceFlashCardsZoeyGameEngine001.getChoiceD();
		answer = MultipleChoiceFlashCardsZoeyGameEngine001.getAnswer();
		//increasing the possible score to 3 since its the 3nd question
		possibleScore++;
		//outputting the question and telling user to enter a answer
		System.out.print("\n" + questionAndChoices);
		System.out.println("Enter your answer (a-d):");
		//inputting answer, setting it to the first character in the string
		userAnswer = keyboard.next();
		userAnswer = userAnswer.substring(0,1);
		//checking if the answer is valid and assigning it to true or false
		invalidAnswerCheck = (!(userAnswer.equalsIgnoreCase("a")) &&  !(userAnswer.equalsIgnoreCase("b")) 
				&& !(userAnswer.equalsIgnoreCase("c")) && !(userAnswer.equalsIgnoreCase("d")));
		
		//setting the question's answer to its letter
		if (choiceA.equalsIgnoreCase(answer)) {
			answer = "A";
		}
		else if (choiceB.equalsIgnoreCase(answer)) {
			answer = "B";
		}
		else if (choiceC.equalsIgnoreCase(answer)) {
			answer = "C";
		}
		else if (choiceD.equalsIgnoreCase(answer)) {
			answer = "D";
		}	
		
		//if user answer is not valid, output message and exit
		if (invalidAnswerCheck) {
			System.out.println("Invalid Answer.");
			System.out.println("An answer must begin with a, A, b, B, c, C, D, or d.");
			System.out.println("Game Over!");
			System.exit(0);
		}
		//if answer is correct increase score by 1, and output message and current score
		else if (answer.equalsIgnoreCase(userAnswer)) {
			System.out.println("Correct Answer");
			userScore++;
			System.out.println("Your score: " + userScore + " out of " + possibleScore + " point(s)");
		}
		//if answer is wrong, output message and current score
		else  {
			System.out.println("Incorrect Answer!");
			System.out.println("Your score: " + userScore + " out of " + possibleScore + " point(s)");
		}
		
		//outputting final score
		System.out.println("\nYour final score: " + userScore + " out of " + possibleScore + " point(s)");
		
		//outputting end of game statement based on users score
		if (userScore == 0 || userScore == 1) {
			System.out.println("Your computer science wit needs sharpening.");
		}
		else if (userScore == 2) {
			System.out.println("Your computer science wit is sharp.");
		}
		else if (userScore == 3) {
			System.out.println("Your computer scence wit is as sharp as Occam's razor.");
		}
		
		//outputting game over and closing input
		System.out.println("Game Over!");
		keyboard.close();
	}
}
