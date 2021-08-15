/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab1_bai2;

import java.text.ParseException;
import java.util.List;
import java.util.Scanner;


// cái này mình kế thauwf từ QuanLy lun cho tiện chớ hông phải kế thừa từ Person nha
public class KhoaHoc extends QuanLy{
    private int sobaiBao;

    public int getSobaiBao() {
        return sobaiBao;
    }

    public void setSobaiBao(int sobaiBao) {
        this.sobaiBao = sobaiBao;
    }

    @Override
    void nhap() throws ParseException {
        Scanner sc = new Scanner(System.in);
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("Nhap so Bia bao : ");
        setSobaiBao(Integer.parseInt(sc.nextLine()));
    }

    @Override
    void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("so bai bao      : ");
    }

    }

    