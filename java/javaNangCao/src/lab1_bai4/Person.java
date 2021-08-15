/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;


public class Person {
    private String hoTenString,bangCap;
    private Date namSinh;

    public String getHoTenString() {
        return hoTenString;
    }

    public void setHoTenString(String hoTenString) {
        this.hoTenString = hoTenString;
    }

    public String getBangCap() {
        return bangCap;
    }

    public void setBangCap(String bangCap) {
        this.bangCap = bangCap;
    }

    public String getNamSinh() {
                SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        return formatter.format(this.namSinh);
    }
    // cái này cũng tương tự dùng SimpleDateFormat lấy giá trị từ biến Date ra thành chuỗi cho mình
    // mình nhập vô hay xuất ra chuỗi đều dùng SimpleDateFormat để thao tác
    public void setNamSinh(String namSinh) throws ParseException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        this.namSinh = formatter.parse(namSinh);// trả về giá trị chuỗi của biến năm sinh.Lát tự kiếm đọc kiểu dl Date nghe chưa
    }
    
    
    void nhap() throws ParseException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap Ho Ten   : ");
        this.hoTenString = sc.nextLine();
        System.out.println("Nhap Nam Sinh : ");
        setNamSinh(sc.nextLine());
        System.out.println("Nhap Bang Cap : ");
        setBangCap(sc.nextLine());
    }
    
    void xuat(){
        System.out.println("Ho ten        : "+getHoTenString());
        System.out.println("Nam sinh      : "+getNamSinh());
        System.out.println("bang cap      : "+getBangCap());
    }
    
    
}
