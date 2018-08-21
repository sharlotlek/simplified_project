package com.company;

import java.util.Calendar;
import java.util.Scanner;

enum MONTH
{
    JAN, FEB, MAR,APR,MAY,JUN,JUL,AUG,SEPT,OCT,NOV,DEC;
}
public class Main {

    public static void main(String[] args) {

        String Fname, Lname, SA_ID;
        String getYear, getMonth, getday, gender;
        //String jan,feb,mar,apr,may,jun,jul,aug,sept,oct,nov,dec="";
        int year = Calendar.getInstance().get(Calendar.YEAR);
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your First name ?");
        Fname = input.nextLine();

        System.out.print("Enter your Last name ?");
        Lname = input.nextLine();
        do {

            System.out.print("Enter your SA ID number ?");
            SA_ID = input.nextLine();


        }
     //Validating the ID number
        while (!SA_ID.matches("[0-9]+") || SA_ID.length() != 13);
        {
            getYear = SA_ID.substring(0, 2);
            getMonth = SA_ID.substring(2, 4);
            getday = SA_ID.substring(4, 6);
            gender = SA_ID.substring(6, 7);
            String concartinate20 = "";
            String concartinate19 = "";
            int ParseGender = Integer.parseInt(gender);

            //getting for date people born after 1999
            if (getYear.startsWith("0")) {

                concartinate20 = "20" + getYear;
                System.out.println(getday + "/" + getMonth + "/" + concartinate20);
                //getting the age

                int FindingYear20 = Integer.parseInt(concartinate20);
                int FindAge20 = year - FindingYear20;
                System.out.println("You are " + FindAge20 + "years old");

                //Validating the gender if its between 0 and 4
                if (ParseGender >= 0 || ParseGender <= 4) {
                    //getting the month for the female
                    System.out.println("You are a Female");
                    if (getMonth.startsWith("01")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.JAN + " " + concartinate20);
                    } else if (getMonth.startsWith("02")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.FEB + " " + concartinate20);
                    } else if (getMonth.startsWith("03")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.MAR + " " + concartinate20);
                    } else if (getMonth.startsWith("04")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.APR + " " + concartinate20);
                    } else if (getMonth.startsWith("05")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.MAY + " " + concartinate20);
                    } else if (getMonth.startsWith("06")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.JUN + " " + concartinate20);
                    } else if (getMonth.startsWith("07")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.JUL + " " + concartinate20);
                    } else if (getMonth.startsWith("08")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.AUG + " " + concartinate20);
                    } else if (getMonth.startsWith("09")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.SEPT + " " + concartinate20);
                    } else if (getMonth.startsWith("10")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.OCT + " " + concartinate20);
                    } else if (getMonth.startsWith("11")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.NOV + " " + concartinate20);
                    } else if (getMonth.startsWith("12")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.DEC + " " + concartinate20);
                    } else {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + "ERROR IN GETTING MONTH" + " " + concartinate20);
                    }
                }
                   //Validating the gender if its between 5 and 9
                else if (ParseGender >= 5 || ParseGender <= 9) {

                    System.out.println("You are a Male");
                    //getting the month for the male

                    if (getMonth.startsWith("01")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.JAN + " " + concartinate20);
                    } else if (getMonth.startsWith("02")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.FEB + " " + concartinate20);
                    } else if (getMonth.startsWith("03")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.MAR + " " + concartinate20);
                    } else if (getMonth.startsWith("04")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.APR + " " + concartinate20);
                    } else if (getMonth.startsWith("05")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.MAY + " " + concartinate20);
                    } else if (getMonth.startsWith("06")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.JUN + " " + concartinate20);
                    } else if (getMonth.startsWith("07")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.JUL + " " + concartinate20);
                    } else if (getMonth.startsWith("08")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.AUG + " " + concartinate20);
                    } else if (getMonth.startsWith("09")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.SEPT + " " + concartinate20);
                    } else if (getMonth.startsWith("10")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.OCT + " " + concartinate20);
                    } else if (getMonth.startsWith("11")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.NOV + " " + concartinate20);
                    } else if (getMonth.startsWith("12")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.DEC + " " + concartinate20);
                    } else {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + "ERROR IN GETTING MONTH" + " " + concartinate20);
                    }
                }
                else {
                    System.out.println("Could not recognise Gender!! Check ID Number Please");
                }
            }

            else {
                //getting for data people born before 2000
                concartinate19 = "19" + getYear;

                System.out.println(getday + "/" + getMonth + "/" + concartinate19);
                int FindingYear19 = Integer.parseInt(concartinate19);
                int FindAge19 = year - FindingYear19;
                System.out.println("You are " + FindAge19 + "years old");

                //
                if (ParseGender >= 0 || ParseGender <= 4) {

                  //getting the month for the female
                    System.out.println("You are a Female");
                    if (getMonth.startsWith("01")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.JAN + " " + concartinate19);
                    } else if (getMonth.startsWith("02")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.FEB + " " + concartinate19);
                    } else if (getMonth.startsWith("03")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.MAR + " " + concartinate19);
                    } else if (getMonth.startsWith("04")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.APR + " " + concartinate19);
                    } else if (getMonth.startsWith("05")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.MAY + " " + concartinate19);
                    } else if (getMonth.startsWith("06")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.JUN + " " + concartinate19);
                    } else if (getMonth.startsWith("07")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.JUL + " " + concartinate19);
                    } else if (getMonth.startsWith("08")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.AUG + " " + concartinate19);
                    } else if (getMonth.startsWith("09")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.SEPT + " " + concartinate19);
                    } else if (getMonth.startsWith("10")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.OCT + " " + concartinate19);
                    } else if (getMonth.startsWith("11")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.NOV + " " + concartinate19);
                    } else if (getMonth.startsWith("12")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + MONTH.DEC + " " + concartinate19);
                    } else {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + "ERROR IN GETTING MONTH" + " " + concartinate19);
                    }

                } else if (ParseGender >= 5 || ParseGender <= 9) {
                    System.out.println("You are a Male");
                    if (getMonth.startsWith("01")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.JAN + " " + concartinate19);
                    } else if (getMonth.startsWith("02")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.FEB + " " + concartinate19);
                    } else if (getMonth.startsWith("03")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.MAR + " " + concartinate19);
                    } else if (getMonth.startsWith("04")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.APR + " " + concartinate19);
                    } else if (getMonth.startsWith("05")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.MAY + " " + concartinate19);
                    } else if (getMonth.startsWith("06")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.JUN + " " + concartinate19);
                    } else if (getMonth.startsWith("07")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.JUL + " " + concartinate19);
                    } else if (getMonth.startsWith("08")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.AUG + " " + concartinate19);
                    } else if (getMonth.startsWith("09")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.SEPT + " " + concartinate19);
                    } else if (getMonth.startsWith("10")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.OCT + " " + concartinate19);
                    } else if (getMonth.startsWith("11")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.NOV + " " + concartinate19);
                    } else if (getMonth.startsWith("12")) {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " He was born on the " + getday + " " + MONTH.DEC + " " + concartinate19);
                    } else {
                        System.out.println("This is the record of " + Fname + " " + Lname + "\n" +
                                " She was born on the " + getday + " " + "ERROR IN GETTING MONTH" + " " + concartinate19);
                    }

                } else {
                    System.out.println("Could not recognise Gender!! Check ID Number Please");
                }

            }

        }

    }

}








