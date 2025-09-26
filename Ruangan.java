public class Ruangan {
    private String kodeRuangan;
    private String namaRuangan;
    private int kapasitas;
    private String status; 

    public Ruangan(String kodeRuangan, String namaRuangan, int kapasitas, String status) {
        this.kodeRuangan = kodeRuangan;
        this.namaRuangan = namaRuangan;
        this.kapasitas = kapasitas;
        this.status = status;
    }

    public void setKodeRuangan(String kodeRuangan) {
        this.kodeRuangan = kodeRuangan;
    }
    public String getKodeRuangan() {
        return kodeRuangan;
    }

    public void setNamaRuangan(String namaRuangan) {
        this.namaRuangan = namaRuangan;
    }
    public String getNamaRuangan() {
        return namaRuangan;
    }

    public void setKapasitas(int kapasitas) {
        this.kapasitas = kapasitas;
    }
    public int getKapasitas() {
        return kapasitas;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }
}