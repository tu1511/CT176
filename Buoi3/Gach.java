package Buoi3;

import java.util.Scanner;

public class Gach {
	private String maSo, Mau;
	private int soLuong, chieuDai, chieuNgang;
	private long giaBan;
	
	public Gach() {
		maSo = new String();
		Mau = new String();
		soLuong = 0;
		chieuDai = 0;
		chieuNgang = 0;
		giaBan = 0;
	}
	public Gach(Gach g) {
		maSo = new String(g.maSo);
		Mau = new String(g.Mau);
		soLuong = g.soLuong;
		chieuDai = g.chieuDai;
		chieuNgang = g.chieuNgang;
		giaBan = g.giaBan;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so: ");
		maSo = sc.nextLine();
		System.out.println("Nhap mau sac: ");
		Mau = sc.nextLine();
		System.out.println("Nhap so luong: ");
		soLuong = sc.nextInt();
		System.out.println("Nhap chieu dai: ");
		chieuDai = sc.nextInt();
		System.out.println("Nhap chieu ngang: ");
		chieuNgang = sc.nextInt();
		System.out.println("Nhap gia ban: ");
		giaBan = sc.nextLong();
	}
	public void in() {
		System.out.println("Ma so: " + maSo);
		System.out.println("Mau sac: " + Mau);
		System.out.println("So luong: "+ soLuong);
		System.out.println("Chieu dai: " + chieuDai);
		System.out.println("Chieu ngang: " + chieuNgang);
		System.out.println("Gia ban: " + giaBan);
	}
	public String toString() {
		return ("Ma so: " + maSo + "\n"+"Mau sac: " + Mau +"\n"+ "So luong: "+ soLuong+"\n"+"Chieu dai: " + chieuDai+"\n"+"Chieu ngang: " + chieuNgang+"\n"+"Gia ban: " + giaBan);
	}
	public float giaBanLe() {
		return (float)(giaBan / soLuong);
	}
	public int dienTichNenToiDa() {
		return soLuong *(chieuDai * chieuNgang);
	}
	public int soLuongHop(int D, int N) {
		double svd = Math.ceil((double)D/chieuDai);
		double svn = Math.ceil((double)N/chieuNgang);
		return (int)Math.ceil((svd * svn)/ soLuong);
	}
	public long getGiaBan() {
		return giaBan;
	}
}
