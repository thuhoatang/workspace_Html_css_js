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
public class Program {
    public static void main(String[] args) {
        BookList bL = new BookList();
        bL.inputList();
        bL.sort();
        bL.showList();
    }
}
