import java.util.Scanner; // Mengimpor library Scanner

public class ForKelipatan23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // Membuat objek Scanner

        int kelipatan, jumlah = 0, counter = 0; // Deklarasi dan inisialisasi variabel

        System.out.print("Masukkan bilangan kelipatan (1-9): ");
        kelipatan = scan.nextInt();

        // Struktur perulangan FOR dengan kondisi IF
        for (int i = 1; i <= 50; i++) {
            if (i % kelipatan == 0) {
                jumlah += i;
                counter++;
            }
        }

        System.out.printf("Banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, jumlah);
    }
}
