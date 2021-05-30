package com.company;

public class TkCount {

    private int seatsTicket ;
    private int standingTicket ;

    public TkCount(int seatsTicket, int standingTicket){
        this.seatsTicket = seatsTicket;
        this.standingTicket = standingTicket;
    }

    public synchronized void reserveTicket(String firstName , String lastName , int seats , int type){
        switch (type){
            case 0:
                if ((standingTicket >= seats) && (seats > 0)){
                    System.out.println(seats + "tickets booked successfully for " + firstName + " " + lastName);
                    standingTicket -= seats;
                }
                else{
                    System.out.println("No tickets available!");
                }
            case 1:
                if ((seatsTicket >= seats) && (seats > 0)){
                System.out.println(seats + "tickets booked successfully for " + firstName + " " + lastName);
                seatsTicket -= seats;
            }
            else{
                System.out.println("No tickets available!");
                }
        }





    }


}
