package com.assignment;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//   ASSIGNMENT 1
////      Deklarasi
//        int nim;
//        String nama;
//        String jurusan;
//
////      Assgnment
//        nim = 1822499651;
//        nama = "Helminda Dewi Marunduri";
//        jurusan = "Teknik Infomatika";
//
////      output
//        System.out.println("Hallo Kawan Kawan");
//        System.out.println("Perkenalkan..");
//        System.out.println("Nama : " + nama);
//        System.out.println("NIM : " + nim);
//        System.out.println("Jurusan : " + jurusan);


//  ASSIGNMENT 2 IF ELSE IF

//      Deklarasi
        String nama, poli, r_tunggu = null;
        int nik, id_pasien, no_kk;

//      Assgnment with Scanner
        Scanner scanner = new Scanner(System.in);

//      Scanner
        System.out.println("INPUT");
        System.out.print("Masukan nama :");
        nama = scanner.nextLine();

        System.out.print("Masukan Poli :");
        poli = scanner.nextLine();

        System.out.print("Masukan nik :");
        nik = scanner.nextInt();

        System.out.print("Masukan no kk :");
        no_kk = scanner.nextInt();

        System.out.print("Masukan ID Reg Pasien :");
        id_pasien = scanner.nextInt();


//      Print
        System.out.println("\n");
        System.out.println("OUTPUT");
        System.out.println("Registrasi No Antrian Pasien Puskesmas XXX" );
        System.out.println("NIK :"  + nik);
        System.out.println("No KK :"  + no_kk);
        System.out.println("Nama :"  + nama);
        System.out.println("ID Reg Pasien :"  + id_pasien);
        System.out.println("Poli :"  + poli);

// Rule If Else If
        if (poli.equals("anak")){
            System.out.println("Ruang Tunggu : Lantai 2 Gedung A");
        }else if(poli.equals("kandungan")){
            System.out.println("Ruang Tunggu : Lantai 3 Gedung B");
        }else if(poli.equals("penyakit dalam")){
            System.out.println("Ruang Tunggu : Lantai 2 Blok B");
        }else {
            System.out.println("Ruang Tunggu : Poli Tidak Tersedia..");
        }

    }
}
