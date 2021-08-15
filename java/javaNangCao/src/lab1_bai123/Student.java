/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai1;

import java.util.List;
import java.util.Scanner;


public class Student {
    private String SID,ten,khoa;
    private float diemTB ;
    
    // constructor tham số
    public Student(String SID, String ten, String khoa, float diemTB) {
        this.SID = SID;
        this.ten = ten;
        this.khoa = khoa;
        this.diemTB = diemTB;
    }
    
    public Student(){}

    public String getSID() {
        return SID;
    }

    public void setSID(String SID) {
        this.SID = SID;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getKhoa() {
        return khoa;
    }

    public void setKhoa(String khoa) {
        this.khoa = khoa;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }
    
    //Phương thức hiển thị dữ liệu
    void show(Student st){
        System.out.println("MA SV      : "+getSID());
        System.out.println("Ten        : "+getTen());
        System.out.println("Khoa       : "+getKhoa());
        System.out.println("Diem TB    : "+getDiemTB());
        System.out.println("");
    }
    
    // Hàm nhập 1 sinh viên
    public void nhap1SV(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap MSV   : ");
        setSID(sc.nextLine());
        System.out.print("Nhap Ten   : ");
        setTen(sc.nextLine());
        System.out.print("Nhap Khoa  : ");
        setKhoa(sc.nextLine());
        System.out.print("Nhap DTb   : ");
        setDiemTB(Float.parseFloat(sc.nextLine()));
        System.out.println("");
    }
    // cái này nhập danh sách 1 laotj nhiều sinh viên
    static public void nhapDS(List list,int n){
        for(int i = 0;i<n;i++){
            Student st = new Student();
            st.nhap1SV();
            list.add(st);
        }
    }
    //xuất dánh sách sinh viên
    static public void xuatDS(List<Student> list){
        list.forEach((st) -> {
            st.show(st);
        });
    }
    
}
