public class transaksi {
    String platNomor;
    String jenisBBM;
    int liter;
    double hargaPerLiter;
    double total;

    public transaksi(String platNomor, String jenisBBM, int liter, double hargaPerLiter) {
        this.platNomor = platNomor;
        this.jenisBBM = jenisBBM;
        this.liter = liter;
        this.hargaPerLiter = hargaPerLiter;
        this.total = liter * hargaPerLiter;
    }

    public String toString() {
        return "Plat: " + platNomor + ", BBM: " + jenisBBM + ", Liter: " + liter + ", Total: Rp" + total;
    }
}
