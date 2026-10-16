package uts.Model;

import java.util.List;

public class Roti extends MenuItem implements Customizable{

    public Roti(double hargaBase, String id, String nama, int stok) {
        super(hargaBase, id, nama, stok);
    }

    @Override
    public void customize(int[] customizations) {
        
    }
    @Override
    public void customize(List<Integer> customizations) {
        
    }
    @Override
    double hitungHargaTotal(int jumlah) {
        return jumlah * getHargaBase();
    }

    @Override
    double hitungHargaTotal(int jumlah, String kodePromo) {
        String kodeValid = "XXX";
        if (kodePromo.equalsIgnoreCase(kodeValid)){
            return jumlah * getHargaBase();
        }
        return jumlah * getHargaBase();
    }

    @Override 
    double hitungHargaTotal(int jumlah, EnumUkuran ukuran) {

        if (ukuran.toString().equalsIgnoreCase("SMALL")){
            return jumlah * getHargaBase();
        }
        else if (ukuran.toString().equalsIgnoreCase("MEDIUM")){
            return jumlah * getHargaBase() * 1.2;
        }
        else{
            return jumlah * getHargaBase() * 1.5;
        }
    }

    @Override 

    public String getOrderDetail(){
        return getId() + ": " + getNama() + " - " + getStok() + " - ";
    }
}
