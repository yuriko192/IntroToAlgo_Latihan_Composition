package com.company;

import java.util.Scanner;
//#include <>
//import java.util.Scanner

public class Main {
    public static void main(String[] args) {
        //deklarasi Scanner
        Scanner scan = new Scanner(System.in);

        //deklarasi variable
        String nama_author,nama_buku, email,temp;
        char gender;
        double harga;
        int qty;

        //input nilai variable
        System.out.println("masukan nama buku: ");
        nama_buku = scan.nextLine();
        System.out.println("masukan harga buku: ");
        harga = scan.nextDouble();
        System.out.println("masukan banyak buku disimpan: ");
        qty = scan.nextInt();
        scan.nextLine();
        System.out.println("masukan nama penulis buku: ");
        nama_author = scan.nextLine();
        System.out.println("masukan email penulis buku: ");
        email = scan.nextLine();
        System.out.println("masukan gender penulis buku: ");
        //cara input Character, bikin string baru, dan di input char pertamanya
        temp= scan.nextLine();
        gender = temp.charAt(0);

        //inisialisasi class
        Author penulis = new Author(nama_author,email,gender);
        Book buku = new Book(nama_buku,penulis,harga,qty);

        ///output class
        System.out.println(buku);
        scan.close();
    }

}
