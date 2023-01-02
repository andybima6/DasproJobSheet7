import java.util.Scanner;
    public class TugasSatu031D {
        public static void main(String[] args) {
         Scanner andyNugraha031D = new Scanner(System.in);

       int batasAngka031D;

         System.out.print("Masukkan batas angka :");
         batasAngka031D = andyNugraha031D.nextInt();
            for (int i = 1; i <= 20; i++) {
                if (i % 8 == 0){
                continue;
            }else {
                System.out.print(i + " ");
            }
        }
    }
}