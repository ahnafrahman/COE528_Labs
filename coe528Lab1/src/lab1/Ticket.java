/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author ahnaf
 */
public class Ticket {
    private Passenger passenger; 
    private Flight flight; 
    private double price;
    private static int number = 0;
    
    public Ticket (Passenger p, Flight flight, double price){
        this.passenger = p;
        this.flight = flight;
        this.price = price;
        Ticket.number++;
    }
    
    public Passenger getpassenger(){
        return passenger;
    }
    public void setpassenger(Passenger passenger){
        this.passenger = passenger;
    }

    public Flight getflight() {
        return flight;
    }
    public void setflight(Flight flight){
        this.flight = flight;
    }

    public double getprice() {
        return price;
    }
    public void setprice(double price){
        this.price = price;
    }
    
    public double getnumber() {
        return price;
    }
    public void setnumber(int number){
        Ticket.number = number;
    }
    
    @Override
    public String toString(){
        return (this.passenger.getname() + ", Flight " + this.flight.getflightNumber() 
                +", " + this.flight.getorigin() + " to " + this.flight.getdestination() 
                + ", " + this.flight.getdepartureTime() + ", original price: " 
                + this.flight.getoriginalPrice() + "$, adjusted price: " + this.price + "$\n");
    }
}
