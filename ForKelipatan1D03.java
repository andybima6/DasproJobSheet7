import java.util.Scanner;
public class  ForKelipatan1D03 {
    public static void main(String[] args) {
        Scanner andyNugraha031D = new Scanner(System.in);

        int kelipatan031D ,jumlah031D = 0,counter031D = 0;
        double rata031D;

        System.out.println("Masukkan Bilangan Kelipatan (1-9) : ");
        kelipatan031D = andyNugraha031D.nextInt();

        for ( int i = 1; i <= 50; i++){
            if (i % kelipatan031D == 0){
                jumlah031D += i;
                counter031D++;
            }
        }
       
        System.out.printf("banyaknya bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan031D, counter031D);
        System.out.printf("Total bilangan kelipatan %d dari 1 samapi 50 adalah %d\n", kelipatan031D, jumlah031D);

        rata031D = (jumlah031D+counter031D)/2;
        System.out.println("rata rata dari kelipatannya adalah ="+ rata031D);
        
    }
}