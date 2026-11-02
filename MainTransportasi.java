import java.util.ArrayList;

public class MainTransportasi {
    public static void main(String[] args) {
        // Berisi ArrayList<Kendaraan> untuk menyimpan semua objek
        ArrayList<Kendaraan> daftarKendaraan = new ArrayList<>();

        // Tambahkan minimal 1 objek Mobil, 1 Motor, 1 Deluxe ke ArrayList[cite: 1]
        daftarKendaraan.add(new Mobil("D 1234 ABC", "Toyota Avanza"));
        daftarKendaraan.add(new Motor("D 5678 XYZ", "Honda Beat"));
        daftarKendaraan.add(new Deluxe("D 9999 LUX", "Alphard"));

        int jarakTempuh = 10; // Contoh jarak 10 km[cite: 1]
        System.out.println("\n--- PERHITUNGAN TARIF (Jarak: " + jarakTempuh + " km) ---");

        // Iterasi & Cetak menggunakan For-each[cite: 1]
        for (Kendaraan k : daftarKendaraan) {
            int tarif = k.hitungTarif(jarakTempuh); // Penerapan VMI (Virtual Method Invocation)
            String namaClass = k.getClass().getSimpleName(); // Mendapatkan nama class asli[cite: 1]

            System.out.println("Kendaraan [" + namaClass + "] - Merk: " + k.getMerk() + 
                               " | Plat: " + k.getPlatNomor() + 
                               " | Total Tarif: Rp " + tarif);
        }
    }
}