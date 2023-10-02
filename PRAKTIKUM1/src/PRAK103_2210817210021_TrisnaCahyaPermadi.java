import java.util.Scanner;
public class PRAK103_2210817210021_TrisnaCahyaPermadi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("");
        int N = input.nextInt();
        System.out.print("");
        int bilanganAwal = input.nextInt();
        int deretKe = 1;
        do {
            if (bilanganAwal % 2 != 0) {
                System.out.print(" " + bilanganAwal);
                deretKe++;
            }
            bilanganAwal++;
        }
        while (deretKe <= N);
        input.close();;
    }
}