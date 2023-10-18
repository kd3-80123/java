package com.sunbeam;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class MaxValue {

	public static void main(String[] args) {
		ArrayList <String> list = new ArrayList<String>();
		list.add("Saurabh");
		list.add("Kalambate");
		list.add("Sunbeam");
		list.add("Infotech");
		list.add("Bookofgreen");
		
		class Stringcomparator implements Comparator<String>
		{

			@Override
			public int compare(String arg0, String arg1) {
				int diff = arg0.length()-arg1.length();
				return diff;
				
			}

			
			
			
			
		}
		
		Stringcomparator s1 = new Stringcomparator();
		System.out.println(Collections.max(list, s1));
		
		
		

	}

}
