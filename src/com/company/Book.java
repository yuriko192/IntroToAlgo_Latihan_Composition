package com.company;

public class Book {
    //Deklarasi variable
    private String nama;
    private Author author;
    private double price;
    private int qty;

    //constructor dengan parameter Author Class
    public Book(String nama, Author author, double price, int qty) {
        this.nama = nama;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }
    //Constructor dengan parameter String dan char classnya
    public Book(String nama, String nama_penulis,String email, char gender, double price, int qty) {
        this.nama = nama;
        this.author = new Author(nama_penulis,email,gender);
        this.price = price;
        this.qty = qty;
    }
    //Constructor kosong
    public Book() {
        this.author = new Author();
    }

    //getter
    public String getNama() {
        return nama;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQty() {
        return qty;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQty(int qty) {
        this.qty = qty;
    }

    //function to string
    public String toString() {
        //return yang ngemanggil tostring Author
        //return this.nama + " by " + this.author;

        //return yang ga ngemanggila tostring Author
        return this.nama + " by " + this.author.getNama() + " (" + this.author.getGender() + ") at " + this.author.getEmail();
    }
}
