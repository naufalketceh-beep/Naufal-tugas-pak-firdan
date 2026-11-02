public class Motor extends Kendaraan {

    public Motor(String platNomor, String merk) {
        super(platNomor, merk);
        System.out.println("Motor dipanggil");
    }

    @Override
    public int hitungTarif(int jarak) {
        return jarak * 2000;
    }
}