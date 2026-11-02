public class Teller extends PegawaiBank {
    private int jumlahTransaksi;

    public Teller(String id, String nama, double gajiPokok, int jumlahTransaksi) {
        super(id, nama, gajiPokok);
        this.jumlahTransaksi = jumlahTransaksi;
    }

    @Override
    public double hitungGaji() {
        // Bonus gaji = gajiPokok + (jumlahTransaksi x 5000)
        return this.gajiPokok + (this.jumlahTransaksi * 5000);
    }
}