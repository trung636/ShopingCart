package Model;

public class KhachHang extends NguoiDung {
	private GioHang gioHang;


	public KhachHang() {
		super();
		this.gioHang = new GioHang();
	}

	public GioHang getGioHang() {
		return gioHang;
	}

	public void setGioHang(GioHang gioHang) {
		this.gioHang = gioHang;
	}

	public void mua(SanPham sp, int sl) {
		if (sl > 0) {
			this.gioHang.them(sp, sl);
		} else {
			System.out.println("sl phai > 0 ");
		}
	}

	public String xoaSP(SanPham sp, int sl) {
		return this.gioHang.xoa(sp, sl);

	}

	public void tongTien() {
		this.gioHang.tongTien();
	}

	public void print() {
		System.out.println("--------------DSGH------------");
		this.gioHang.print();
	}
}
