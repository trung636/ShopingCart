package Model;

import java.util.List;

public class CuaHang  {

	private List<SanPham> sps;

	public CuaHang(List<SanPham> sps) {
		super();
		this.sps = sps;
	}

	public void printCH() {
		System.out.println("============DSSP============");
		for (SanPham sp : this.sps) {
			System.out.println(sp.toString());
		}
	}
	
	
	

}
