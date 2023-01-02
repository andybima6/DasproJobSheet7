import java.util.Scanner;
public class TugasDua031D {
    public static void main(String[] args) {
     Scanner andyNugraha031D = new Scanner(System.in);

     int anak031D = 50000;
     int dewasa031D = 100000;
     int anakMasuk031D;
     int dewasaMasuk031D;
     int jumlah031D = 0;

     System.out.println("Masukkan data Pengunjung anak-anak per-harinya :");
     anakMasuk031D = andyNugraha031D.nextInt();
     System.out.println("Masukkan data Pengunjung Dewasa Per-Harinya :");
     dewasaMasuk031D = andyNugraha031D.nextInt();
    
     for(int i = 0; i <= 31; i++) {
        if (i %7 == 0){
            continue;
     }jumlah031D += (anakMasuk031D*anak031D)+(dewasaMasuk031D*dewasa031D);
     }
     System.out.println("Jmlah Uang Pemasukan Tempat Wisata sampai Akhir BUlan Agustus 2022 adalah :" + jumlah031D);
   }
}

