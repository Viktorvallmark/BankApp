package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
	// write your code here


    }

/*    public static void ReadFileAndInstantiateObjects(Bank bank) throws FileNotFoundException {
        File file = new File("");
        Scanner scanner = new Scanner(file);
        while(scanner.hasNextLine()){
            var line = scanner.nextLine();
            var InfoLine = line.split(":");
            var NameAge = InfoLine[0].split(",");
            var gradesArr = InfoLine[1].split(",");

            //Handle Name and Age
            var StudentName = NameAge[0];
            var StudentAge = Integer.parseInt(NameAge[1]);
            Customer c = new Customer(pNr, fullName);


            ////Handle Grades
            for(var grade : gradesArr)
            {
                c.(Integer.parseInt(grade));
            }
            Bank.AddCustomer(c);
        }
    }*/

}

