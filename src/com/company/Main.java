package com.company;

import java.util.Calendar;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String Fname, Lname, SA_ID;
        String getYear, getMonth, getday, gender;
        ValidationClass validationClass = new ValidationClass();
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);
//..................................................................
        System.out.print("Enter your First name ?");
        Fname = input.nextLine();
//..................................................................
        System.out.print("Enter your Last name ?");
        Lname = input.nextLine();
        //..........................................................
        do {

            System.out.print("Enter your SA ID number ?");
            SA_ID = input.nextLine();
            //........................................................
        }
        //Validating the ID number
        while (!SA_ID.matches("[0-9]+") || SA_ID.length() != 13);
        {
            getYear = SA_ID.substring(0, 2);
            getMonth = SA_ID.substring(2, 4);
            getday = SA_ID.substring(4, 6);
            gender = SA_ID.substring(6, 7);

            String twenty = "";
            String nineteenth = "";
            int ParseGender = Integer.parseInt(gender);
            if (getYear.startsWith("0") || getYear.startsWith("1")) {//2013

                twenty = "20" + getYear;
                //Displaying the date of birth
                System.out.println(getday + "/" + getMonth + "/" + twenty);
                //.......................................................................
                int FindingYear20 = Integer.parseInt(twenty);
                int FindAge20 = year - FindingYear20;
                //........................................................................
                System.out.println("You are " + FindAge20 + "years old");
                if (ParseGender >= 0 && ParseGender <= 4) {//Female
//calling the function
                    validationClass.FemaleData(twenty, Fname, Lname, getday, getMonth);

                } else if (ParseGender >= 5 && ParseGender <= 9) {//Male
                    //calling the function
                    validationClass.MaleData(twenty, Fname, Lname, getday, getMonth);
                } else {
                    System.out.println("Could not recognise Gender!! Check ID Number Please for 2013");
                }

            }
            else {//People in the nineteenth
                nineteenth = "19" + getYear;
                //printing the date of birth
                System.out.println(getday + "/" + getMonth + "/" + nineteenth);
                //.................................................................
                int FindingYear19 = Integer.parseInt(nineteenth);
                int FindAge19 = year - FindingYear19;
                System.out.println("You are " + FindAge19 + "years old");

                //................................................................
                if (ParseGender >= 0 && ParseGender <= 4) {//female
//calling the function
                    validationClass.FemaleData(nineteenth, Fname, Lname, getday, getMonth);

                } else if (ParseGender >= 5 && ParseGender <= 9) {//male
                    //calling the function
                    validationClass.MaleData(nineteenth, Fname, Lname, getday, getMonth);

                } else {
                    System.out.println("Could not recognise Gender!! Check ID Number Please");
                }

            }

        }

    }

}
