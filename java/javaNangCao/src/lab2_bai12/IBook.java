/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_1;

/**
 *
 * @author Tran Dai
 */
public interface IBook {
    public String getTitleString();

    public void setTitleString(String titleString);
    public String getAuthorString();

    public void setAuthorString(String authorString);

    public String getPublisherString();

    public void setPublisherString(String PublisherString);

    public String getISBNString();

    public void setISBNString(String ISBNString);

    public int getYear();

    public void setYear(int year);
    
    public void addOrRepairChapter(String name ,int n);
    
    public String nameChapter(int n);
    
}
