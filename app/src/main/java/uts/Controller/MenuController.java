package uts.Controller;

import java.util.ArrayList;
import java.util.List;

import uts.Model.Kopi;
import uts.Model.MenuItem;
import uts.Model.Roti;
import uts.Model.Teh;

public class MenuController {
    public List<MenuItem> listproduk;
    public List<String> listKode;
    public 

    public MenuController(){
        this.listproduk = new ArrayList<>();
        this.listKode = new ArrayList<>();
    }

    public void addKopi(double harga, String id, String nama, int stok){
        listproduk.add(new Kopi(harga, id,nama, stok));
        listKode.add(id);
    }
    public void addTeh(double harga, String id, String nama, int stok){
        listproduk.add(new Teh(harga, id,nama, stok));
        listKode.add(id);
    }
    public void addRoti(double harga, String id, String nama, int stok){
        listproduk.add(new Roti(harga, id,nama, stok));
        listKode.add(id);
    }

    public List<String> getProductDetail() {
        List<String> allProduct = new ArrayList<>();
        for (MenuItem p : listproduk) {
            allProduct.add(p.getOrderDetail());
        }
        return allProduct;
    }

    public List<String> getKode() {
        List<String> allProduct = new ArrayList<>();
        for (MenuItem p : listproduk) {
            allProduct.add(p.getId());
        }
        return allProduct;
    }
}
