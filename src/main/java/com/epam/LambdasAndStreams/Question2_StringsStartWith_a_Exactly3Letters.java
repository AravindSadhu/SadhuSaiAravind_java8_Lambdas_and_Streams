package com.epam.LambdasAndStreams;

import java.util.*;
import java.util.stream.Collectors;

public class Question2_StringsStartWith_a_Exactly3Letters {
	public static void main(String[] args) 
	{
		String []strArray = {"app","banana","act","mango","awake","amp","air"};
		List<String> strList = Arrays.asList(strArray);
		
		List<String> filterList = filterListStartWithLetterA(strList);
		System.out.println("The Elements in the Array is");
		for(int i=0;i<5;i++)
		{
			System.out.println(strArray[i]);
		}
		System.out.println("The elements which are filtered with starting char as 'a':");
		System.out.println(filterList);
		
	}
	
	public static List<String> filterListStartWithLetterA(List<String> list)
	{
		return list.stream().filter(s -> s.startsWith("a")).filter(s -> s.length() == 3).collect(Collectors.toList());
		
	}
}
