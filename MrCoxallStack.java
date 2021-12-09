/*
* This is the Main function.
*
* @author  Jonathan Pasco-Arnone
* @version 1.0
* @since   2021-12-01
*/

import java.util.ArrayList;

/**
* This is the class that contains many functions.
*/
public final class MrCoxallStack {
    /**
    * Create the stack as an ArrayList.
    */
    private ArrayList<Integer> stackAsArray = new ArrayList<Integer>();
  
    /**
    * Adds a number to the ArrayList.
    *
    * @param pushNumber this is the inputted number to be added
    */
    public void push(final Integer pushNumber) {
        stackAsArray.add(0, pushNumber);
    }
  
    /**
    * Pops the top number off of the ArrayList.
    */
    public void pop() {
        stackAsArray.remove(0);
    }
  
    /**
    * Prints the ArrayList.
    */
    public void showStack() {
        System.out.println(stackAsArray);
    }
}
