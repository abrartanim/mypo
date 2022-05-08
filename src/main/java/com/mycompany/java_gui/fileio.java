/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.java_gui;

/**
 *
 * @author abrar
 */

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileio {

    void set_doc_info(String ID, String Name, String Speacialist, String Education, String Time) {
        try {
            File obj = new File("doc_info.txt");
            if (obj.createNewFile()) {
                System.out.println("File created");
            } else {
                System.out.println("File exists");
            }

            FileWriter writer = new FileWriter("doc_info.txt", true);
            writer.write(ID + " /" + Name + " /" + Speacialist + " /" + Education + " /" + Time + "\n");
            writer.close();
            System.out.println("Successful written in the file");

        } catch (IOException e) {
            System.out.println("Error occured");
            e.printStackTrace();
        }
    }

    void read_doc_info(int i) {
        try {
            File myObj = new File("doc_info.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    // to edit current file
   void remove_line(int toRemove)  {

        try
        {
            toRemove = toRemove - 1;

            String filepath = "doc_info.txt";
            File inputFile = new File(filepath);
            File tempFile = new File("myTempFile.txt");

            BufferedReader reader = new BufferedReader(new FileReader(inputFile));
            BufferedWriter writer = new BufferedWriter(new FileWriter(tempFile));

            int line_count = 1;
            //String lineToRemove = "bbb";
            String currentLine;

            for (int i = 0; i < toRemove; i++) {
                writer.write(String.format("%s%n", reader.readLine()));
            }

            reader.readLine();

            String l;
            while (null != (l = reader.readLine())) {
                writer.write(String.format("%s%n", l));
            }

            writer.close();
            reader.close();
//            boolean successful = tempFile.renameTo(inputFile);
//            System.out.println(successful);
            boolean heh = inputFile.delete();
            File dump = new File(filepath);
            tempFile.renameTo(dump);
            //System.out.println(heh);


        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
