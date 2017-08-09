package com.main;

import java.io.*;
import java.util.Scanner;

import com.main.programs.*;

public class MainProgram {

	public static void main(String[] args) {
         
		//ProblemA();
		ProblemB();
	}
	public static void ProblemA()
	{
		CountingSheep c = new CountingSheep();
		c.CountSheepProgram("C:\\GoogleProgramsFiles\\Input\\A-large-practice.in","C:\\GoogleProgramsFiles\\Output\\A-large-practice.out");
	}
	
	public static void ProblemB()
	{
		PancakeRevenge p = new PancakeRevenge();
		//System.out.println(p.PancakeRevenge("+--++-+--"));
		p.PancakeRevengeProgram("/Users/laxmikanth/development/googleprograms/input/B-large-practice.in","/Users/laxmikanth/development/googleprograms/output/B-large-practice.out");
	}
	

}
