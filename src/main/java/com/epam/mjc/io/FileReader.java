package com.epam.mjc.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;


public class FileReader {

    public void getDataFromFile(File file) {
        try(FileInputStream input = new FileInputStream(file)){

            int c;
            while ((c=input.read()) != 1){
                System.out.println((char)c);
            }

        }catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
