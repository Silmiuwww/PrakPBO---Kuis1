public class DemoReservasi {
    public static void main(String[] args) {
        Ruangan r1 = new Ruangan("R101", "Lab Pemrograman", 30, "Tersedia");

        Reservasi reservasi = new Reservasi("26-09-2025", 5, r1);

        Mahasiswa m1 = new Mahasiswa("244107060101", "Rama");
        Mahasiswa m2 = new Mahasiswa("244107060102", "Naldi");

        reservasi.tambahMahasiswa(m1);
        reservasi.tambahMahasiswa(m2);

        reservasi.tampilReservasi();
    }
}