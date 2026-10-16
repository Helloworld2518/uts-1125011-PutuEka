package uts.View;
import java.util.Scanner;

import uts.Controller.MenuController;
import uts.Model.MenuTidakDitemukanException;
public class MenuView {
    MenuController Controller = new MenuController();

     void printData() {
        for(String curr : Controller.getProductDetail()) {
            System.out.println(curr);
        }
    }

    void cekMenu(String Kode) throws MenuTidakDitemukanException{
        boolean cek = false;
        for(String check : Controller.getKode()) {
            if(check.equalsIgnoreCase(Kode)){
               cek = true;
               return;
            }
            throw new MenuTidakDitemukanException("ID Tidak Valid");
        }
    }

    public void start() throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.println("List Menu");
        Controller.addKopi(10000, "KP-001", "Kapal Api", 1);
        Controller.addTeh(10000, "AT-001", "Teh Sariwangi", 1);
        Controller.addRoti(10000, "RT-001", "Roti Coklat", 1);
        printData();

        System.out.println("===Cek Menu===");
        System.out.println("Cek Kode");
        System.out.print("Masukkan Kode: ");
        String inputKode = scn.next();
    }
}
