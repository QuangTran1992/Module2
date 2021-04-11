package com.thomeo.company;

public class TestNhanVien {
    public static void main(String[] args) {
        NhanVien sep = new NhanVienFullTime("Quang", 10, Configs.NHAN_VIEN_SEP);
        sep.xuatThongTin();

        NhanVien parttime1 = new NhanVienPartTime("Tom",120);
        parttime1.xuatThongTin();
    }
}
