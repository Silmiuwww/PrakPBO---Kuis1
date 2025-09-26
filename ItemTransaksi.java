public class ItemTransaksi {
    private Produk produk;
    private int jumlah;

    public ItemTransaksi(Produk produk, int jumlah) {
        this.produk = produk;
        this.jumlah = jumlah;
    }

    public void setProduk(Produk produk) {
        this.produk = produk;
    }
    public Produk getProduk() {
        return produk;
    }

    public void setJumlah(int jumlah) {
        this.jumlah = jumlah;
    }
    public int getJumlah() {
        return jumlah;
    }

    public int hitungSubtotal() {
        return produk.getHarga() * jumlah;
    }
}