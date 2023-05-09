package Buoi5;

import java.util.Scanner;

public class ChiTiet {
	private HangHoa h;
	private int sLuong;
	private long dGia;
	
	public ChiTiet() {
		h = new HangHoa();
		sLuong = 0;
		dGia = 0;
	}
	public ChiTiet(ChiTiet c) {
		h = new HangHoa(c.h);
		sLuong = c.sLuong;
		dGia = c.dGia;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin hang hoa: ");
		h.nhap();
		System.out.print("Nhap so luong: ");
		sLuong = sc.nextInt();
		System.out.print("Nhap don gia: ");
		dGia = sc.nextLong();
	}
	public void in() {
		System.out.print(h+"\t"+sLuong +"\t\t"+ dGia+"\t"+tTien()+"\n");
	}
	public String toString() {
		return (h+"\t"+sLuong +"\t\t"+ dGia+"\t"+tTien()+"\n");
	}
	public long tTien() {
		return sLuong * dGia;
	}
}
