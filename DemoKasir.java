public class DemoKasir {
    public static void main(String[] args) {
        Produk p1 = new Produk("P001", "Nasi Goreng", 12000);
        Produk p2 = new Produk("P002", "Es Teh", 4000);
        Produk p3 = new Produk("P003", "Mie Ayam", 10000);

        Transaksi transaksi = new Transaksi("26-09-2025");

        transaksi.tambahItem(p1, 2); 
        transaksi.tambahItem(p2, 3); 
        transaksi.tambahItem(p3, 1);

        transaksi.tampilNota();
    }
}
