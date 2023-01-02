import java.util.Scanner;
public class WhileGaji1D03 {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        String jabatan031D;
                int karyawan031D,jam031D,gaji031D,jumlah031D = 0;

        System.out.println("Masukkan jumlah karyawan :");
        karyawan031D = andyNugraha031D.nextInt();

        int i = 0;
        while (i < karyawan031D){
            System.out.println("Pilihlah jabatan - Direktur, Manager, Staf");
            System.out.println("Masukkan Jabatan Karyawan ke- " + (i + 1) + ": ");
            jabatan031D = andyNugraha031D.next();
            System.out.println("Masukkan Jumlah Jam Lembur :");
            jam031D = andyNugraha031D.nextInt();
            if (jabatan031D.equalsIgnoreCase("Direktur")) {
                continue;
            }else if (jabatan031D.equalsIgnoreCase("Manager")) {
                gaji031D = jam031D * 100000;
            }else {
                gaji031D = jam031D * 75000;
            }
            jumlah031D += gaji031D;
            i++;
        }
        System.out.println("Pengeluaran perusahan = " + jumlah031D);
}
}
