
import java.util.Scanner;

public class Latihan2 {
    public static void main(String[] args) {

        //deklarasi scanner
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        String jenis_buku;
        int jumlah;
        float diskon = 0;

        //inputan
        System.out.print("Masukkan jenis buku: ");
        jenis_buku = input.nextLine();

        System.out.print("Masukkan jumlah: ");
        jumlah = input.nextInt();

        //logic
        //diskon kamus
        if (jenis_buku.equalsIgnoreCase("kamus")) {
            diskon = 0.10f;
            if (jumlah > 2) {
                diskon += 0.2f;
            }
        }

        //diskon novel
        else if (jenis_buku.equalsIgnoreCase("novel")) {
            diskon = 0.7f;
            if (jumlah > 3) {
                diskon += 0.02f;
            }
            else if (jumlah <= 3) {
                diskon += 0.01f;
            }
        }

        //diskon selain kamus dan novel
        else {
            if (jumlah > 3) {
                diskon = 0.05f;
            }
        }

        //output
        System.out.println("");
        System.out.println("----------------------------------------------");

        System.out.println("Anda mendapat diskon: " + diskon);
    }
}
