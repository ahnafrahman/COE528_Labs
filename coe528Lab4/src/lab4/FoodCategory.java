/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;
import java.util.ArrayList;

/**
 *
 * @author ahnaf
 */
public class FoodCategory extends FoodComponent{
    private ArrayList<FoodComponent> foodcomp;
    private String name;
    private double price;
    
    public FoodCategory(String name){
        this.name = name;
        foodcomp = new ArrayList<>();
    }
    
    public void add(FoodComponent x){
        foodcomp.add(x);
    }
    public void remove (FoodComponent y){
        foodcomp.remove(y);
    }
    
    @Override
    public double getPrice(){
        price = 0;
        for (int i = 0; i < foodcomp.size(); i++){
            price += foodcomp.get(i).getPrice();
        }
        return price;
    }
    
    @Override
    public void print(int level){
        String tab = " "; 
        for(int i = 0; i < level; i++){
            tab += "\t";
        }
        level++;
        
        System.out.println(tab + "Food Category (" + name + ", " + this.getPrice() + ") contains:");
        for (int i = 0; i < foodcomp.size(); i++){
            foodcomp.get(i).print(level); 
        }
    }
    
    
    
}
