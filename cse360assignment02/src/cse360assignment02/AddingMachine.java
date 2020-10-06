/**
 * CSE 360 Assignment 01: Version Control
 * 
 * Description: The adding machine program will perform add and 
 * subtract operations of integers from a variable and calculate 
 * the total. It can print the operations by calling toString 
 * method and print the result by calling getTotal method.
 * 
 * @author Siyuan Zhou
 * @date 10/5/2020
 */

package cse360assignment02;

public class AddingMachine
{
	private int total;
	
	private String result;

	/**
	 * Constructor of the AddingMachine.
	 * 
	 * Setting total to 0 and result to "0".
	 */
	public AddingMachine()
	{
		total = 0; // not needed - included for clarity
		
		result = "0";
	}

	
	/**
	 * The method will return the total value after calculations.
	 * 
	 * @return total value of the calculations
	 */
	public int getTotal()
	{
		return total;
	}

	/**
	 * The method adds the value to total.
	 * 
	 * @param value
	 */
	public void add(int value)
	{
		total = total + value;
		
		result = result + " + " + value;
	}

	/**
	 * The method subtracts the value from total.
	 * 
	 * @param value
	 */
	public void subtract(int value)
	{
		total = total - value;
		
		result = result + " - " + value;
	}

	/**
	 * The method will return a String of the operations and the result.
	 * 
	 * @return the string of operations
	 */
	public String toString()
	{
		return result;
	}

	/**
	 * The method will clear the operations and reset the values.
	 */
	public void clear()
	{
		total = 0;
		
		result = "0";
	}
	
	/**
	 * The main will test the calculation results.
	 * 
	 * @param args
	 */
	public static void main(String[] args)
	{
		AddingMachine myCalculator = new AddingMachine();
		
		myCalculator.add (4); 
		
		myCalculator.subtract (2); 
		
		myCalculator.add(5);
		
		System.out.println(myCalculator.toString());
		
		System.out.println(myCalculator.getTotal());
	}
}
