package Array;

import java.util.*;
import java.io.*;

public class array3 {

	public static void main(String[] args) throws IOException{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());
		
		int num = a*b*c; 
		int[] arr = new int[10];
		
		while(num != 0) {
			arr[num % 10] ++;
			num /= 10;
		}
		
		for (int i : arr) bw.write(i + "\n");
		
		bw.close();

	}

}

/* 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		int[] arr = new int[10];

		int a = Integer.parseInt(br.readLine());
		int b = Integer.parseInt(br.readLine());
		int c = Integer.parseInt(br.readLine());

		int num = a*b*c; 

		while(num != 0) {
		arr[num%10]++;
		num /= 10;
		}

		for(int i=0; i<10; i++)
			bw.write(arr[i] + "\n");

		bw.close();	*/