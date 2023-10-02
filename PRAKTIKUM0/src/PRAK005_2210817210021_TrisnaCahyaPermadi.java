import java.util.Scanner;
public class PRAK005_2210817210021_TrisnaCahyaPermadi {
    static public void main(String[]args){
        Scanner userinput = new Scanner(System.in);
        System.out.print("Masukan Makanan Favorit : ");
        String Makanan = userinput.next();
        System.out.print("Masukan Hobi            : ");
        String Hobi = userinput.next();
        System.out.println("Aku suka Makan " + Makanan + ", dan Hobiku " + Hobi);
    }
}
