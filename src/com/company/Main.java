package com.company;

public class Main {

    public static void main(String[] args) {
        //TEST RUN
        TkCount tkcount = new TkCount(50,50);

        TkReservation test1 = new TkReservation(tkcount,"James","Smith",10,1);
        TkReservation test2 = new TkReservation(tkcount,"Robert","Smith",50,1);

        test1.start();
        test2.start();
    }
}
