package com.epam.LambdasAndStreams;

import java.util.*;
import java.util.function.Predicate;

public class Question3_PalindromeStrings {
	public static boolean isPalindrome(String word)
	{
		if(word.equals(new StringBuffer(word).reverse().toString()))
			return true;
		return false;
	}
	public static void main(String[] args) 
	{
		String strArray[] = {"1001","0101","0110","1111","0000","madam","tomato","12321","12341","racecar","malayalam"};
		List<String> strList = Arrays.asList(strArray);
		List<String> resultList = Question3_PalindromeStrings.getPalidromeList(strList, Question3_PalindromeStrings::isPalindrome);
		System.out.println("The Values in the Array is");
		for(int i=0;i<5;i++)
		{
			System.out.println(strArray[i]);
		}
		System.out.println("\nThe Palidromes in the list are:"+resultList);		
	}

	private static List<String> getPalidromeList(List<String> strList, Predicate<String> predicate) 
	{
		List<String> finalList = new ArrayList<>();
		for(String str : strList)
		{
			if(predicate.test(str))
			{
				finalList.add(str);
			}
		}
		return finalList;
	}

}
