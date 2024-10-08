
import java.util.Scanner;

public class Pemilihan2Percobaan301 {
    public static void main(String[] args) {
        
        //add scanner
        Scanner input01 = new Scanner(System.in);
         
        //Deklaraso variabel
        String kategori;
        int penghasilan;
        double pajak;
        int gajiBersih = 0;

        //input kategori
        System.out.print("Masukkan kategori: ");
        kategori = input01.nextLine();
        System.out.print("Masukkan penghasilan: ");
        penghasilan = input01.nextInt();

        //deklarasi  kategori

        if (kategori.equals("pekerja")){
           if (penghasilan <= 2000000)
                pajak = 0.1;
            else if (penghasilan <= 3000000)
                pajak = 0.15;
            else 
            pajak = 0.2;
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih: " + gajiBersih);

        }else if (kategori.equals("pebisnis")){
            if (penghasilan <= 2500000)
            pajak = 0.15;
            else if (penghasilan <= 3500000)
            pajak = 0.2;
            else 
            pajak = 0.25;
            gajiBersih = (int) (penghasilan - (penghasilan * pajak));
            System.out.println("Penghasilan bersih: " + gajiBersih);
        }else{
            System.out.println("Kategori salah");
        }
    }
}
