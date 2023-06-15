package org.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static java.lang.String.*;
import static java.lang.System.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

    }

    void parseDishData() throws IOException {
        BufferedReader dishReader = Files.newBufferedReader(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\shardaswiggy\\data\\Dishes.csv"));
        String line;
        Dish[] menu  = new Dish[24];
        for(int dishCount = 0;(line = dishReader.readLine())!=null;dishCount++) {
            String[] dishdata = line.split(",");
            menu[dishCount] = new Dish(dishdata[0],dishdata[1],dishdata[2],Integer.valueOf(dishdata[3]));

        }
    }
    void parseRestroData() throws IOException {
        BufferedReader restroReader = Files.newBufferedReader(Paths.get("C:\\Users\\ASUS\\IdeaProjects\\shardaswiggy\\data\\Restro.csv"));
        String line;

        Dish[] tempMenu = new Dish[24];
        Restro[] restroArray = new Restro[6];
        for(int restroCount = 0;(line = restroReader.readLine())!=null;restroCount++){
            String[] restrodata = line.split(",");
            restroArray[restroCount] = new Restro(restrodata[0],restrodata[1]);

        }
    }
}

