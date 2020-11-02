package main;

import java.util.ArrayList;
import java.util.List;

import Model.CuaHang;
import Model.KhachHang;
import Model.SanPham;

public class Main {
	public static void main(String[] args) {
		SanPham sp1 = new SanPham(1, "quan", 2000, 30);
		SanPham sp2 = new SanPham(2, "quanao", 1000,30);
		SanPham sp3 = new SanPham(3, "com", 6000, 30);
		List<SanPham> list = new ArrayList<SanPham>();
		list.add(sp1);
		list.add(sp2);
		list.add(sp3);
		CuaHang CH = new CuaHang(list);
		CH.printCH();
		KhachHang kh1 = new KhachHang();
		kh1.mua(sp1, 10);
		kh1.mua(sp2, 10);
		kh1.mua(sp3,-10);
		kh1.mua(sp1, 5);
		kh1.print();
		System.out.println("========================");
		System.out.println(kh1.xoaSP(sp1, 4));
		System.out.println(kh1.xoaSP(sp1, 12));
		kh1.print();
		kh1.tongTien();
		
		
		
	}

}
