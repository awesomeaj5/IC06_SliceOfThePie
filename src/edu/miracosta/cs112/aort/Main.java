package edu.miracosta.cs112.aort;
import java.text.NumberFormat;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
double price= 0, amount=0 , total = 0, average = 0,  highest = Double.MIN_VALUE, lowest = Double.MAX_VALUE,
        highestO = Double.MIN_VALUE, lowestO= Double.MAX_VALUE, averageO = 0, priceO = 0, totalO = 0;
String lowestName = "", highestName="", lowestNameO = "", highestNameO= "";
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
//                for (int i = 0; i< parts.length; i++)
//                {

                   price = Double.parseDouble(parts[6]);
                   total+= price;

                 if(price > highest) {
                     highest = price;
                     highestName = parts[9];
                 }
                 if (price < lowest) {
                     lowest = price;
                     lowestName = parts[9];
                 }
                 average = total / amount;
                 if(parts[2].equals("Oceanside"))
                 {

                     if(price > highestO) {
                         highestO = price;
                         highestNameO = parts[9];
                     }
                     if (price < lowestO) {
                         lowestO = price;
                         lowestNameO = parts[9];
                     }
                 }




                //}


            }
            NumberFormat currency = NumberFormat.getCurrencyInstance();
            System.out.println("Highest priced pizza place nationally is " + highestName);
            System.out.println("With a price of " + currency.format(highest));
            System.out.println("The lowest priced pizza place nationally is " + lowestName);
            System.out.println("With a price of " + currency.format(lowest));
            System.out.println("The average price of a slice of pizza is " + currency.format(average));
            System.out.println("The highest priced pizza place in Oceanside is " + highestNameO);
            System.out.println("At a price of " + currency.format(highestO));
            System.out.println("The lowest priced pizza place in Oceanside is " + lowestNameO);
            System.out.println("At a price of " + currency.format(lowestO));
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
