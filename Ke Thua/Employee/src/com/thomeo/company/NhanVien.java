package com.thomeo.company;

public abstract class NhanVien {
        protected String name;
        protected long luong;

    public NhanVien() {
    }

    public NhanVien(String name) {
        this.name = name;
    }
    protected abstract String loaiNhanVien();
    public abstract void tinhLuong();

    public void xuatThongTin(){
        this.tinhLuong();
        System.out.println("Ten la: "+ name );
        System.out.println("Luong: "+ luong );

    }


}
