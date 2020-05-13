/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bt2;

/**
 *
 * @author Pistol
 */
public class Main {
    public static void main(String[] args) {
        MyStringBuilder str=new MyStringBuilder("Sinh viên ")
                .addString("Trường ")
                .addString("Đại học Nha Trang ")
                .addFloat(29.34f)
                .addBool(true);          
          str.addString("...");
          System.out.println(str.toString());
          System.out.println(str);
               
    }
}
