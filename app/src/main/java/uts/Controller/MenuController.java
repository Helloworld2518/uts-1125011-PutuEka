package uts.Controller;

import java.util.ArrayList;
import java.util.List;

import uts.Model.Kopi;
import uts.Model.MenuItem;
import uts.Model.Roti;
import uts.Model.Teh;

public class MenuController {
    public List<MenuItem> listproduk;

    public MenuController(){
        this.listproduk = new ArrayList<>();
    }

    public void addKopi(double harga, String id, String nama, int stok){
        listproduk.add(new Kopi(harga, id,nama, stok));
    }
    public void addTeh(double harga, String id, String nama, int stok){
        listproduk.add(new Teh(harga, id,nama, stok));
    }
    public void addRoti(double harga, String id, String nama, int stok){
        listproduk.add(new Roti(harga, id,nama, stok));
    }

    public List<String> getProductDetail() {
        List<String> allProduct = new ArrayList<>();
        for (MenuItem p : listproduk) {
            allProduct.add(p.getOrderDetail());
        }
        return allProduct;
    }

    public List<MenuItem> getProductAll() {
        return listproduk;
    }

    public MenuItem getProductById(String Kode) {
        for (MenuItem p : listproduk) {
            if(p.getId().equals(Kode)){
                return p;
            }
        }
        return null;
    }
}
