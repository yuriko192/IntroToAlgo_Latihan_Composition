package com.company;

public class Author {
    //deklarasi variable
    private String nama, email;
    private char gender;

    //constructor dengan parameter
    public Author(String nama, String email, char gender) {
        this.nama = nama;
        this.email = email;
        this.gender = gender;
    }
    //constructor kosong tanpa parameter
    public Author(){
    }

    //Getter
    public String getNama() {
        return nama;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    //Setter
    public void setNama(String nama) {
        this.nama = nama;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    //Function toString
    public String toString() {
        return this.nama + " (" + this.gender + ") at "+ this.email;
    }
}
