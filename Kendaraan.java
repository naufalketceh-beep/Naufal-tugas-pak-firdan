public class Kendaraan {
    protected String platNomor;
    protected String merk;

    public Kendaraan(String platNomor, String merk) {
        this.platNomor = platNomor;
        this.merk = merk;
    }

    // Method hitungTarif default: jarak * 1000
    public int hitungTarif(int jarak) {
        return jarak * 1000;
    }

    public String getPlatNomor() {
        return platNomor;
    }

    public String getMerk() {
        return merk;
    }
}