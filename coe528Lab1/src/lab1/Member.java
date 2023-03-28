/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author ahnaf
 */
public class Member extends Passenger{
    private int yearsOfMembership;
    
    public Member(String name, int age, int yom){
        super(name, age);
        this.yearsOfMembership = yom;
    }
    
    public int getYearsOfMembership(){
        return yearsOfMembership;
    }
    public void setYearsOfMembership(int ym){
        this.yearsOfMembership = ym;
    }
    
    @Override
    public double applyDiscount(double p){
      if(this.yearsOfMembership > 5)
          return p- (p*0.5);
      
      else if(this.yearsOfMembership > 1 && this.yearsOfMembership <= 5)
        return p- (p*0.1);
      
      else
          return p;
}
}
