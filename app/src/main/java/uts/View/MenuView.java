package uts.View;
import java.util.Scanner;

import uts.Controller.MenuController;
import uts.Model.MenuItem;
import uts.Model.MenuTidakDitemukanException;
import uts.Model.StokTidakCukupException;
import uts.Utils.Util;
public class MenuView {
    MenuController Controller = new MenuController();

     void printData() {
        for(String curr : Controller.getProductDetail()) {
            System.out.println(curr);
        }
    }

    void cekMenu(String Kode) throws MenuTidakDitemukanException{
        boolean cek = false;
        for(MenuItem check : Controller.getProductAll()){
            if(check.getId().equalsIgnoreCase(Kode)){
               cek = true;
               System.out.println(check.getOrderDetail());
               return;
            }
             throw new MenuTidakDitemukanException("ID Tidak Valid");
            
        }
    }

    // 

    public void start() throws StokTidakCukupException, MenuTidakDitemukanException{
        Scanner scn = new Scanner(System.in);
        System.out.println("List Menu");
        Controller.addKopi(10000, "KP-001", "Kapal Api", 1);
        Controller.addTeh(10000, "AT-001", "Teh Sariwangi", 1);
        Controller.addRoti(10000, "RT-001", "Roti Coklat", 1);
        printData();

        System.out.println("===Masukkan Menu Dengan Kode===");
        String inputKode = Util.getString();
        cekMenu(inputKode);


    }
}
