/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai2;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;



public class QuanLy extends Person{
    private String chucVuString;
    private int soNgayLam,bacLuong;

    public String getChucVuString() {
        return chucVuString;
    }

    public void setChucVuString(String chucVuString) {
        this.chucVuString = chucVuString;
    }

    public int getSoNgayLam() {
        return soNgayLam;
    }

    public void setSoNgayLam(int soNgayLam) {
        this.soNgayLam = soNgayLam;
    }

    public int getBacLuong() {
        return bacLuong;
    }

    public void setBacLuong(int bacLuong) {
        this.bacLuong = bacLuong;
    }
    
    @Override
    void nhap() throws ParseException{
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.println("chuc vu       : ");
        setChucVuString(sc.nextLine());
        System.out.println("SO Ngay Lam   : ");
        setSoNgayLam(Integer.parseInt(sc.nextLine()));
        System.out.println("Bac Luong     : ");
        setBacLuong(Integer.parseInt(sc.nextLine()));
    }
    
    @Override
    void xuat(){
        super.xuat();
        System.out.println("Chuc Vu       : "+getChucVuString());
        System.out.println("So Ngay lam   : "+getSoNgayLam());
        System.out.println("bac Luong     : "+getBacLuong());
    }

}
