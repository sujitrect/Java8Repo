package com.sujit.j8.lambda;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PostJ8 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("peter", "anna", "mike", "xenia");

		Collections.sort(names, (String a, String b) -> {
		    return b.compareTo(a);
		});
		System.out.println(names);
		
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		System.out.println(names);
		
		Collections.sort(names, (a, b) -> b.compareTo(a));
		System.out.println(names);
		
	}
}
