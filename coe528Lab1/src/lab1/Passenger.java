/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab1;

/**
 *
 * @author ahnaf
 */
public abstract class Passenger {
    private String name;
    int age;
    
    public Passenger(String name, int age){
        this.name = name;
        this.age = age;
    }
    
    public String getname() {
        return name;
    }
    public void setname(String n) {
        this.name = n;
    }

    public int getage() {
        return age;
    }
    public void setage(int a) {
        this.age = a;
    }
    
    public abstract double applyDiscount(double p);
}
