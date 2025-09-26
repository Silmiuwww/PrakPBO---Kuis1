import java.util.ArrayList;

public class Transaksi {
    private String tanggal;
    private ArrayList<ItemTransaksi> daftarItem;

    public Transaksi(String tanggal) {
        this.tanggal = tanggal;
        this.daftarItem = new ArrayList<>();
    }

    public void setTanggal(String tanggal) {
        this.tanggal = tanggal;
    }

    public String getTanggal() {
        return this.tanggal;
    }

    public void tambahItem(Produk p, int jumlah) {
        ItemTransaksi item = new ItemTransaksi(p, jumlah);
        this.daftarItem.add(item);
    }

    public int hitungTotal() {
        int total = 0;
        for (ItemTransaksi item : daftarItem) {
            total += item.hitungSubtotal();
        }
        return total;
    }

    public void tampilNota() {
        System.out.println("=== Nota Pembelian ===");
        System.out.println("Tanggal : " + this.tanggal);
        System.out.println("--------------------------");
        System.out.println("Kode | Nama | Harga | Jumlah | Subtotal");
        for (ItemTransaksi item : daftarItem) {
            Produk p = item.getProduk();
            System.out.println(p.getKodeProduk() + " | " + p.getNamaProduk() + " | " + p.getHarga() + " | "  + item.getJumlah() + " | " + item.hitungSubtotal());
        }
        System.out.println("--------------------------");
        System.out.println("TOTAL : " + this.hitungTotal());
    }
}
