package Java8Lab2;

import java.util.Arrays;
import java.util.Scanner;

public class StringSorting {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String[] arr=new String[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.next();
		Arrays.sort(arr);
		if(n%2==0) {
			for(int i=0;i<n/2;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(n/2)+1;i<n;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		else {
			for(int i=0;i<(n/2)+1;i++) {
				arr[i]=arr[i].toUpperCase();
			}
			for(int i=(n/2)+2;i<n;i++) {
				arr[i]=arr[i].toLowerCase();
			}
		}
		for(String str:arr) {
			System.out.print(str+" ");
		}
	}

}
