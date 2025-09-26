public class Produk {
    private String kodeProduk;
    private String namaProduk;
    private int harga;

    public Produk(String kodeProduk, String namaProduk, int harga) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    public void setKodeProduk(String kodeProduk) {
        this.kodeProduk = kodeProduk;
    }
    public String getKodeProduk() {
        return kodeProduk;
    }

    public void setNamaProduk(String namaProduk) {
        this.namaProduk = namaProduk;
    }
    public String getNamaProduk() {
        return namaProduk;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }
    public int getHarga() {
        return harga;
    }
}