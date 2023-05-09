package De1;

import java.util.Scanner;

public class BNhan {
	private String hten;
	private boolean gtinh;
	private int nsinh;
	private float cnang;
	
	public BNhan() {
		hten = new String();
		gtinh =false;
		nsinh = 2003;
		cnang = 1.0f;
	}
	public BNhan(BNhan b) {
		hten = new String(b.hten);
		gtinh = b.gtinh;
		nsinh = b.nsinh;
		cnang = b.cnang;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Thong tin benh nhan: ");
		System.out.print("Nhap ho va ten: ");
		hten = sc.nextLine();
		System.out.print("Nhap gioi tinh Nam(true)/Nu(false):");
		gtinh = sc.nextBoolean();
		System.out.print("Nhap nam sinh: ");
		nsinh = sc.nextInt();
		System.out.print("Nhap can nang: ");
		cnang = sc.nextFloat();
	}
	public void in() {
		System.out.print("Ho ten: "+hten);
		if(gtinh == true)
				System.out.print("\nGioi tinh: Nam");
		else
				System.out.print("\nGioi tinh: Nu");
		System.out.print("\nNam sinh: "+nsinh+"\nCan nang: "+cnang+"\n");
	}
	public String toString() {
		String result = ("Ho ten: "+hten);
		if(gtinh == true)
			result +=("\nGioi tinh: Nam");
		else
			result +=("\nGioi tinh: Nu");
		result +=("\nNam sinh: "+nsinh+"\nCan nang: "+cnang+"\n");
		return result;
	}
		
	public static void main(String[] args) {
		BNhan bn1 = new BNhan();
		bn1.nhap();
		System.out.println("Benh nhan 1:");
		bn1.in();
		BNhan bn2 = new BNhan(bn1);
		System.out.println("Benh nhan 2:");
		bn2.in();
	}
	public char getLoai() {
		return ' ';
	}
	public String getODich() {
		return "";
	}
}
