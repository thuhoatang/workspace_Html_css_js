/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tran Dai
 */
public class BookList {
    private List<Book> list = new ArrayList<Book>();

    public BookList() {
    }
    public void addBook(){
        Book temp = new Book();
        temp.input();
        list.add(temp);
    }
    
    public void showList(){
        list.forEach((b) -> {
            b.show();
        });
    }
    
    public void inputList(){
        Scanner sc = new Scanner(System.in);
        int n =  Integer.parseInt(sc.nextLine());
        for(int i = 0;i<n;i++){
            addBook();
        }
    }
    
    public void sort(){
        for(int  i =0;i<list.size();i++){
            for(int j = i+1;j<list.size();j++){
                if(list.get(i).getTitleString().compareTo(list.get(j).getTitleString()) > 0){
                    Book temp = new Book();
                    temp = list.get(i);
                    list.set(i, list.get(j));
                    list.set(j, temp);
                }
            }
        }
    }
}
