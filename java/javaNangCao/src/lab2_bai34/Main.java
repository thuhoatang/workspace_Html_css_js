/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;


import java.awt.List;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.list;
import java.util.Scanner;
import javafx.print.Collation;
import static jdk.nashorn.internal.objects.NativeArray.sort;

/**
 *
 * @author Tran Dai
 */
public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        
        ACCountList al = new ACCountList();
//        al.saveFile();
        al.loadFile();

        ACCountList temp = al;


        System.out.println("Danh sach hien co : ");
        al.showAccountList();
        String choose = "";
        while(choose.equals("exit") ==false ){
            System.out.println("Nhap lenh (add,save,load,remove) : ");
            choose = sc.nextLine();
            if(choose.equals("add")){
                al.newAccount();
                Collections.sort(temp.list, new Sortbyroll());                
            }

            if(choose.equals("save"))
                al.saveFile();
            if(choose.equals("laod")){
                al.loadFile();                
                al.showAccountList();
            }
            if(choose.equals("remove")){
                System.out.println("Nhap id can xoa :");
                String id = sc.nextLine();
                int i = Collections.binarySearch(al.list,new Account(id, null, null) , new Sortbyroll());
                al.list.remove(i);
                System.out.println("Danh sanh moi : ");
                al.showAccountList();
            }

        }
    }
}
