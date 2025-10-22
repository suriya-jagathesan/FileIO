package org.example;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        String path = "C:\\Users\\Suriya\\OneDrive\\Desktop\\test2\\test.txt";
        File file = new File(path);
        System.out.println(file.exists());
        // Either you can pass location or File as object
        //noinspection resource
//        FileWriter fileWriter = new FileWriter(file,true);
//        fileWriter.write("String");
//        fileWriter.write(9);
//        fileWriter.close();
        // File Reader will read only character by Character
        FileReader fileReader = new FileReader(file);
        int output = fileReader.read();
        while( output != -1 ){

            System.out.print( (char)output );
            output = fileReader.read();
        }


//        if( !file.exists() ){
//            file.createNewFile();
//        }
//        else {
//            boolean delete = file.delete();
//            System.out.println(delete);
//        }
//        System.out.println(file.getName());
//        for(File f : file.listFiles()){
//            if( f.isFile()  ){
//                System.out.println(f.length());;
//                int s = f.getName().lastIndexOf(".");
//                System.out.println( f.getName().substring(s+1) );
//                System.out.println(f.isDirectory() + " - " + f.getName());
//            }
//        }

    }
}
