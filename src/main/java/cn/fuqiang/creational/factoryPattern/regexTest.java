package cn.fuqiang.creational.factoryPattern;

import java.util.LinkedList;

public class regexTest {
	public static void main(String[] args) {
		String str = "111111";
		System.out.println(str.matches("[0-9]{6}"));
		
		Integer[] arr = {1,2,3,4,5,6,7,8,9};
		LinkedList<Integer> list = new LinkedList<>();
		for (int i=0;i<arr.length;i++) {
			if(i%2==0) {
				list.addLast(arr[i]);
			}else {
				list.addFirst(arr[i]);
			}
		}
		Integer n = null;
		if(arr.length%2==0) {
			n=list.getFirst();
		}else {
			n=list.getLast();
		}
		System.out.println("n="+n);
		System.out.println(list);
		
	}
}
