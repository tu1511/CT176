package buoi1;

import java.util.Scanner;

public class GiaiPTBac2 {
	public static void bac1(float a, float b){
		float kq = (-b)/a;
		if(a == 0)
			if(b == 0)
				System.out.println("Phuong trinh vo so nghiem!");
			else
				System.out.println("Phuong trinh vo nghiem!");
		else
			System.out.println("Phuong trinh co nghiem duy nhat: "+ kq);
	}
	public static void bac2(float a, float b, float c){
		float delta;
		delta = b*b - 4*a*c;
		if(delta < 0)
			System.out.println("Phuong trinh vo nghiem!");
		else
			if(delta == 0){
				float kq = (-b / (2 * a));
				System.out.println("Phuong trinh co nghiem kep: x1 = x2 = "+ kq);
			}			
			else
				System.out.println("Phuong trinh co 2 nghiem phan biet:\nx1 = "+ ((-b + Math.sqrt(delta))/(2*a)) + "\nx2 = "+ ((-b - Math.sqrt(delta))/(2*a)));
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float a = sc.nextFloat();
		float b = sc.nextFloat();
		float c = sc.nextFloat();
		GiaiPTBac2.bac1(a, b);
		GiaiPTBac2.bac2(a, b, c);
	}

}
