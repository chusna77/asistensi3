/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package asistensi;

/**
 *
 * @author SANJAYA
 */
public class Mahasiswa {
    private String nim;
private String nama;
private String jurusan;
private transient int umur;

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public int getUmur() {
        return umur;
    }

    public void setUmur(int umur) {
        this.umur = umur;
    }

    public void cetakData(){
        System.out.println("NIM : " + getNim());
        System.out.println("Nama : " + getNama());
        System.out.println("Jurusan : " + getJurusan());
        System.out.println("Umur : " + getUmur());
    }
}
