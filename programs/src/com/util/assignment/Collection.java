package com.util.assignment;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Collection {

	public static void main(String[] args) {
		int arr[] = {1,2,3,4,5};
		List<Integer> list =new  ArrayList(Arrays.asList(arr));
		list.stream().map(number -> number * 3).collect(Collectors.toList()).forEach(a->System.out.println(a));;
	}

}
