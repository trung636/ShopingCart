package Model;

public class SanPham {
	private int ma;
	private String ten;
	private double gia;
	private int soLuong;
	
	public SanPham(int ma, String ten, double gia, int soLuong) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.gia = gia;
		this.soLuong = soLuong;
	}
	public int getMa() {
		return ma;
	}
	public void setMa(int ma) {
		this.ma = ma;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	@Override
	public String toString() {
		
		return "SanPham [ma=" + ma + ", ten=" + ten + ", gia=" + gia + ", soLuong=" + soLuong + "]";
	}

}
