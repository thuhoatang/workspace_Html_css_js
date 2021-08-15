/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai2;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    static List<Person> listKhoaHoc = new ArrayList<Person>();
    static List<Person> listQuanLy  = new ArrayList<>();
    static List<Person> listNVPTN  = new ArrayList<>();
    
    static void xuatDS(List<Person> list){
        for(int i = 0;i<list.size();i++){
            list.get(i).xuat();
            System.out.println("");
        }
    }
    
    static void nhapKhoaHoc(List<Person> list,int n) throws ParseException{
        for(int i = 0 ;i<n;i++){

            KhoaHoc ps = new KhoaHoc();
            ps.nhap();
            System.out.println("");
            list.add(ps);
        }
    }
    static void nhapNVPTN(List<Person> list,int n) throws ParseException{
        for(int i = 0 ;i<n;i++){
            NhanVienPTN ps = new NhanVienPTN();
            ps.nhap();
            System.out.println("");
            list.add(ps);
        }
    }

    static void nhapQuanLi(List<Person> list,int n) throws ParseException{
        for(int i = 0 ;i<n;i++){
            QuanLy ps = new QuanLy();
            ps.nhap();
            System.out.println("");
            list.add(ps);
        }
    }
    
    
    static int tongTienKhoaHoc(){
        int sum = 0;
        for(int i = 0 ;i<listKhoaHoc.size();i++){
            KhoaHoc ps = new KhoaHoc();
            ps = (KhoaHoc) listKhoaHoc.get(i);
            sum+= ps.getBacLuong() * ps.getSoNgayLam();
        }   
        return sum;
    }
    static int tongTienQuanLy(){
        int sum = 0;
        for(int i = 0 ;i<listQuanLy.size();i++){
            QuanLy ps = new QuanLy();
            ps = (QuanLy) listQuanLy.get(i);
            sum+= ps.getBacLuong() * ps.getSoNgayLam();
        }   
        return sum;
    }
    static int tongTienNVPTN(){
        int sum = 0;
        for(int i = 0 ;i<listNVPTN.size();i++){
            NhanVienPTN ps = new NhanVienPTN();
            ps = (NhanVienPTN) listNVPTN.get(i);
            sum+= ps.getLuongTrongThang();
        }   
        return sum;
    }
    
    public static void main(String[] args) throws ParseException {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Nhap so luong nha khoa hoc : ");
        n  = Integer.parseInt(sc.nextLine());
        System.out.println("===Nhap Nha Khoa Hoc===");
        nhapKhoaHoc(listKhoaHoc, n);
        System.out.println("Nhap so luong quan ly      : ");
        n  = Integer.parseInt(sc.nextLine());
        System.out.println("===Nhap Quan Ly===");
        nhapQuanLi(listQuanLy, n);   
        System.out.println("Nhap so luong NVPTN      : ");
        n  = Integer.parseInt(sc.nextLine());
        System.out.println("===Nhap Nhan Vien Phong Thi Nghiem===");
        nhapNVPTN(listNVPTN, n);  
        System.out.println("== Tien Luong ==");
        System.out.println("tong tien luong tra cho nha khoa hojc : "+tongTienKhoaHoc());
        System.out.println("tong tien luong tra cho quan ly       : "+tongTienQuanLy());
        System.out.println("tong tien luong ta cho nhan vien PTN  : "+tongTienNVPTN());
        
        
        
    }
}
