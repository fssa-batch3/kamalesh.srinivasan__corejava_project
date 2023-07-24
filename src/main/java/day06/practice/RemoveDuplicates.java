package day06.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {
		List<String> cityList = new ArrayList<String>();
		cityList.add("Chennai");
		cityList.add("Bangalore");
		cityList.add("Mumbai");
		cityList.add("Mumbai");
		for (String string : cityList) {
			if(Collections.frequency(cityList, string) == 2) {
				cityList.remove(string);
			}
		}
		System.out.println(cityList);
		System.out.println(cityList.stream().distinct().collect(Collectors.toList()));
		System.out.println(cityList);
	}

}
