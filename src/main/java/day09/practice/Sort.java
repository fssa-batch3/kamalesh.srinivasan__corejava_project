package day09.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;


public class Sort {

	public static void main(String[] args) {
		
		int times = 5;
		Scanner S = new Scanner(System.in);
		ArrayList<Integer> al = new ArrayList<Integer>();
		for(int i=0;i<times;i++) {
			Integer v = S.nextInt();
	     	al.add(v);
		}
		
		Collections.sort(al);
		System.out.println(al);

	}

}
