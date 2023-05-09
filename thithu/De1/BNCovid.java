package De1;

import java.util.Scanner;

public class BNCovid extends BNhan{
	private String ngay, odich, noi;
	private char loai;
	public BNCovid() {
		super();
		ngay = new String();
		loai = '0';
		odich = new String();
		noi = new String();
	}
	public BNCovid(BNCovid bn) {
		super(bn);
		ngay = new String(bn.ngay);
		loai = bn.loai;
		odich = new String(bn.odich);
		noi = new String(bn.noi);
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap thong tin benh nhan: ");
		super.nhap();
		System.out.print("Nhap ngay thang nam cach ly: ");
		ngay = sc.nextLine();
		System.out.print("Nhap loai nguoi nhiem '0'(F0), '1'(F1), '2'(F2):");
		loai =sc.next().charAt(0);
		sc.nextLine();
		System.out.print("O dich: ");
		odich = sc.nextLine();
		System.out.print("Nhap noi cach ly: ");
		noi = sc.nextLine();
	}
	public void in() {
		super.in();
		System.out.print("Ngay cach ly: "+ngay);
		if(loai == '0')
			System.out.print("\nPhan loai nguoi nhiem: F0");
		else
			if(loai == '1')
				System.out.print("\nPhan loai nguoi nhiem: F1");
			else
				System.out.print("\nPhan loai nguoi nhiem: F2");
		System.out.print("\nO dich: "+odich+"\nNoi cach ly: "+noi+"\n");
	}
	public String toString() {
		String result = super.toString()+("Ngay cach ly: "+ngay);
		if(loai == '0')
			result += ("\nPhan loai nguoi nhiem: F0");
		else
			if(loai == '1')
				result += ("\nPhan loai nguoi nhiem: F1");
			else
				result += ("\nPhan loai nguoi nhiem: F2");
		result += ("\nO dich: "+odich+"\nNoi cach ly: "+noi+"\n");
		return result;
	}
	public char getLoai() {
		return loai;
	}
	public String getODich() {
		return odich;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so benh nhan: ");
		int n = sc.nextInt();
		BNhan ds[] = new BNhan[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap thong tin benh nhan thu "+(i+1)+": ");
			System.out.print("Nhap benh nhan(0) hay benh nhan covid(1): ");
			int c = sc.nextInt();
			if(c == 0)
				ds[i] = new BNhan();
			else
				ds[i] = new BNCovid();
			ds[i].nhap();
		}
		System.out.println("Danh sach ben nhan: ");
		for(int i = 0; i < n;i++) {
			System.out.println("Thong tin benh nhan thu "+(i+1)+": ");
			ds[i].in();
		}
		System.out.println("Benh nhanh o cong ty hosiden");
		for(int i = 0; i < n;i++) {
			if(ds[i].getLoai() == '1' && ds[i].getODich().compareTo("Cong ty Hosiden") == 0)
			ds[i].in();
		}
		
	}
}
