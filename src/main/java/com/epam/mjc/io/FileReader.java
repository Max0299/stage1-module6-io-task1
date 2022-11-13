package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader {

    public Profile getDataFromFile(File file) {
        StringBuilder str = new StringBuilder();
        try (FileInputStream input = new FileInputStream(file)) {

            int c;
            while ((c = input.read()) != -1) {
                str.append((char) c);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        String[] array = str.toString().split("\n");

        String name = array[0];
        String age = array[1];
        String email = array[2];
        String phone = array[3];

        String[] name1 = name.split(": ");
        String[] age1 = age.split(": ");
        String[] email1 = email.split(": ");
        String[] phone1 = phone.split(": ");

        return new Profile(name1[1], Integer.parseInt(age1[1]), email1[1], Long.parseLong(phone1[1]));
    }
}
