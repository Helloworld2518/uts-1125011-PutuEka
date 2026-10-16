package uts.View;
import uts.Controller.MenuController;
public class MenuView {
    MenuController Controller = new MenuController();

     void printData() {
        for(String curr : Controller.getProductDetail()) {
            System.out.println(curr);
        }
    }

    public void start() {
        
        Controller.addKopi(10000, "KP-001", "Kapal Api", 1);
        Controller.addTeh(10000, "AT-001", "Teh Sariwangi", 1);
        Controller.addRoti(10000, "RT-001", "Roti Coklat", 1);
        printData();
        
    }
}
