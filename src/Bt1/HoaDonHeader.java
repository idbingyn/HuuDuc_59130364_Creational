/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt1;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Pistol
 */
public class HoaDonHeader {
    String MaHD;
    Date Ngayban;
    String TenKH;
    public HoaDonHeader(String MaHD, Date Ngayban, String TenKH)
    {
        this.MaHD = MaHD;
        this.Ngayban = Ngayban;
        this.TenKH = TenKH;
    }
    
    public void setMaHD(String MaHD) {
        this.MaHD = MaHD;
    }

    public void setNgayban(Date Ngayban) {
        this.Ngayban = Ngayban;
    }

    public void setTenKH(String TenKH) {
        this.TenKH = TenKH;
    }

    @Override
    public String toString() {
        return "HoaDonHeader: MaHD "+MaHD
                +", Ngay ban:"+Ngayban+new SimpleDateFormat("dd/MM/yyyy").format(Ngayban)
                +", TenKH :"+TenKH;
    }
    
}
