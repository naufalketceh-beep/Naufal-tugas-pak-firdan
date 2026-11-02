public class Manajer extends Pegawai {
    private double gajiPokok;
    private double tunjanganJabatan;
    public Manajer(String id, String nama, double gajiPokok, double tunjanganJabatan) {
        super(id, nama) ; // Panggil constructor parent
        this.gajiPokok = gajiPokok;
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // OVERRIDING: Mengganti implementasi hitungGaji() versi Pegawai
    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
}