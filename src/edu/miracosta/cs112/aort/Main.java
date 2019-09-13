package edu.miracosta.cs112.aort;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
double amount=0 , total = 0, average = 0,  highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE;
String lowestName, highestName, name;
        try{
            Scanner file = new Scanner(new File ("USPizzaDataset.csv"));
            String [] parts;
            if(file.hasNextLine())
                file.nextLine();
            while(file.hasNextLine())
            {

              String line = file.nextLine();
              parts = line.split(",");
                amount++;
                for (int i = 0; i< parts.length; i++)
                {

                   total = Double.parseDouble(parts[6]);
                 if(total > highest)
                 highest = total;
                 if (total < lowest)
                     lowest = total;
                 name = parts[9];
                 lowestName = ;
                }

            }
            System.out.println(amount);
            System.out.println(lowest);
            System.out.println(highest);
            file.close();

        }catch (FileNotFoundException e)
        {
            System.err.println("error");
        }
    }
}
// use String[] parts = line.split(",");
// after that we extract max price (max = Double.parseDouble(parts[6]); (6 is slot for max price
//makes array called parts where everyting before each comma is a part
//find which slot in array is each part of info (ie: maxamount is slot 6
