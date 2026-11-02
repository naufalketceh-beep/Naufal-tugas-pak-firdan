public class Mobil extends Kendaraan {

    public Mobil(String platNomor, String merk) {
        super(platNomor, merk);
        System.out.println("Mobil dipanggil");
    }

    @Override
    public int hitungTarif(int jarak) {
        return jarak * 5000;
    }
}