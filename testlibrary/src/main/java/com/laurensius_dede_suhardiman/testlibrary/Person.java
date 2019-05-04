package com.laurensius_dede_suhardiman.testlibrary;

public class Person {

    String nama;
    String alamat;
    String umur;

    public Person(String nama, String alamat,String umur){
        this.nama = nama;
        this.alamat = alamat;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getUmur() {
        return umur;
    }
}
