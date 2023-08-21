/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class toDoList {
    int MAX_TUGAS = 5;
    String[] listTugas = new String[MAX_TUGAS];
    int jumlahTugas = 0;

    public void tambahTugas(String tugasBaru) {
        listTugas[jumlahTugas] = tugasBaru;
        jumlahTugas++;
    }

    public void tampilkanTugas() {
        if (jumlahTugas > 0) {
            for (int i = 0; i < jumlahTugas; i++) {
                System.out.println(i + 1 + ". " + listTugas[i]);
            }
        } else {
            System.out.println("To-Do List Kosong!");
        }
    }

    public void hapusTugas(int noTugasDihapus) {
        if (noTugasDihapus >= 1 && noTugasDihapus <= jumlahTugas) {
            for (int i = noTugasDihapus - 1; i < jumlahTugas - 1; i++) {
                listTugas[i] = listTugas[i + 1];
            }
            jumlahTugas--;
        } else {
            System.out.println("Nomer Tugas Tidak Valid!");
        }
    }
}
