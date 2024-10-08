public class Latihan1 {
    public static void main(String[] args) {

        //deklarasi variable
        int bil1 = 28 , bil2 = 54, bil3 = 15, bilmax;

        //logic bilangan
        if (bil1 > bil2 ){
            if (bil1 > bil3){
                bilmax = bil1;
            }else {
                bilmax = bil3;
            }
        }else {
            if (bil2 > bil3){
                bilmax = bil2;
            }else {
                bilmax = bil3;
            }
        }

        //output
        System.out.println("Output bil besar: " + bilmax);
    }
}
