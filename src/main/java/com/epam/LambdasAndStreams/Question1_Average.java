package com.epam.LambdasAndStreams;

import java.util.*;

public class Question1_Average {
	public double getAvg(List<Integer> list)
	{
		double average = 0.0f;		
		IntSummaryStatistics summaryStats = list.stream().mapToInt((a) -> a).summaryStatistics();
		average = (double) summaryStats.getAverage();
		return average;
	}
	public static void main(String[] args) 
	{
		List <Integer>list = new ArrayList<Integer>();
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number of elements");
		int numberOfElements = scan.nextInt();
		
		System.out.println("Enter the elements");
		for(int i = 0;i < numberOfElements;i++)
		{
			list.add(scan.nextInt());
		}
		System.out.println("The list of elements are:");
		System.out.println(list);
		
		Question1_Average average = new Question1_Average();
		System.out.println("The Average value of the list is:");
		System.out.println(average.getAvg(list));
		
		scan.close();
	}

}
