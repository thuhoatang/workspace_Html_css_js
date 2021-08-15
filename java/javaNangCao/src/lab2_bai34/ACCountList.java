/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_2;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tran Dai
 */
public class ACCountList  {
    
    List<Account> list = new ArrayList<>();
    
    // thêm 1 tài khoản mới 
    void newAccount(){
        Account ac = new Account();
        ac.fillInfo();
        list.add(ac);
        ac.query();
    }
    
    void saveFile() throws IOException{
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(new FileOutputStream("data.dat"));
            for(int i = 0;i<list.size();i++){
                oos.writeObject(list.get(i));
            }
            oos.flush();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("loi con me roi !");
        }finally{
            oos.close();
        }
    }
    
    void loadFile() throws IOException, ClassNotFoundException{
        ObjectInputStream ois = null;
        try {
            FileInputStream fis = new FileInputStream("data.dat");
            ois = new ObjectInputStream(fis);
            Account ac = null;
            
            while(fis.available() > 0){
                ac = (Account) ois.readObject();
                list.add(ac);
            }
            fis.close();
            System.out.println("okkk!!");
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            
            ois.close();
        }
    }
    
    void showAccountList(){
        list.forEach((ac) -> {
            ac.query();
        });
    }
    

    
    
}
