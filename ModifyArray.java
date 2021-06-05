package Java8Lab2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class ModifyArray {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] arr1 = new int[n];
		for(int i = 0; i < n; i++) 
			arr[i] = sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		for(int i:arr)
			list.add(i);
		Collections.sort(list,Collections.reverseOrder());
		for(int i = 0; i < n; i++)
			arr1[i] = list.get(i);
		for(int i:arr1)
			System.out.print(i+" ");
	}


}
