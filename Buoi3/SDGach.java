package Buoi3;

import java.util.Scanner;

public class SDGach {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap vao so loai gach: ");
		int n = sc.nextInt();
		Gach ds[] = new Gach[n];
		for(int i = 0; i <n; i++) {
			ds[i] = new Gach();
			System.out.println("Nhap vao thong tin loai gach thu "+(i+1)+": ");
			ds[i].nhap();
		}
		for(int i = 0; i <n; i++) {
			System.out.println("Thong tin loai gach thu "+(i+1)+": ");
//			ds[i].in();
			System.out.println(ds[i]);
		}
		Gach g = ds[0];
		double min_cp = (double)ds[0].getGiaBan()/ds[0].dienTichNenToiDa();
		for(int i = 1; i <n; i++) {
			if((double)ds[i].getGiaBan()/ds[i].dienTichNenToiDa() < min_cp) {
					min_cp = (double)ds[i].getGiaBan()/ds[i].dienTichNenToiDa();
					g = ds[i];
			}
		}
		System.out.println("Loai gach co chi phi thap nhat: ");
		System.out.println(g);
		for(int i = 0; i <n; i++) {
			double cp = ds[i].soLuongHop(2000, 500)*ds[i].getGiaBan();
			System.out.println("Chi phi lot cua loai gach thu "+(i+1)+": "+ cp);
		}
	}
}
