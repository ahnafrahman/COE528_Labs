/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;
import java.util.Scanner;
import java.util.ArrayList;
/**
 *
 * @author ahnaf
 */
public class Manager{
    ArrayList<Flight> flights = new ArrayList<>();
    ArrayList<Ticket> tickets = new ArrayList<>();  
    
    public void createFlights(){
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Please input the starting point:");
        String og = sc.nextLine();
        
        System.out.println("Please input the destination:");
        String ds = sc.nextLine();
        
        System.out.println("Please input the departure time:");
        String dt = sc.nextLine();
        
        System.out.println("Please input the flight number:");
        int fn = sc.nextInt();
        
        System.out.println("Please input the capacity:");
        int c = sc.nextInt();
        
        System.out.println("Please input the original price:");
        double op = sc.nextDouble();

        flights.add(new Flight(fn, og, ds, dt, c, op));
    }
    
    public void displayAvailableFlights(String origin, String destination){
        for(int i = 0; i < flights.size(); i++){
            if(flights.get(i).getorigin().equals(origin) && flights.get(i).getdestination().equals(destination)){
                if(flights.get(i).getnumberOfSeatsLeft() > 0)
                    System.out.println(flights.get(i));
            }
        }
    }
    
    public Flight getFlight(int fn){
        for(int i = 0; i < flights.size(); i++){
            if(flights.get(i).getflightNumber()== fn){
                return(flights.get(i));
            }
            else
                return null;
        }
        return null;
    }
    
    public void bookSeat(int flightNumber, Passenger passenger){
        double dsPr;
        if (getFlight(flightNumber)== null)
            System.out.println("This flight is not available.\n");
        
        else{
            Flight flight =getFlight(flightNumber);
            if (flight.bookASeat()== true){
                dsPr= passenger.applyDiscount(flight.getoriginalPrice());
                tickets.add(new Ticket(passenger,flight,dsPr));
            }
            else
            System.out.println("Sorry, this Flight is fully booked.\n");
        }
    }
    
    public static void main(String[] args){
        Passenger passenger = new Member ("Mike", 29, 9);
        Passenger passenger2 = new Member ("James", 25, 4);
        Passenger passenger3 = new NonMember ("John", 20);
        Passenger passenger4 = new NonMember ("Jeff", 70);
        
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Please input the number of flights you want to add:");
        int i = sc.nextInt();
        
        
        Manager m = new Manager();
        for(int j = 0; j < i; j++){
            System.out.println("--------------------------------------------\n");
            m.createFlights();
        
        }
        
        m.displayAvailableFlights("Toronto", "Budapest");
        System.out.println("\ngetFlight: " + m.getFlight(50) + "\n");
        
        m.bookSeat(50, passenger);
        m.bookSeat(50, passenger2);
        m.bookSeat(50, passenger3);
        m.bookSeat(50, passenger4);
        System.out.println("\nTicket: " + m.tickets.get(0));
        System.out.println("\nTicket: " + m.tickets.get(1));  
        System.out.println("\nTicket: " + m.tickets.get(2));
        System.out.println("\nTicket: " + m.tickets.get(3));
    }
}
    

