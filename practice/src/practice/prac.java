package practice;

import java.util.*;

public class prac {
	
	
	public static void main(String[] args) {
		System.out.println(counter(24));
	}
	
	public static int counter(int n) {
		int result = 0;
		for(int i = 1; i <= n/2; i++) {
			if(n%i==0) result++;
			
		}
		return result;
	}
	
}
