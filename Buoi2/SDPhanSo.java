package Buoi2;

import java.util.Scanner;

public class SDPhanSo {
	public static void main(String[] args) {
		PhanSo a = new PhanSo(3, 7);
		PhanSo b = new PhanSo(4, 9);
		System.out.printf("Phan so a = ");
		a.hienThi();
		System.out.printf("\nPhan so b = ");
		b.hienThi();
		System.out.println("\n");
		PhanSo x = new PhanSo();
		PhanSo y = new PhanSo();
		x.nhap();
		y.nhap();
		System.out.println("Gia tri nghich dao cua x = ");
		x.giaTriNghichDao().hienThi();
		System.out.println("\nTong hai phan so a va b = ");
		x = x.cong(y);
		x.hienThi();
		PhanSo ds[];
		Scanner sc = new Scanner(System.in);
		System.out.println("\nNhap n so: ");
		int n = sc.nextInt();
		ds = new PhanSo[n];
		for(int i = 0; i <ds.length; i++){
			ds[i] = new PhanSo();
		}
		PhanSo sum = new PhanSo();
		for (int i = 0; i < ds.length; i++) {
			System.out.println("Nhap so thu "+(i+1)+": ");
			ds[i].nhap();
			sum = sum.cong(ds[i]);
		}
		System.out.print("Tong n phan so la = ");
		sum.hienThi();
		PhanSo max = new PhanSo(ds[0].getTuSo(), ds[0].getMauSo());
		for (int i = 1; i < ds.length; i++) {
			if(ds[1].lonHon(max))
				max.setTuSo(max.getTuSo());
				max.setMauSo(max.getMauSo());
		}
		System.out.print("\nPhan so lon nhat la:");
		max.hienThi();
		
		PhanSo temp = new PhanSo();
		for(int i=0; i<ds.length; i++) {
			for(int j=i+1;j<ds.length;j++) {
				if(ds[i].lonHon(ds[j])) {
					temp.deepCopy(ds[i]);
					ds[i].deepCopy(ds[j]);
					ds[j].deepCopy(temp);
				}
			}
		}
		System.out.print("\nDay phan so co thu tu la: ");
		for(int i=0; i<n; i++) {
			ds[i].hienThi();
			System.out.print(" ");
		}
	}
}
