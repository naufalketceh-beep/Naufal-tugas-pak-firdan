import java.util.ArrayList;

public class MainBank {
    public static void main(String[] args) {
        // Menyimpan semua objek ke dalam ArrayList<PegawaiBank> (Polimorfisme)
        ArrayList<PegawaiBank> daftarPegawai = new ArrayList<>();

        // Menambahkan data pegawai (Teller, CS, Manajer)
        daftarPegawai.add(new Teller("T001", "Andi", 4000000, 150));
        daftarPegawai.add(new CustomerService("CS001", "Budi", 4500000, 4));
        daftarPegawai.add(new ManajerBank("M001", "Citra", 8000000, true));
        daftarPegawai.add(new Teller("T002", "Dewi", 4000000, 200));
        daftarPegawai.add(new CustomerService("CS002", "Eko", 4500000, 5));
        daftarPegawai.add(new ManajerBank("M002", "Fajar", 8000000, false));

        // Variabel untuk menghitung jumlah masing-masing posisi & total pengeluaran
        int jmlTeller = 0;
        int jmlCS = 0;
        int jmlManajer = 0;
        double totalPengeluaran = 0;

        System.out.println("==================================================");
        System.out.println("          LAPORAN GAJI PEGAWAI BANK               ");
        System.out.println("==================================================");

        // Menampilkan laporan gaji seluruh pegawai
        for (PegawaiBank p : daftarPegawai) {
            double totalGaji = p.hitungGaji(); // Penerapan VMI (Virtual Method Invocation)
            totalPengeluaran += totalGaji;

            String jenisJabatan = "";

            // Menggunakan instanceof untuk menghitung jumlah Teller, CS, dan Manajer
            if (p instanceof Teller) {
                jenisJabatan = "Teller";
                jmlTeller++;
            } else if (p instanceof CustomerService) {
                jenisJabatan = "Customer Service";
                jmlCS++;
            } else if (p instanceof ManajerBank) {
                jenisJabatan = "Manajer Bank";
                jmlManajer++;
            }

            System.out.println("ID   : " + p.getId());
            System.out.println("Nama : " + p.getNama());
            System.out.println("Role : " + jenisJabatan);
            System.out.println("Gaji : Rp " + totalGaji);
            System.out.println("--------------------------------------------------");
        }

        // Menampilkan ringkasan statistik
        System.out.println("\n==================================================");
        System.out.println("               RINGKASAN STATISTIK                ");
        System.out.println("==================================================");
        System.out.println("Jumlah Teller         : " + jmlTeller);
        System.out.println("Jumlah Customer Svc   : " + jmlCS);
        System.out.println("Jumlah Manajer Bank   : " + jmlManajer);
        System.out.println("Total Pegawai         : " + daftarPegawai.size());
        System.out.println("--------------------------------------------------");
        System.out.println("Total Pengeluaran Bank: Rp " + totalPengeluaran);
        System.out.println("==================================================");
    }
}