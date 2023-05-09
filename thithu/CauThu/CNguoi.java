package CauThu;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class CNguoi {
	private String id, hten, ngay;
	private char phai;
	
	public CNguoi() {
		id = new String();
		hten = new String();
		ngay = new String();
		phai = 'M';
	}
	public CNguoi(CNguoi cn) {
		id = new String(cn.id);
		hten = new String(cn.hten);
		ngay = new String(cn.ngay);
		phai = cn.phai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap CMND: ");
		id =sc.nextLine();
		System.out.print("Nhap ho va ten: ");
		hten =sc.nextLine();
		System.out.print("Nhap ngay thang nam sinh(dd/MM/yyyy): ");
		ngay =sc.nextLine();
		System.out.print("Nhap phai (M:Nam, F: Nu): ");
		phai =sc.next().charAt(0);
	}
	public void in() {
		System.out.print("CMND: "+id+"\nHo va ten: "+hten +"\nNgay thang nam sinh: "+ngay);
		if(phai == 'M')
			System.out.println("\nPhai: Nam");
		else
			System.out.println("\nPhai: Nu");
	}
	public String toString() {
		String kq = ("CMND: "+id+"\nHo va ten: "+hten +"\nNgay thang nam sinh: "+ngay);
		if(phai == 'M')
			kq += ("\nPhai: Nam");
		else
			kq += ("\nPhai: Nu");
		return kq;
	}
	public String layHTen() {
		return hten;
	}
	public String layVTri() {
		return " ";
	}
	public long tinhLuong() {
		return 0;
	}
	public long layBThang() {
		return 0;
	}
	public int layTuoi() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate localDate = LocalDate.parse(ngay, formatter);
		int age = 2023-localDate.getYear();
		return age;
	}
	public static void main(String[] args) {
		CNguoi c1 = new CNguoi();
		c1.nhap();
		System.out.println("Thong tin nguoi c1: ");
		c1.in();
		CNguoi c2 = new CNguoi(c1);
		System.out.println("Thong tin nguoi c2: ");
		c2.in();
	}
}
