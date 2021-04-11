package com.thomeo.company;

public class NhanVienPartTime extends NhanVien {
    private int gioLamViec;

    @Override
    protected String loaiNhanVien() {
        return "nhan vien partTime";
    }

    @Override
    public void tinhLuong() {
    this.luong = Configs.LUONG_NHAN_VIEN_PART_TIME_MOI_GIO * gioLamViec;
    }
    public NhanVienPartTime(String ten , int gioLamViec ){
        super(ten);
        this.gioLamViec = gioLamViec;
    }
}
