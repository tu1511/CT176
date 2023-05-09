package Buoi2;

import java.util.Scanner;

public class PhanSo {
	private int tuso, mauso;
	
	public PhanSo(){
		tuso = 0;
		mauso = 1;
	}
	public PhanSo(int tu, int mau){
		tuso = tu;
		mauso = mau;
	}
	public void nhap(){
		Scanner sc = new Scanner(System.in);
		do{
			System.out.println("Nhap tu: ");
			tuso = sc.nextInt();
			System.out.println("Nhap mau: ");
			mauso = sc.nextInt();
			if(mauso == 0)
				System.out.println("Ban da nhap sai!\nMoi nhap lai!");
		}while(mauso == 0);
	}
	public void hienThi(){
		if(tuso == 0)
			System.out.println("0");
		else
			if(mauso == 1)
				System.out.println(tuso);
			else
				if(mauso < 0)
				System.out.println("-"+tuso+"/"+(-mauso));
				else
					if(tuso == mauso)
						System.out.println("1");
					else
						System.out.print(tuso+"/"+mauso);
	}
	public void nghichDao(){
		int temp;
		temp = tuso;
		tuso = mauso;
		mauso = temp;
	}
	public PhanSo giaTriNghichDao(){
		PhanSo a = new PhanSo();
		a.tuso = mauso;
		a.mauso = tuso;
		return a;
	}
	public float giaTriThuc(){
		return (float)tuso/mauso;
	}
	public boolean lonHon(PhanSo a){
		return this.giaTriThuc() > a.giaTriThuc();
	}
	public PhanSo cong(PhanSo a){
		PhanSo b = new PhanSo();
		b.mauso = mauso * a.mauso;
		b.tuso = tuso*a.mauso + mauso*a.tuso;
		return b;
	}
	public PhanSo tru(PhanSo a){
		PhanSo b = new PhanSo();
		b.mauso = mauso * a.mauso;
		b.tuso = tuso*a.mauso - mauso*a.tuso;
		return b;
	}
	public PhanSo nhan(PhanSo a){
		PhanSo b = new PhanSo();
		b.mauso = mauso * a.mauso;
		b.tuso = tuso * a.tuso;
		return b;
	}
	public PhanSo chia(PhanSo a){
		return this.nhan(giaTriNghichDao());
	}
	
	public PhanSo cong(int a) {
		return cong(new PhanSo(a,1));
	}
	
	public PhanSo tru(int a) {
		return tru(new PhanSo(a,1));
	}
	public PhanSo nhan(int a) {
		return nhan(new PhanSo(a,1));
	}
	public PhanSo chia(int a) {
		return chia(new PhanSo(a,1));
	}
	public int getTuSo(){
		return tuso;
	}
	public int getMauSo(){
		return mauso;
	}
	public void setTuSo(int tuSo) {
		this.tuso = tuSo;
	}
	public void setMauSo(int mauSo) {
		this.mauso = mauSo;
	}
	public void deepCopy(PhanSo a) {
		tuso = a.tuso;
		mauso = a.mauso;
	}
}

