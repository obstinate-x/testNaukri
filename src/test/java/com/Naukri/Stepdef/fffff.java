package com.Naukri.Stepdef;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Pattern;

public class fffff {

	public static void main(String[] args) {
		
		System.out.println(Pattern.matches("s", "abhishek"));
	
	
				
	}



}


 class gggg{
	
	public void dd() {
		List<Integer> num = null;
		
		List<Integer> positive = new ArrayList<Integer>();
		List<Integer> negative = new ArrayList<Integer>();
		 
			Scanner scan = new Scanner(System.in);
			System.out.println("Enter the list of number");
			
			while(scan.hasNextInt()) {			
				num.add(scan.nextInt());		
			}	
			num.stream().filter(s-> s>0).forEach(s-> positive.add(s));
			num.stream().filter(s-> s<0).forEach(s-> negative.add(s));
			
			double positive_ = positive.size()/num.size();
			System.out.println(positive_);
			double negative_ = negative.size()/num.size();
			System.out.println(positive_);
	}
	
	
}

