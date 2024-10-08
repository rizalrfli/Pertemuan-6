
import java.util.Scanner;

public class Latihan3 {
    public static void main(String[] args) {
        
        //deklarasi scanner
        Scanner input = new Scanner(System.in);

        //deklarasi variable
        int ukuran, harga = 0;
        String  merk, kategori;

        //daftar
        System.out.println("Daftar Sepatu : ");
        System.out.println("1. Converse"); 
        System.out.println("Kategori dan Ukuran : ");
        System.out.println("- Slip On (36 - 40)");
        System.out.println("- Hight Top (40 - 44)");
        System.out.println("2. Sketcher");
        System.out.println("Kategori dan Ukuran : ");
        System.out.println("- Woman (36 - 41)");
        System.out.println("- Man Top (41 - 44)");
        System.out.println("3. Nike");
        System.out.println("Kategori dan Ukuran : ");
        System.out.println("- Kids (36 - 40)");
        System.out.println("- Adult (40 - 44)");

        //input
        System.out.print("Masukkan merk sepatu\t : ");
        merk = input.nextLine();

        System.out.print("Masukkan kategori\t : ");
        kategori = input.nextLine();

        System.out.print("Masukkan ukuran\t\t : ");
        ukuran = input.nextInt();

        //logic
        if (merk.equalsIgnoreCase("converse")) {
            if (kategori.equalsIgnoreCase("slip on")) {
                harga = 800000;
            }
            else if (kategori.equalsIgnoreCase("high top")) {
                harga = 1200000;
            }
        }
        else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                harga = 1000000;
            }
            else if (kategori.equalsIgnoreCase("man")) {
                harga = 1800000;
            }
        }
        else if (merk.equalsIgnoreCase("sketcher")) {
            if (kategori.equalsIgnoreCase("woman")) {
                harga = 1000000;
            }
            else if (kategori.equalsIgnoreCase("man")) {
                harga = 1800000;
            }
        }
        else if (merk.equalsIgnoreCase("nike")) {
            if (kategori.equalsIgnoreCase("kids")) {
                harga = 750000;
            }
            else if (kategori.equalsIgnoreCase("adult")) {
                harga = 1500000;
            }
        }
        else {
            System.out.println("Merk Tidak Valid !!!");
        }

        //output
        System.out.println("Total bayar: " + harga);

    }
    
}
