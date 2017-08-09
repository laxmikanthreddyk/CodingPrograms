package com.main.programs;

import java.util.Scanner;
import com.main.utils.*;

public class PancakeRevenge {
	
	Utils util = new Utils();

	public void PancakeRevengeProgram(String inputFileName, String outputFileName) {
		
		Scanner in = util.ReadFile(inputFileName);
		int t = in.nextInt(); // Scanner has functions to read ints, longs,
								// strings, chars, etc.
		for (int i = 1; i <= t; i++) {
			String line = in.next();	

			int number = PancakeRevenge(line);
			util.WriteFile("Case #"+(i)+": " + number, outputFileName);	
		}
	}
	
	public int PancakeRevenge(String line) {
		int count = 0;		
		if (line.contains("-")) {
			while (line.contains("-")) {
				if(!line.contains("+"))
				{
					return count+1;
				}
				String sb = "";
				boolean flip = false;
				String[] s = line.split("");
				String previous = "";
				for (int i = 0; i < s.length; i++) 
				{
					if (!flip) {
						if (i == 0) {
							sb = sb + s[i];
							previous = s[i];
						} else {
							if (s[i].equals(previous)) {
								sb = sb + s[i];
								previous = s[i];
							} else {																
								if(sb.contains("-"))
								{
									sb = sb.replace('-', '+');
								}
								else
								{
									sb = sb.replace('+', '-');
								}
								sb = sb + s[i];
								flip = true;
								count = count+1;
							}
						}
					}
					else
					{
						sb = sb + s[i];
					}
				}
				line = sb;
			}
		}
		return count;
	}

}
