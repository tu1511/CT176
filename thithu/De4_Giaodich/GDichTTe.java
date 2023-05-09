package De4_Giaodich;

import java.util.Scanner;

public class GDichTTe extends GDich{
	private float dgia;
	private int sluong;
	private char loai;
	private float tgia;
	
	public GDichTTe() {
		super();
		dgia = 1.0f;
		sluong = 1;
		loai = 'V';
		tgia = 1.0f;
	}
	public GDichTTe(GDichTTe gd) {
		super(gd);
		dgia = gd.dgia;
		sluong = gd.sluong;
		loai = gd.loai;
		tgia = gd.tgia;
	}
	public void nhap() {
		System.out.println("Nhap thong tin giao dich: ");
		super.nhap();
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap don gia: ");
		dgia = sc.nextFloat();
		System.out.print("Nhap so luong: ");
		sluong = sc.nextInt();
		System.out.print("Nhap loai tien te: ");
		loai = sc.next().charAt(0);
		System.out.print("Nhap ti gia: ");
		tgia = sc.nextFloat();
	}
	public void in() {
		System.out.println("Thong tin giao dich: ");
		super.in();
		System.out.print("Don gia: "+dgia+"\nSo luong: "+sluong);
		if(loai == 'V')
			System.out.print("\nLoai: tien Viet Nam");
		else
			if(loai == 'U')
				System.out.print("\nLoai: tien USD");
			else
				if(loai == 'E')
					System.out.print("\nLoai: tien Euro");
		System.out.print("\nTi gia: "+tgia+"\n");
	}
	public float Gtri() {
		return (float)(sluong*dgia*tgia);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap so giao dich: ");
		int n = sc.nextInt();
		GDich ds[] = new GDich[n];
		for(int i = 0; i < n; i++) {
			System.out.println("Nhap giao dich thu "+(i+1)+": ");
			System.out.print("Nhap giao dich(0) hay giao dich tien te(1): ");
			int c = sc.nextInt();
			if(c == 0)
				ds[i] = new GDich();
			else
				ds[i] = new GDichTTe();
			ds[i].nhap();
		}
		System.out.println("Thong tin tat ca cac giao dich: ");
		for(int i = 0; i < n; i++) {
			System.out.println("Thong tin giao dich thu "+(i+1)+": ");
			ds[i].in();
		}
		System.out.println("Thong tin ca giao dich co gia tri tren 100000 VND");
		for(int i = 0; i<n;i++) {
			if(ds[i] instanceof GDichTTe) {
				if(ds[i].Gtri() > 100000) {
					System.out.println("Ma giao dich: "+ds[i].getMgd()+", voi gia tri giao dich: "+ds[i].Gtri());
				}	
			}
		}
	}
}
