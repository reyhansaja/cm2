import java.util.Scanner;

public class SPBUMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        AntrianKendaraan antrian = new AntrianKendaraan();
        QueueTransaksi transaksiQueue = new QueueTransaksi(100);

        while (true) {
            System.out.println("\n=== SISTEM SPBU ===");
            System.out.println("1. Tambah Kendaraan ke Antrian");
            System.out.println("2. Lihat Daftar Antrian");
            System.out.println("3. Jumlah Antrian");
            System.out.println("4. Layani Kendaraan");
            System.out.println("5. Lihat Riwayat Transaksi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            int pilih = sc.nextInt(); sc.nextLine();

            switch (pilih) {
                case 1:
                    System.out.print("Plat Nomor: ");
                    String plat = sc.nextLine();
                    System.out.print("Jenis Kendaraan: ");
                    String jenis = sc.nextLine();
                    antrian.tambahAntrian(kendaraan(plat, jenis));
                    break;
                case 2:
                    antrian.tampilAntrian();
                    break;
                case 3:
                    System.out.println("Jumlah antrian: " + antrian.jumlahAntrian());
                    break;
                case 4:
                    Kendaraan dilayani = antrian.layaniKendaraan();
                    if (dilayani == null) {
                        System.out.println("Antrian kosong.");
                    } else {
                        System.out.println("Melayani: " + dilayani);
                        System.out.print("Jenis BBM: ");
                        String bbm = sc.nextLine();
                        System.out.print("Jumlah Liter: ");
                        int liter = sc.nextInt(); sc.nextLine();
                        System.out.print("Harga per Liter: ");
                        double harga = sc.nextDouble(); sc.nextLine();
                        Transaksi trx = new Transaksi(dilayani.platNomor, bbm, liter, harga);
                        transaksiQueue.enqueue(trx);
                        System.out.println("Total Bayar: Rp" + trx.total);
                    }
                    break;
                case 5:
                    transaksiQueue.tampilTransaksi();
                    break;
                case 0:
                    System.out.println("Terima kasih!");
                    System.exit(0);
            }
        }
    }

    private static kendaraan kendaraan(String plat, String jenis) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'kendaraan'");
    }
}
