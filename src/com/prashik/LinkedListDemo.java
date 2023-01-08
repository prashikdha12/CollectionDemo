package com.prashik;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		List<Integer> list=new LinkedList<Integer>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		/*
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}*/
		System.out.println(list);
	}
	
	

}
