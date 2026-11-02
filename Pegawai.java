public class Pegawai {
    protected String nama;
    protected String id;

    // Constructor
    public Pegawai(String id, String nama) {
        this.id = id;
        this.nama = nama;
    }

    // Method yang akan di-override oleh subclass
    // Method ini mengembalikan gaji default (0)
    public double hitungGaji() {
        return 0;
    }

    // Method untuk mencetak slip gaji
    // Method ini akan memanggil hitungGaji() polimorfisme terjadi di sini
    public void cetakSlipGaji() {
        System.out.println("ID   : " + id);
        System.out.println("Nama : " + nama);
        System.out.println("Gaji : RP " + hitungGaji());
        System.out.println("------------------------");
    }

    // Method untuk mendapatkan nama class asli objek
    public String getTipePegawai() {
        return this.getClass().getSimpleName();
    }
}