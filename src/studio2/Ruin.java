package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stu
		Scanner in = new Scanner(System.in);
	
		System.out.println("What is your starting amount?");
		double startAmount = in.nextDouble();
		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		System.out.println("What is your win probability");
		double winProbability = in.nextDouble();
		System.out.println("How many days are you playing?");
		int totalSimulations = in.nextInt();
		int roundsPlayed = 0;
		
		double count = startAmount;
		
	for (int i = 0; i < totalSimulations; i++)
	{
		count = startAmount;
		while (count > 0 && count < winLimit)
		{
		double random = Math.random();
		roundsPlayed++;
				if (random <= winProbability)
				{
					count++;
					System.out.println("Success! $$ You now have " + count + " dollars.");
				}
				else 
				{
					count--;
					System.out.println("FAILURE! You now have " + count + " dollars.");
				}
		}
		if (count == 0) 
		{
			System.out.println("RUIN! YOU HAVE NO MONEY");
		}
		if (count >= winLimit)	
		{
			System.out.println("You Won. Stop Gambling. Success!");
		}
	}
		
		
	System.out.println("You have played for " + totalSimulations + " days.");
	System.out.println("You have played " + roundsPlayed + " rounds.");
	

	
		
	}
	}


