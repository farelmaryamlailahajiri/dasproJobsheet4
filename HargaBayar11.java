import java.util.Scanner;

public class HargaBayar11 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int harga, jumlah, jmlHalBuku;
        double dis=0.5, total, bayar, jmlDis;
        String merkBuku;
        System.out.println("Masukkan harga buku yang dibeli");
        harga=input.nextInt();
        System.out.println("Masukkan jumlah buku yang dibeli");
        jumlah=input.nextInt();
        System.out.println("Masukkan jumlah halaman buku");
        jmlHalBuku=input.nextInt();
        System.out.println("Masukkan merk buku");
        merkBuku=input.next();

        total =harga*jumlah;
        jmlDis =total*dis;
        bayar =total-jmlDis;

        System.out.println("Total belanjaan anda adalah " + total);
        System.out.println("Diskon yang anda dapatkan adalah " + jmlDis);
        System.out.println("Total yang harus anda bayar adalah " + bayar);
        System.out.println("Jumlah halaman buku anda adalah: " + jmlHalBuku);
        System.out.println("Merk buku: " + merkBuku);
    }
}