public class CustomerService extends PegawaiBank {
    private int ratingKepuasan; // skala 1-5

    public CustomerService(String id, String nama, double gajiPokok, int ratingKepuasan) {
        super(id, nama, gajiPokok);
        this.ratingKepuasan = ratingKepuasan;
    }

    @Override
    public double hitungGaji() {
        // Bonus gaji = gajiPokok + (ratingKepuasan x 500000)
        return this.gajiPokok + (this.ratingKepuasan * 500000);
    }
}