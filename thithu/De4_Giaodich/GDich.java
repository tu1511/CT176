package De4_Giaodich;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class GDich {
	private int mgd;
	private String hten, ngay;
	private boolean tthai;
	
	public GDich() {
		mgd = 1;
		hten = new String();
		ngay = new String();
		tthai = true;
	}
	public GDich(GDich g) {
		mgd = g.mgd;
		hten = new String(g.hten);
		ngay = new String(g.ngay);
		tthai = g.tthai;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so giao dich: ");
		mgd = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhap ho ten nguoi giao dich: ");
		hten = sc.nextLine();
		System.out.print("Nhap ngay thang nam(dd/mm/yyyy): ");
		ngay = sc.nextLine();
		System.out.print("Nhap trang thai giao dich(true/false): ");
		tthai = sc.nextBoolean();
	}
	public void in() {
		System.out.print("Ma giao dich: "+mgd+"\nHo ten nguoi giao dich: "+hten+"\nNgay giao dich: "+ngay);
		if(tthai == true)
			System.out.print("\nTrang thai giao dich: thanh cong\n");
		else
			System.out.print("\nTrang thai: giao dich khong thanh cong\n");
	}
	public String toString() {
		String kq = ("Ma giao dich: "+mgd+"\nHo ten nguoi giao dich: "+hten+"\nNgay giao dich: "+ngay);
		if(tthai == true)
			kq += ("\nTrang thai giao dich: thanh cong\n");
		else
			kq += ("\nTrang thai giao dich: that bai\n");
		return kq;
	}
	public float Gtri() {
		return 0;
	}
	public int getMgd() {
		return mgd;
	}
	public int getThang() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate localdate = LocalDate.parse(ngay, formatter);
		return localdate.getMonthValue();
	}
	public int getNam() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
		LocalDate localdate = LocalDate.parse(ngay, formatter);
		return localdate.getYear();
	}
	public static void main(String[] args) {
		GDich gd1 = new GDich();
		gd1.nhap();
		System.out.println("Thong tin giao dich 1: ");
		gd1.in();
		GDich gd2 = new GDich(gd1);
		System.out.println("\nThong tin giao dich 2: ");
		gd2.in();
	}
}
