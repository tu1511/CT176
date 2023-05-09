package buoi1;

import java.util.Scanner;

public class DanhSach {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int count = 0;
		int[] A = new int[n];
		for(int i = 0; i < n; i++){
			A[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		for (int i = 0; i < n; i++) {
			if(A[i] == x)
				count++;
		}
		for(int i = 0; i < n; i++)
			for(int j = n - 1; j > i; j--){
				int temp;
				if(A[i] > A[j]){
					temp = A[i];
					A[i] = A[j];
					A[j] = temp;
				}
					
			}
		System.out.println(count);
		for(int i = 0; i < n; i++)
			System.out.printf(A[i] + " ");
		
	}

}
