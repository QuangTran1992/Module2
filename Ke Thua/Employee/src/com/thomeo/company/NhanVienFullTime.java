package com.thomeo.company;

public class  NhanVienFullTime extends NhanVien {
    private int loaiChucVu;
    private int ngaylamThem;


    @Override
    protected String loaiNhanVien() {
        return (this.loaiChucVu == Configs.NHAN_VIEN_SEP) ? "SEP" : "LINH" ;
    }

    @Override
    public void tinhLuong() {
        switch (this.loaiChucVu) {
            case Configs.NHAN_VIEN_SEP:
                this.luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_SEP + Configs.LUONG_LAM_THEM_MOI_NGAY * this.ngaylamThem;
                break;
            case Configs.NHAN_VIEN_LINH: {
                this.luong = Configs.LUONG_NHAN_VIEN_FULL_TIME_LINH + Configs.LUONG_LAM_THEM_MOI_NGAY * this.ngaylamThem;
                break;
            }

        }
    }
    public NhanVienFullTime(String ten, int ngaylamThem,int loaiChucVu){
        super(ten);
        this.loaiChucVu = loaiChucVu ;
        this.ngaylamThem = ngaylamThem;
    }





}



