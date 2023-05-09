package buoi1;

import java.util.Scanner;

public class Tong2So {
	public int nhap(){
		Scanner sc = new Scanner(System.in);
		String s = " ";
		int n = 0;
		do{
			System.out.printf("Moi nhap so: ");
			s = sc.nextLine();
			try {
				n = Integer.parseInt(s);
			} catch (NumberFormatException e) {
				n = Integer.MAX_VALUE;
				System.out.print("Ban da nhap sai!\n");
			}
		}while(n == Integer.MAX_VALUE);
		return n;
	}
	public static void main(String[] args) {	
		Tong2So t = new Tong2So();
		int a = t.nhap();
		int b = t.nhap();
		int s = a + b;
		System.out.println("Sum: "+s);
	}
}
