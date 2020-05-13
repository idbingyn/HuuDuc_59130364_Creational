/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt1;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author Pistol
 */
public class Main {
    public static void main(String[] args )throws ParseException {
        SimpleDateFormat format= new SimpleDateFormat("dd/MM/yyyy");
        HoaDon hoadon;
        hoadon = new HoaDon.HoaDonBuilder()
                .setHeader(new HoaDonHeader("HD01", format.parse("12/06/2020"), "Nguyen Pham Huu Duc"))
                .addDsCTDH( new CTHD ("May tinh de ban",1,25000000,15))
                .addDsCTDH( new CTHD ("Laptop",1,25000000,15))
                .addDsCTDH( new CTHD ("Mouse",1,200000,15))
                .addDsCTDH( new CTHD ("Loa",1,600000,15))
                .addDsCTDH( new CTHD ("Tai phone",1,300000,15))
                .build();        
        System.out.println(hoadon.toString());                               
    }
}
