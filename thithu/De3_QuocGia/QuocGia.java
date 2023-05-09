package De3_QuocGia;

import java.util.Scanner;

public class QuocGia {
	private String msqg, tenqg, tenthudo;
	private float GDP;
	
	public QuocGia() {
		msqg = new String();
		tenqg = new String();
		tenthudo = new String();
		GDP = 1.0f;
	}
	public QuocGia(QuocGia q) {
		msqg = new String(q.msqg);
		tenqg = new String(q.tenqg);
		tenthudo = new String(q.tenthudo);
		GDP = q.GDP;
	}
	public void nhap() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhap ma so quoc gia: ");
		msqg = sc.nextLine();
		System.out.print("Nhap ten quoc gia: ");
		tenqg = sc.nextLine();
		System.out.print("Nhap ten thu do: ");
		tenthudo = sc.nextLine();
		System.out.print("Nhap tong san pham quoc noi: ");
		GDP = sc.nextFloat();
	}
	public void in() {
		System.out.println("Ma so quoc gia: "+msqg +"\nTen gioc gia: "+tenqg+"\nTen thu do: "+tenthudo+"\nGDP: "+GDP);
	}
	public String toString() {
		return ("Ma so quoc gia: "+msqg +"\nTen guoc gia: "+tenqg+"\nTen thu do: "+tenthudo+"\nGDP: "+GDP+"\n");
	}
	public char getChLuc() {
		return ' ';
	}
	public String getTenqg() {
		return tenqg;
	}
	public float getGDP() {
		return GDP;
	}
	public float getTTho() {
		return 0;
	}
	public static void main(String[] args) {
		QuocGia qg1 = new QuocGia();
		qg1.nhap();
		System.out.println("Thong tin quoc gia 1: ");
		qg1.in();
		QuocGia qg2 = new QuocGia(qg1);
		System.out.println("Thong tin quoc gia 2: ");
		qg2.in();
	}
}
