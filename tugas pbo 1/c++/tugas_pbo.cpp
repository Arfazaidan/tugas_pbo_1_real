#include <iostream>

int main() {
    // Deklarasi variabel
    int angka = 10;
    char karakter = 'A';
    double bilangan_desimal = 3.14;
    
    // Loop menggunakan for
    for (int i = 0; i < 5; i++) {
        if (i == 3) {
            continue;
        }
        std::cout << "Iterasi ke-" << i << std::endl;
    }
    
    // Loop menggunakan while
    int j = 0;
    while (j < 5) {
        std::cout << "Nilai j: " << j << std::endl;
        j++;
    }
    
    // Loop menggunakan do while
    int k = 0;
    do {
        std::cout << "Nilai k: " << k << std::endl;
        k++;
    } while (k < 5);
    
    // Array satu dimensi
    int arr_satu_dimensi[] = {1, 2, 3, 4, 5};
    
    // Array multidimensi
    int arr_multidimensi[2][3] = {{1, 2, 3}, {4, 5, 6}};
    
    // Input dan Output
    std::cout << "Masukkan angka: ";
    std::cin >> angka;
    std::cout << "Anda memasukkan: " << angka << std::endl;
    
    // Comment
    // Ini adalah contoh komentar satu baris
    
    /*
    Ini adalah contoh komentar
    multi-baris
    */
    
    return 0;
}

