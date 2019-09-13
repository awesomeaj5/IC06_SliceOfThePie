package edu.miracosta.cs112.aort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int count = 0;
        double price, average, lowest=Double.MAX_VALUE, highest=Double.MIN_VALUE,total = 0;
        String line, name, lowestName, highestName;
        String[] parts;
        //Max value since zero would be lowest value
        //min value for opposite reason
        try {

            Scanner file = new Scanner(new File("USPizzaDataset.csv"));
            if (file.hasNextLine())
                file.nextLine();
            while(file.hasNextLine())
            {
                line = file.nextLine();
                parts = line.split(",");
            }
            //Close file
            file.close();
        }catch(FileNotFoundException e)
        {
            System.err.println("File can not be found");
        }
    }
}
// use String[] parts = line.split(",");
// after that we extract max price (max = Double.parseDouble(parts[6]); (6 is slot for max price
//makes array called parts where everyting before each comma is a part
//find which slot in array is each part of info (ie: maxamount is slot 6
