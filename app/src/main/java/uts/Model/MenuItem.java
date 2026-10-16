package uts.Model;

public abstract class MenuItem {
    private String id;
    private String nama;
    private double hargaBase;
    private int stok;

    public void setStok(int stok) {
        this.stok = stok;
    }

    public MenuItem(double hargaBase, String id, String nama, int stok) {
        this.hargaBase = hargaBase;
        this.id = id;
        this.nama = nama;
        this.stok = stok;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public double getHargaBase() {
        return hargaBase;
    }

    public int getStok() {
        return stok;
    }

    
    abstract double hitungHargaTotal(int jumlah);
    abstract double hitungHargaTotal(int jumlah, String kodePromo);
    abstract double hitungHargaTotal(int jumlah, EnumUkuran ukuran);
    abstract String getOrderDetail(); 
}
