
import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        
        //deklarasi variabel
        int pilihan_menu;
        String member ;
        double diskon = 0, harga = 0, total_bayar = 0, total_hargaa;
        String jenisPembayaran = "qris";

        //input
        System.out.println("---------------------");
        System.out.println("=== MENU KAFE JTI ===");
        System.out.println("---------------------");
        System.out.println("1. Ricebowl");
        System.out.println("2. Ice Tea");
        System.out.println("3. Paket Bundling (Ricebowl + Ice Tea)");
        System.out.println("----------------------------------------");
        System.out.print("masukkan angka dari menua yang dipilih = ");
        pilihan_menu = input01.nextInt();
        input01.nextLine();
        System.out.print("Apakah punya member (y/n) ? = ");
        member = input01.nextLine();
        System.out.print("Bayar menggunakan qris (qris/cash): ");
        jenisPembayaran = input01.nextLine();
        System.out.println("====================================");

        //deklarasi harga menu
        switch (pilihan_menu) {
            case 1:
                harga = 12000;           
                break;
            case 2:
                harga = 7000;           
                break;
            case 3:
                harga = 20000;           
                break;
            default:
                System.out.println("menu yang dipilih tidak valid");
                return;
        }

        //total harga
        total_hargaa = harga;

        //logic jika member
        if (member.equals("y")){
            diskon = 0.10;
            System.out.println("Besar diskon 10%");

            //hitung total bayar setelah diskon
        total_bayar = total_hargaa - (total_hargaa * diskon);
        }
        else if (member.equals("n")){
            total_bayar = total_hargaa;
        }
        else {
            System.out.println("member tidak valid");
        }

        //potongan qris
        if (jenisPembayaran.equals("qris")){
            total_bayar -= 1000;
        }
        //output total harga
        System.out.println("harga normal : " + total_hargaa);
        System.out.println("total bayar: " + total_bayar);
    }
}      