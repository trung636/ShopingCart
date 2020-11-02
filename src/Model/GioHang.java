package Model;

import java.util.ArrayList;
import IModel.IGioHang;

public class GioHang extends ArrayList<SanPham> implements IGioHang {

	private static final long serialVersionUID = 1L;

	@Override
	public double tongTien() {
		double sum = 0.0;
		for (SanPham temp : this) {
			sum += temp.getGia() * temp.getSoLuong();
		}
		return sum;
	}

	@Override
	public void them(SanPham sp, int sl) {

		if (sl > 0) {
			SanPham kq = tim(sp.getMa());
			if (kq == null) {
				sp.setSoLuong(sl);
				this.add(sp);
			} else {
				// cap nhat so luong cua kq
				kq.setSoLuong(kq.getSoLuong() + sl);
			}
		} else {
			return;
		}
	}

	@Override
	public int tongsoSanPham() {

		int sum = 0;
		for (SanPham temp : this) {
			sum += temp.getSoLuong();
		}
		return sum;

	}

	@Override
	public int tongsoMatHang() {

		return this.size();
	}

	@Override
	public SanPham tim(int ma) {
		for (SanPham sp : this)
			if (ma == sp.getMa())
				return sp;
		return null;
	}

	@Override
	public String xoa(SanPham sp, int sl) {
		if (sl > 0) {
			SanPham kq = tim(sp.getMa());
			if (kq == null) {
				return "khong co sp trong gio hang";
			} else {
				// cap nhat so luong cua kq
				if (kq.getSoLuong() < sl) {
					return "so luong nhap vao khong hop le";
				}
				kq.setSoLuong(kq.getSoLuong() - sl);
			}
		} else {
			return "so luong nhap vao can phai > 0";
		}
		return "da xoa thanh cong";
	}

	public void print() {
		for (SanPham sp : this) {
			System.out.println(sp.toString());
		}
	}

}
