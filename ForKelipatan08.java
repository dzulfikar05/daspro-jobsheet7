import java.util.Scanner;
public class ForKelipatan08 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int kelipatan, total=0, jumlah=0, counter=0, avg;

        System.out.print("Masukkan bilangan kelipatan (1-9) : ");
        kelipatan = scan.nextInt();

        for(int i = 1; i<=50; i++){
            if(i% kelipatan == 0){
                total += i;
                counter++;
            }
        }

        avg = total / counter;

        System.out.printf("Banyak bilangan %d dari 1 sampai 50 adalah %d\n", kelipatan, counter);
        System.out.printf("Total bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, total);
        System.out.printf("Rata rata dari seluruh bilangan kelipatan %d dari 1 sampai 50 adalah %d\n", kelipatan, avg);
    }
}