/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai2;

import java.text.ParseException;
import java.util.Scanner;


// được kế thừa từ lớp Person
public class NhanVienPTN extends Person{
    int luongTrongThang;

    public int getLuongTrongThang() {
        return luongTrongThang;
    }

    public void setLuongTrongThang(int luongTrongThang) {
        this.luongTrongThang = luongTrongThang;
    }

    
    @Override
    void nhap() throws ParseException{
        super.nhap();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap luong thang : ");
        setLuongTrongThang(Integer.parseInt(sc.nextLine()));
        
    }

    @Override
    void xuat(){
        super.xuat();
        System.out.println("Luong trng thang: "+getLuongTrongThang());
    }
    
}
