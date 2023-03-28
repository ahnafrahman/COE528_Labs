/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab4;

/**
 *
 * @author ahnaf
 */
public class Driver {
    /**
     * @param args
     */
    public static void main(String[] args) {
        FoodComponent fi1 = new FoodItem("blueberries", 2.5);
        FoodComponent fi2 = new FoodItem("strawberries", 3.5);
        FoodComponent fi3 = new FoodItem("egg", 4.5);
        FoodComponent fi4 = new FoodItem("chicken", 5.0);
        FoodComponent fi5 = new FoodItem("peas", 6.0);
        FoodComponent fi6 = new FoodItem("icecream", 7.0);
        FoodComponent fc1 = new FoodCategory("frozen");
        FoodComponent fc2 = new FoodCategory("meat");
        FoodComponent fc3 = new FoodCategory("vegetables");
        ((FoodCategory)fc1).add(fc2);
        ((FoodCategory)fc1).add(fc3);
        ((FoodCategory)fc1).add(fi6);
        ((FoodCategory)fc2).add(fi3);
        ((FoodCategory)fc2).add(fi4);
        ((FoodCategory)fc3).add(fi1);
        ((FoodCategory)fc3).add(fi2);
        ((FoodCategory)fc3).add(fi5);
        fc1.print(0);
    }
}
