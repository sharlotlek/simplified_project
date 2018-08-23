package com.company;

public class ValidationClass {

    String SA_ID, getYear, getMonth, getday, Lname, Fname,concartinate;
    //  Month month=new Month();

    public ValidationClass() {
        SA_ID = "";
        getMonth = "";
        getYear = "";
        getday = "";
        Lname = "";
        Fname = "";
        concartinate= "";
       // concartinate19="";


    }
    public ValidationClass(String Con,String SA_ID,String getYear,String getMonth,String getday,String Lname,String Fname)
    {
        this.concartinate=concartinate;
        this.SA_ID=SA_ID;
        this.getday=getday;
        this.getMonth=getMonth;
        this.getYear=getYear;
        this.Lname=Lname;
        this.Fname=Fname;
    }

    public void  MaleData(String concartinate20,String Fname,String Lname,String getday,String getMonth) {

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
                    " he was born on the " + getday + " " + "ERROR IN GETTING MONTH" + " " + concartinate20);
        }
        //return concartinate20;

    }

    public  void  FemaleData(String concartinate19,String Fname,String Lname,String getday,String getMonth) {
        {
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
        }

    }
    }
