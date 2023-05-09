package De2;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Dco {
	private String ten, ngay;
	private float dtich;
	
	public Dco() {
		ten = new String();
		dtich = 0.0f;
		ngay = new String();
	}
	public Dco(Dco d) {
		ten = new String(d.ten);
		dtich = d.dtich;
		ngay = new String(d.ngay);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ten dong co: ");
		ten = sc.nextLine();
		System.out.print("Nhap dung tich: ");
		dtich = sc.nextFloat();
		sc.nextLine();
		System.out.print("Nhap ngay thang nam san xuat(dd/mm/yyyy): ");
		ngay = sc.nextLine();
	}
	public void in() {
		System.out.println("Ten dong co: "+ten + "\nDung tich: "+dtich+" ml"+"\nNSX: "+ngay);
	}
	public String toString() {
		return ("Ten dong co: "+ten + "\nDung tich: "+dtich+" ml"+"\nNSX: "+ngay);
	}
	public long getGia() {
		return 0;
	}
	public char gettthai() {
		return ' ';
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
		Dco d1 = new Dco();
		d1.nhap();
		System.out.println("Thong tin dong co 1: ");
		d1.in();
//		Dco d2 = new Dco(d1);
//		System.out.println("Thong tin dong co 2: ");
//		d2.in();
		System.out.println(d1.getThang()+ "\n"+ d1.getNam());
	}
}
