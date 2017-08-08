package com.main.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Utils {
	
	public Scanner ReadFile(String filename)
	{
		FileInputStream file = null;
		try {
			file = new FileInputStream(filename);
		} catch (Exception ex) {
			System.out.println(ex.getMessage());
		}
		Scanner in = new Scanner(new BufferedReader(new InputStreamReader(file)));
		return in;
	}
	
	public ArrayList<Integer> ConvertNumbertoArray(long number)
	{
		ArrayList<Integer> numbers = new ArrayList<>();
		while (number > 0) {
			long n = number % 10;			
			numbers.add((int)n);
			number = number / 10;
		}
		return numbers;
	}
	
	public void WriteFile(String line, String filename)
	{
		BufferedWriter writer = null;
		try
		{
		    writer = new BufferedWriter( new FileWriter(filename,true));		    
		    writer.write(line+"\n");
		}
		catch ( IOException e)
		{
		}
		finally
		{
		    try
		    {
		        if ( writer != null)
		        writer.close( );
		    }
		    catch ( IOException e)
		    {
		    }
		}
	}

}
