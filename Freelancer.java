public class Freelancer extends Pegawai {
    private double jumlahProyek;
    private int tarifPerProyek;

    public Freelancer(String id, String nama, double jumlahProyek, int tarifPerProyek) {
        super(id, nama);
        this.jumlahProyek = jumlahProyek;
        this.tarifPerProyek = tarifPerProyek;
    }

    @Override
    public double hitungGaji() {
        return jumlahProyek * tarifPerProyek;
    }
}