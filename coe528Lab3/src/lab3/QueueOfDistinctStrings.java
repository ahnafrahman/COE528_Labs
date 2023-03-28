/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab3;

/**
 *
 * @author ahnaf
 */
import java.util.ArrayList;
public class QueueOfDistinctStrings {
    //Overview: QueueOfDistinctStrings are mutable, bounded
    // collection of distinct strings that operate in
    // FIFO (First-In-First-Out) order.
    //
    // The abstraction function is:
    // a) Write the abstraction function here
    // AF(myQueue)= {myQueue.items[0] = q0, myQueue.items[items.size() - 1] = kn | for myQueue = {q0, q1...,}}
    //
    //
    // The rep invariant is:
    // b) Write the rep invariant here
    // RI(myQueue) = returns true if n items are enqueued to myQueue and myQueue.items[i] = qi
    // where qi = the number of which the items was enqueued to the queue
    
    //the rep    
    
    private ArrayList<String> items;
    
    // constructor
    public QueueOfDistinctStrings() {
        // EFFECTS: Creates a new QueueOfDistinctStrings object
        items = new ArrayList<String>();
        }
        
    // MODIFIES: this
    // EFFECTS: Appends the element at the end of the queue
    // if the element is not in the queue, otherwise
    // does nothing.
    public void enqueue(String myString) throws Exception {         
        if (myString == null) throw new Exception();          
            if (items.contains(myString) == false)             
            items.add(myString);
        }

    public String dequeue() throws Exception {
        // MODIFIES: this
        // EFFECTS: Removes an element from the front of the queue
        if (items.size() == 0) throw new Exception();
            return (items.remove(0));
        }

    public boolean repOK() throws Exception {
        // EFFECTS: Returns true if the rep invariant holds for this
        // object; otherwise returns false
        QueueOfDistinctStrings myQueue = new QueueOfDistinctStrings();         
        if (myQueue.items == null || !myQueue.items.isEmpty())             
        return false;         
            myQueue.enqueue("ab");         
            myQueue.enqueue("cd");         
            myQueue.enqueue("ef");         
    
        return myQueue.items.size() == 3 && myQueue.items.get(0).equals("ab") && myQueue.items.get(1).equals("cd") && myQueue.items.get(2).equals("ef");
        }      

    /**
     *
     * @return
     */
    @Override
    public String toString() {         
        // EFFECTS: Returns a string that contains the strings in the
        // queue, the front element and the end element.
        // Implements the abstraction function.
        String toReturn = "";
        if (items == null)             
            return "Queue is Empty..";         
                for (String myString : items) {             
                toReturn = toReturn + "  " + myString;         
            }          
            return toReturn;
        } 
    }
