import java.util.Scanner;

public class Pemilihan2Percobaan101 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner (System.in);

         //INPUT
        System.out.print("Masukkan tahun: ");
        int tahun = input01.nextInt();
        //LOGIKA TAHUN KABISAT
        if ((tahun % 4) == 0) {
            if (( tahun % 100) != 0)
            System.out.println("Tahun Kabisat");
        }else{
            if (( tahun % 400) == 0)
            System.out.println("Tahun Kabisat");
            else
            System.out.println("Bukan Tahun Kabis");
        }
        System.out.println("Bukan Tahun Kabisat");
    }
}