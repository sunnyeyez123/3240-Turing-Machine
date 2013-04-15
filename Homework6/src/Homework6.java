/*
 * Simulate your TM computation. Your program should take input a 
 * bit string and output ACCEPT or REJECT, and in addition it should 
 * also output the sequence of tape contents at each step of the computation. 
 * A TA will soon provide more detailed instructions on how to submit the solution. 
 * This portion can be submitted by April 18th.
 * */
public class Homework6 {

	//does not contain twice as many 0's as 1's
	
	public static void main(String[] arg){
		
		//TuringMachine TM = new TuringMachine(arg[0]);
		TuringMachine TM = new TuringMachine("11000");

		//check for valid input
		TM.validate();
		if(TM.isValid()){
		//run test
		TM.test();
		//get result
		TM.getResult();
		}
	}
}
