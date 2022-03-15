import java.util.Scanner;

public class Nomor_3 {
    public static void main(String[] args) {
        // TODO code application logic here
        String Choose;
        Scanner scan = new Scanner(System.in);

        System.out.println("Masukkan Pilihan a/b : ");
        Choose = scan.nextLine();

        switch (Choose) {
            case "a":
                int i, j, k;
                for (i = 1; i <= 5; i++) {
                    for (j = 5 - 1; j >= i; j--) {
                        System.out.print(" ");
                    }
                    for (k = 1; k <= i; k++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case "b":
                int p, q, r, s;
                for (p = 1; p <= 5; p++) {
                    for (q = 4; q >= p; q--) {
                        System.out.print(" ");
                    }
                    for (r = 1; r <= p; r++) {
                        System.out.print("*");
                    }

                    for (s = 1; s <= p - 1; s++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            default:
                System.out.println("Harus memilih antara a/b!");
        }
    }
}
