import java.util.ArrayList;

public class MainPenggajian {
    public static void main(String[] args) {
        // 1. Membuat objek berbeda tipe
        Manajer m1 = new Manajer("M001", "Budi Santoso", 15000000, 5000000);
        Staff s1 = new Staff("S001", "Siti Aminah", 50000, 160);
        Staff s2 = new Staff("S002", "Andi Wijaya", 50000, 172);
        Freelancer f1 = new Freelancer("F001", "Naufal", 40000, 150);

        // 2. UPCASTING & POLIMORFISME
        // Simpan semua objek ke dalam ArrayList bertipe Pegawai
        ArrayList<Pegawai> daftarPegawai = new ArrayList<>();
        daftarPegawai.add(m1); // Manajer dimasukkan ke list Pegawai
        daftarPegawai.add(s1); // Staff dimasukkan ke list Pegawai
        daftarPegawai.add(s2);
        daftarPegawai.add(f1);

        // 3. VIRTUAL METHOD INVOCATION (VMI)
        // Meskipun variabel p bertipe Pegawai, method hitungGaji()
        // yang dipanggil adalah versi objek aslinya (Manajer/Staff)
        System.out.println("===== SLIP GAJI BULAN INI =====");
        for (Pegawai p : daftarPegawai) {
            System.out.println("Tipe Objek: " + p.getTipePegawai());
            p.cetakSlipGaji();
        }

        // 4. INSTANCEOF: Mengecek tipe objek saat runtime
        System.out.println("===== CEK TIPE OBJEK =====");
        for (Pegawai p : daftarPegawai) {
            if (p instanceof Manajer) {
                System.out.println(p.nama + " adalah MANAJER (dapat tunjangan)");
            } else if (p instanceof Staff) {
                System.out.println(p.nama + " adalah STAFF (gaji per jam)");
            }else if (p instanceof Freelancer) {
                System.out.println(p.nama + " adalah Freelancer (gaji = jumlah proyek x tarif/proyek)");
            }
        }

        // 5. Menghitung total pengeluaran perusahaan
        double totalPengeluaran = 0;
        for (Pegawai p : daftarPegawai) {
            totalPengeluaran += p.hitungGaji();
        }
        System.out.println("\nTotal Pengeluaran Perusahaan: Rp " + totalPengeluaran);
    }
}