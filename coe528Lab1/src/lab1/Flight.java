
package lab1;

/**
 *
 * @author ahnaf
 */
public class Flight {
    private int flightNumber;
    private String origin;
    private String destination;
    private String departureTime;
    private int capacity;
    private int numberOfSeatsLeft;
    private double originalPrice;
    
    public Flight(int number, String start, String end, String departTime, int cap,double price){
        flightNumber = number;
        origin = start;
        destination = end;
        departureTime = departTime;
        capacity = cap;
        numberOfSeatsLeft = cap;
        originalPrice = price;
    }
        
    public int getflightNumber(){
        return flightNumber;
    }
    public void setflightNumber(int fn){
        this.flightNumber = fn;
    }
    
    public String getorigin(){
        return origin;
    }
    public void setorigin(String og){
        this.origin = og;
    }
    
    public String getdestination(){
        return destination;
    }
    public void setdestination(String ds){
        this.destination = ds;
    }
    
    public String getdepartureTime(){
        return departureTime;
    }
    public void setdepartureTime(String dp){
        this.departureTime = dp;
    }
    
    public int getcapacity(){
        return capacity;
    }
    public void setcapacity(int c){
        this.capacity = c;
    }
    
    public int getnumberOfSeatsLeft(){
        return numberOfSeatsLeft;
    }
    public void setnumberOfSeatsLeft(int sl){
        this.numberOfSeatsLeft = sl;
    }
    
    public double getoriginalPrice(){
        return originalPrice;
    }
    public void setoriginalPrice(double op){
        this.originalPrice = op;
    }
    
    public boolean bookASeat(){
        if (numberOfSeatsLeft > 0){
            numberOfSeatsLeft --;
            return true;
        }
        
        else
            return false;   
    }
    
    @Override
    public String toString(){
        return ("Flight " + this.flightNumber + " , " + this.origin + " to " 
                + this.destination + " , " + this.departureTime +
                ", original price: " + this.originalPrice + "$\n" );
    }
}