import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Deklarasi variabel
        int angka = 10;
        char karakter = 'A';
        double bilangan_desimal = 3.14;
        
        // Loop menggunakan for
        for (int i = 0; i < 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println("Iterasi ke-" + i);
        }
        
        // Loop menggunakan while
        int j = 0;
        while (j < 5) {
            System.out.println("Nilai j: " + j);
            j++;
        }
        
        // Loop menggunakan do while
        int k = 0;
        do {
            System.out.println("Nilai k: " + k);
            k++;
        } while (k < 5);
        
        // Array satu dimensi
        int[] arr_satu_dimensi = {1, 2, 3, 4, 5};
        
        // Array multidimensi
        int[][] arr_multidimensi = {{1, 2, 3}, {4, 5, 6}};
        
        // Input dan Output
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = scanner.nextInt();
        System.out.println("Anda memasukkan: " + angka);
        
        // Comment
        // Ini adalah contoh komentar satu baris
        
        /*
        Ini adalah contoh komentar
        multi-baris
        */
    }
}
