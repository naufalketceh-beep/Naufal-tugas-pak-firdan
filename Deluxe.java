public class Deluxe extends Mobil {

    public Deluxe(String platNomor, String merk) {
        super(platNomor, merk); // Memanggil constructor Mobil (mencetak "Mobil dipanggil")
    }

    @Override
    public int hitungTarif(int jarak) {
        return jarak * 10000;
    }
}