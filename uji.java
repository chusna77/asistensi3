/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package asistensi;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 *
 * @author SANJAYA
 */
public class uji {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        Mahasiswa mahasiswa = new Mahasiswa();
        mahasiswa.setNim("07410100133");
        mahasiswa.setNama("I Gede Arya Wiratama");
        mahasiswa.setJurusan("Sistem Informasi");
        mahasiswa.setUmur(22);
        mahasiswa.cetakData();
        //Serialized Object
        try {
            FileOutputStream outputStream = new FileOutputStream("mahasiswa.ser");
            ObjectOutputStream stream = new ObjectOutputStream(outputStream);
            stream.writeObject(mahasiswa);
            stream.close();
            outputStream.close();
        } catch (IOException exception) {
        }

        System.out.println();

        //Deserialization Object
        System.out.println("Deserialized Object....");
        try {
            FileInputStream inputStream = new FileInputStream("mahasiswa.ser");
            ObjectInputStream stream = new ObjectInputStream(inputStream);
            Mahasiswa mhs = (Mahasiswa) stream.readObject();
            mhs.cetakData();
            stream.close();
            inputStream.close();
        } catch (IOException exception) {

        } catch (ClassNotFoundException exception) {

        }
    }
}
