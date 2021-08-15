/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc  = new Scanner(System.in);
        List<Student> list = new ArrayList<>();
        System.out.println("Nhap so Sinh Vien : ");
        
        int n = Integer.parseInt(sc.nextLine());
        System.out.println("=== NHAP SINH VIEN ===");
        Student.nhapDS(list, n);
        System.out.println("=== XUAT SINH VIEN ===");
        Student.xuatDS(list);
    }
    
}
