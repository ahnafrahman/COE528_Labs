/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ahnaf
 */
public class FoodItem extends FoodComponent {
    private double price;
    private String name;
    
    public FoodItem(String name, double cost){
        this.name = name;
        price = cost;
    }
    
    public double getPrice(){
        return price;
    }
    
    @Override
    public void print(int level){
        String tab = "";
        for (int i = 0; i < level; i++){
            tab += "\t";
        }
        level++;
        System.out.println(tab + "Food Item: " + this.name + ", " + this.getPrice());
    }
}
