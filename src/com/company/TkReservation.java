package com.company;

public class TkReservation extends Thread{

    private TkCount tkcount;
    private String firstName;
    private String lastName;
    private int seatsNumber;
    private int tktype;

    public TkReservation(TkCount tkcount , String firstName , String lastName , int seatsNumber , int tktype){
        this.firstName = firstName;
        this.lastName = lastName;
        this.tkcount = tkcount;
        this.seatsNumber = seatsNumber;
        // 1 for Seat and 0 for Standing
        this.tktype = tktype ;
    }

    @java.lang.Override
    public void run() {
        tkcount.reserveTicket(firstName,lastName,seatsNumber,tktype);
    }
}
