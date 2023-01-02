import java.util.Scanner;
public class DoWhileCuti1D03 {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int Cuti031D = 5;
        char konfirmasi031D;

        while (Cuti031D > 0) {
            System.out.println("Apakah Anda Menggunakan Jatah Cuti 1 hari (y/t)? ");
            konfirmasi031D = andyNugraha031D.next().charAt(0);
            if (konfirmasi031D == 'y' || konfirmasi031D == 'Y') {
                Cuti031D--;
                System.out.printf("Sisa %d hari\n", Cuti031D);
                if (Cuti031D == 2) {
                    System.out.println("STOP! Jatah Cuti Tinggal 2 Hari");
                    break;
                }
              } else if (konfirmasi031D == 't' || konfirmasi031D == 'T') {
                System.out.println("Akhir Program");
                break; 
              } 
    } 
    }
}
