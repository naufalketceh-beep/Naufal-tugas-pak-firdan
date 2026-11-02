public class PegawaiBank {
    protected String id;
    protected String nama;
    protected double gajiPokok;

    public PegawaiBank(String id, String nama, double gajiPokok) {
        this.id = id;
        this.nama = nama;
        this.gajiPokok = gajiPokok;
    }

    // Method hitungGaji default (mengembalikan gaji pokok)
    public double hitungGaji() {
        return this.gajiPokok;
    }

    public String getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }
}