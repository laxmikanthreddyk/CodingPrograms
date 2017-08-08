package com.main.programs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Scanner;

import com.main.utils.*;

public class CountingSheep {

	Utils util = new Utils();
	
	public long countSheep(long N) {
		long number=0;
		ArrayList<Integer> digits = new ArrayList<>();
		digits.addAll(Arrays.asList(0, 1, 2, 3, 4, 5, 6, 7, 8, 9));		
		number = N;
		boolean found = false;
		for (int i = 1; i <= 100; i++) {
			number = N*i;
			ArrayList<Integer> numbers = util.ConvertNumbertoArray(number);
			for (int n : numbers) {
				if (digits.contains(n)) {
					Object o = (Integer)n;
					digits.remove(o);
					if (digits.size() == 0) {
						found = true;
						return N*i;
					}
				}
			}
		}
		if(!found)
		{
		  number = -1;
		}
		return number;
	}
	
	public void CountSheepProgram(String inputFileName, String outputFileName) {
		
		Scanner in = util.ReadFile(inputFileName);
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.
		for (int i = 1; i <= t; i++) {
			int n = in.nextInt();		

			long number = countSheep(n);
			if (number > 0) {
				util.WriteFile("Case #"+(i)+": " + number, outputFileName);
				System.out.println(number);
			} else {
				util.WriteFile("Case #"+(i)+": INSOMNIA", outputFileName);
				System.out.println("INSOMNIA");
			}
		}
	}

}
