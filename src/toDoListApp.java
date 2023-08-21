/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class toDoListApp {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        int pilihan;

        toDoList tdl = new toDoList();

        do {
            System.out.println("\n===== TO-DO LIST =====");
            System.out.println("1. Tambah Tugas");
            System.out.println("2. Tampilkan Tugas");
            System.out.println("3. Hapus Tugas");
            System.out.println("0. Keluar");

            System.out.print("Pilih menu (0-3): ");
            pilihan = userInput.nextInt();

            switch (pilihan) {
                case 0:
                    System.out.println("Terima kasih, sampai jumpa!");
                    break;
                case 1:
                    System.out.println("======== TAMBAH TUGAS ==========");
                    if (tdl.jumlahTugas < tdl.MAX_TUGAS){
                        System.out.print("Masukkan Tugas: ");
                        userInput.nextLine();
                        String tugasBaru = userInput.nextLine();
                        tdl.tambahTugas(tugasBaru);
                        System.out.println("Tugas Berhasil Ditambahkan!");
                    } else {
                        System.out.println("Maaf, To-Do List penuh!");
                    }
                    break;
                case 2:
                    System.out.println("======== LIST TUGAS ==========");
                    tdl.tampilkanTugas();
                    break;
                case 3:
                    System.out.println("======== HAPUS TUGAS ==========");
                    if (tdl.jumlahTugas > 0){
                        tdl.tampilkanTugas();
                        System.out.print("Pilih Nomer yang ingin dihapus: ");
                        int noDihapus = userInput.nextInt();
                        tdl.hapusTugas(noDihapus);
                    }
                    break;
                default:
                    System.err.println("\nInput anda tidak ditemukan\nSilahkan pilih (0-3)");
            }
        } while (pilihan != 0);
    }
}
