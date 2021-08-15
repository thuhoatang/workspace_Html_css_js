/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Tran Dai
 */
public class Book implements IBook,Comparator<Book>{
    private String titleString,authorString,PublisherString, ISBNString;
    private int year;
    private  List<String> chapterList= new ArrayList<>();
    // geter seter 
    @Override
    public String getTitleString() {
        return titleString;
    }

    @Override
    public void setTitleString(String titleString) {
        this.titleString = titleString;
    }

    @Override
    public String getAuthorString() {
        return authorString;
    }

    @Override
    public void setAuthorString(String authorString) {
        this.authorString = authorString;
    }

    @Override
    public String getPublisherString() {
        return PublisherString;
    }

    @Override
    public void setPublisherString(String PublisherString) {
        this.PublisherString = PublisherString;
    }

    @Override
    public String getISBNString() {
        return ISBNString;
    }

    @Override
    public void setISBNString(String ISBNString) {
        this.ISBNString = ISBNString;
    }

    @Override
    public int getYear() {
        return year;
    }

    @Override
    public void setYear(int year) {
        this.year = year;
    }
    // them hoac sua ten chuong
    @Override
    public void addOrRepairChapter(String name, int n) {
        if(n>=0 && n< chapterList.size()){
           chapterList.set(n, name);
        } else if(n == chapterList.size()){
            chapterList.add(name);
        }else   System.out.println("loi!");
    }
    //tra ve ten cua mot chuong
    @Override
    public String nameChapter(int n) {
        if(n>=0 && n < chapterList.size())
            return chapterList.get(n);
        System.out.println("loi");
        return null;
    }
    // ham nhap thong tin cho sach
    public void input(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Ten Sach          : ");
        setTitleString(sc.nextLine());
        System.out.println("Tac Gia           : ");
        setAuthorString(sc.nextLine()); 
        System.out.println("NSX               : ");
        setPublisherString(sc.nextLine());
        System.out.println("ISBN              : ");
        setISBNString(sc.nextLine());
        System.out.println("nam SX            : ");
        setYear(Integer.parseInt(sc.nextLine()));
        System.out.println("Nhap So Chuong    : ");
        int n = Integer.parseInt(sc.nextLine());
        
        String nameChapterString;
        for(int i= 0;i<n;i++){
            System.out.println("Chuong "+(i+1)+" : ");
            nameChapterString = sc.nextLine();
            addOrRepairChapter(nameChapterString, i);
        }
    }
    
    public void show(){
        System.out.println("----------------------");
        System.out.println("Ten sach            : "+getTitleString());
        System.out.println("Tac Gia             : "+getAuthorString());
        System.out.println("NSX                 : "+getPublisherString());
        System.out.println("Year                : "+getYear());
        System.out.println("ISBN                : " +getISBNString());
        System.out.println("Danh Sach Chuong: ");
        for(int i =0;i<chapterList.size();i++){
            System.out.println("chuong "+(i+1)+" : "+nameChapter(i));
        }
        System.out.println("");
    }

    @Override
    public int compare(Book t, Book t1) {
        return t.getYear()-t1.getYear();
    }
    
    
}
