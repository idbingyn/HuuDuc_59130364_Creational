/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt1;

/**
 *
 * @author Pistol
 */
public class CTHD {
    String sanpham;
    int soluong;
    double dongia;
    int chietkhau;
    //contructor
    public CTHD(String sanpham, int soluong, double dongia, int chietkhau) {
        this.sanpham = sanpham;
        this.soluong = soluong;
        this.dongia = dongia;
        this.chietkhau = chietkhau;
    }
    
    public void setSanpham(String sanpham) {
        this.sanpham = sanpham;
    }

    public void setSoluong(int soluong) {
        this.soluong = soluong;
    }

    public void setDongia(double dongia) {
        this.dongia = dongia;
    }

    public void setChietkhau(int chietkhau) {
        this.chietkhau = chietkhau;
    }
    
    @Override
    public String toString() {
        return "Thông tin CTHD:Ten san pham "+ sanpham
                +", so luong: " + soluong
                +", Dongia: "+dongia
                + ", Chiet khau: "+chietkhau;
    }
}
