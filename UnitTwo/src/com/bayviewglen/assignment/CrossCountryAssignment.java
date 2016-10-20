package com.bayviewglen.assignment;

import java.util.Scanner;

public class CrossCountryAssignment {

	public static void main(String[] args) {
		Scanner user = new Scanner(System.in);
		
		final int SECONDSPERMINUTE = 60; 
		
		////////////////////////////////////////////////////////////////Runner 1
		
		System.out.println("Enter your first and last name: ");
		String name = user.nextLine();
		
		System.out.println("Enter your time for mile one (MM:SS.SSS): ");
		String splitOneTimeRunner1 = user.nextLine();
		int minutes1Runner1 = Integer.parseInt(splitOneTimeRunner1.split(":")[0]);
		double seconds1Runner1 = Double.parseDouble(splitOneTimeRunner1.split(":")[1]);
		double Split1SecondsRunner1 = minutes1Runner1 * 60 + seconds1Runner1;
		
		
		
		
		System.out.println("Enter your time for mile two (MM:SS.SSS): ");
		String splitTwoTimeRunner1 = user.nextLine(); 
		int minutes2Runner1 = Integer.parseInt(splitTwoTimeRunner1.split(":")[0]);
		double seconds2Runner1 = Double.parseDouble(splitTwoTimeRunner1.split(":")[1]);
		double Split2SecondsRunner1 = minutes2Runner1 * 60 + seconds2Runner1;
		
		int split2MinutesR1 = (int)(Split2SecondsRunner1 / 60);
		double split2SecondsR1 = Split2SecondsRunner1 % 60;
		
		
	
		System.out.println("Enter your time for mile three (MM:SS.SSS): ");
		String splitThreeTimeRunner1 = user.nextLine(); 
		int minutes3Runner1 = Integer.parseInt(splitThreeTimeRunner1.split(":")[0]);
		double seconds3Runner1 = Double.parseDouble(splitThreeTimeRunner1.split(":")[1]);
		double Split3SecondsRunner1 = minutes3Runner1 * 60 + seconds3Runner1;
		
		int split3MinutesR1 = (int)(Split3SecondsRunner1 / 60);
		double split3SecondsR1 = Split3SecondsRunner1 % 60;
		  

		System.out.println("Total time for race: " + splitThreeTimeRunner1);
		
		
		
				
		
		
		
				
		
		System.out.println("Runner One Summary"); 
		System.out.println("________________________");
		System.out.println("Runner: " + name);
		System.out.println("Split One Time: " + splitOneTimeRunner1);
		System.out.printf("Split Two Time: %d:%.3f\n", minutes2Runner1,seconds2Runner1);
		System.out.printf("Split Three Time: %d:%.3f\n", minutes3Runner1,seconds3Runner1);
		System.out.println("Total Race Time: " + (splitThreeTimeRunner1));
		System.out.println("________________________");
		  
		  

		  
		
		////////////////////////////////////////////////////////////// Runner 2 
		
		System.out.println("Enter your first and last name: ");
		String name2 = user.nextLine();
		
		System.out.println("Enter your time for mile one: ");
		String splitOneTimeRunner2 = user.nextLine();
		int minutes1Runner2 = Integer.parseInt(splitOneTimeRunner2.split(":")[0]);
		double seconds1Runner2 = Double.parseDouble(splitOneTimeRunner2.split(":")[1]);
		
		int split1MinutesR2 = (int)(seconds1Runner2 / 60);
		double split1SecondsR2 = seconds1Runner2 % 60;
		
		
		
		System.out.println("Enter your time for mile two: ");
		String splitTwoTimeRunner2 = user.nextLine(); 
		int minutes2Runner2 = Integer.parseInt(splitTwoTimeRunner2.split(":")[0]);
		double seconds2Runner2 = Double.parseDouble(splitTwoTimeRunner2.split(":")[1]);
		
		int split2MinutesR2 = (int)(seconds2Runner2 / 60);
		double split2SecondsR2 = seconds2Runner2 % 60;
		
		
		System.out.println("Enter your time at the end of the race");
		String totalTimeRunner2 = user.nextLine();
		int minutes3Runner2 = Integer.parseInt(totalTimeRunner2.split(":")[0]);
		double seconds3Runner2 = Double.parseDouble(totalTimeRunner2.split(":")[1]);
		
		
		System.out.println("Runner Two Summary"); 
		System.out.println("________________________");
		System.out.println("Runner: " + name2);
		System.out.println("Split One Time: " + splitOneTimeRunner2);
		System.out.printf("Split Two Time: %d:%.3f\n", minutes2Runner2,seconds2Runner2);
		System.out.printf("Split Three Time: %d:%.3f\n", minutes3Runner2,seconds3Runner2);
		//System.out.println("Total Race Time: " + (splitOneTimeRunner2 +  );
		System.out.println("________________________");
		
		
		/////////////////////////////////////////////////////////////////////Runner 3
		
		System.out.println("Enter your first and last name: ");
		String name3 = user.nextLine();
		
		System.out.println("Enter your time for mile one: ");
		String splitOneTimeRunner3 = user.nextLine();
		int minutes1Runner3 = Integer.parseInt(splitOneTimeRunner3.split(":")[0]);
		double seconds1Runner3 = Double.parseDouble(splitOneTimeRunner3.split(":")[1]);
		
		
		
		System.out.println("Enter your time for mile two: ");
		String splitTwoTimeRunner3 = user.nextLine(); 
		int minutes2Runner3 = Integer.parseInt(splitTwoTimeRunner3.split(":")[0]);
		double seconds2Runner3 = Double.parseDouble(splitTwoTimeRunner3.split(":")[1]);
		
		
		
		
		System.out.println("Enter your time at the end of the race: ");
		String totalTimeRunner3 = user.nextLine();
		int minutes3Runner3 = Integer.parseInt(totalTimeRunner3.split(":")[0]);
		double seconds3Runner3 = Double.parseDouble(totalTimeRunner3.split(":")[1]);
		
		System.out.println("Runner One Summary"); 
		System.out.println("________________________");
		System.out.println("Runner: " + name3);
		System.out.println("Split One Time: " + splitOneTimeRunner3);
		System.out.printf("Split Two Time: %d:%.3f\n", minutes2Runner3,seconds2Runner3);
		System.out.printf("Split Three Time: %d:%.3f\n", minutes3Runner3,seconds3Runner3);
		//System.out.println("Total Race Time: " + (splitOneTimeRunner3 +  );
		System.out.println("________________________");
				
			
				////////////////////////////////////////////////////////////////////Runner 4
				
		System.out.println("Enter your first and last name: ");
		String name4 = user.nextLine();
		
		System.out.println("Enter your time for mile one: ");
		String splitOneTimeRunner4 = user.nextLine();
		int minutes1Runner4 = Integer.parseInt(splitOneTimeRunner4.split(":")[0]);
		double seconds1Runner4 = Double.parseDouble(splitOneTimeRunner4.split(":")[1]);
		
		
		
		System.out.println("Enter your time for mile two: ");
		String splitTwoTimeRunner4 = user.nextLine(); 
		int minutes2Runner4 = Integer.parseInt(splitTwoTimeRunner4.split(":")[0]);
		double seconds2Runner4 = Double.parseDouble(splitTwoTimeRunner4.split(":")[1]);
		
		
		
		
		System.out.println("Enter your time at the end of the race: ");
		String totalTimeRunner4 = user.nextLine();
		int minutes3Runner4 = Integer.parseInt(totalTimeRunner4.split(":")[0]);
		double seconds3Runner4 = Double.parseDouble(totalTimeRunner4.split(":")[1]);
		
		
		System.out.println("Runner One Summary"); 
		System.out.println("________________________");
		System.out.println("Runner: " + name4);
		System.out.println("Split One Time: " + splitOneTimeRunner4);
		System.out.printf("Split Two Time: %d:%.3f\n", minutes2Runner4,seconds2Runner4);
		System.out.printf("Split Three Time: %d:%.3f\n", minutes3Runner4,seconds3Runner4);
		//System.out.println("Total Race Time: " + (splitOneTimeRunner4 +  );
		System.out.println("________________________");
		
		////////////////////////////////////////////////////////////////////////////Runner 5
		
		System.out.println("Enter your first and last name: ");
		String name5 = user.nextLine();
		
		System.out.println("Enter your time for mile one: ");
		String splitOneTimeRunner5 = user.nextLine();
		int minutes1Runner5 = Integer.parseInt(splitOneTimeRunner5.split(":")[0]);
		double seconds1Runner5 = Double.parseDouble(splitOneTimeRunner5.split(":")[1]);
		
		
		
		System.out.println("Enter your time for mile two: ");
		String splitTwoTimeRunner5 = user.nextLine(); 
		int minutes2Runner5 = Integer.parseInt(splitTwoTimeRunner5.split(":")[0]);
		double seconds2Runner5 = Double.parseDouble(splitTwoTimeRunner5.split(":")[1]);
		
		
		
		
		System.out.println("Enter your time at the end of the race: ");
		String totalTimeRunner5 = user.nextLine();
		int minutes3Runner5 = Integer.parseInt(totalTimeRunner5.split(":")[0]);
		double seconds3Runner5 = Double.parseDouble(totalTimeRunner5.split(":")[1]);
		
		
		System.out.println("Runner One Summary"); 
		System.out.println("________________________");
		System.out.println("Runner: " + name5);
		System.out.println("Split One Time: " + splitOneTimeRunner5);
		System.out.printf("Split Two Time: %d:%.3f\n", minutes2Runner5,seconds2Runner5);
		System.out.printf("Split Three Time: %d:%.3f\n", minutes3Runner5,seconds3Runner5);
		//System.out.println("Total Race Time: " + (splitOneTimeRunner5 +  );
		System.out.println("________________________");
				
		
		
		
		 System.out.println("");
	     System.out.printf("%10s %30s %12s %12s %12s\n", "Runner #", "Full Name", "Split One", "Split Two", "Total Time");
	     System.out.println("");
	     System.out.printf("%10d %30 %12 %12 %12\n", 1, name , splitOneTimeRunner1, splitTwoTimeRunner1); //runner1finalTime
	     System.out.printf("%10d %30 %12 %12 %12\n", 2, name2 , splitOneTimeRunner2, splitTwoTimeRunner2); //runner2finalTime
	     System.out.printf("%10d %30 %12 %12 %12\n", 3, name3 , splitOneTimeRunner3, splitTwoTimeRunner3); //runner3finalTime
	     System.out.printf("%10d %30 %12 %12 %12\n", 4, name4, splitOneTimeRunner4, splitTwoTimeRunner4); //runner4finalTime
	     System.out.printf("%10d %30 %12 %12 %12\n", 5, name5, splitOneTimeRunner5, splitTwoTimeRunner5); //runner5finalTime 
	     
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
