/**@Anchal Singh
 * CS-570-C
 * Binary Number HW1
 */

import java.util.*;

public class BinaryNumber {
	private int data[];  
	private boolean overflow; 


//Determining the length of a binary number
	
	public BinaryNumber(int length) {
		if(length < 1) 
		{throw new Error("value can't be less than 1");}
		 
		data = new int[length]; 
		for(int i = 0; i < length; i++) {
			data[i] = 0;
			}
	}

//Creating  a  binary  number  given  a  string
	
	public BinaryNumber(String str){
		int len = str.length();
		this.data = new int[len];
		for (int i = 0; i < len; i++) {
			int num = Character.getNumericValue(str.charAt(i));
			if (num == 0 || num == 1) {
				data[i] = num;} 
			else 
				throw new Error("Can only have numeral digits ");
			}
		}
		
//Determining the length of a binary number
	
	public int getLength() {
		return data.length;
	}
	
//Obtaining  a  digit of a  binary  number  given  an  index
	
	public int getDigit(int index) {
		if(index < 0) {
			throw new Error ("The Index can't be less than 0");
		}
		if(index > getLength()) {
			throw new Error ("The index is out of bounds");
		}
		return data[index];	
		}

	private void reallocate(int[] l, int m) {
		data = Arrays.copyOf(l, m); }
	
//For shifting all digits in a binary number any number of places to the right
	
	public void shiftR(int amt) {
		int pre_len = data.length;
		int[] ar = data;
		reallocate(data, amt + pre_len);
		for (int i = 0; i < amt + pre_len; i++) {
			if (i < amt) {
				data[i] = 0;
			}else {
				data[i] = ar[i-amt];}
		}
	}
		
//Adding  two  binary  numbers
	
	public void add(BinaryNumber aBinaryNumber) {
		int data1[] = new int[aBinaryNumber.getLength()];
		data1 = aBinaryNumber.getBinary();
		int bin = 0;
		if(data.length == data1.length) {
			for(int i=0; i<data.length; i++) {
				int t = (bin + data[i] + data1[i]);
				if(t == 0) {
					data[i] = 0;
					bin = 0;
				} else if(t == 1) {
					data[i] = 1;
					bin = 0;
				} else if(t == 2) {
					data[i] = 0;
					bin = 1;
				} else if(t == 3) {
					data[i] = 1;
					bin = 1;
				}
			}
			if(bin == 1) {
				overflow = true;				
			}
		}
		else {
			System.out.println("The lengths do not coincide.");
		}
	}
	
	private int[] getBinary() {
		return data;
	}

//Transforming a binary number to a String
	
	public String toString() {
		if(overflow == false) {
			String Transformed_String = "";
			for (int i = 0; i < data.length; i++) {
				Transformed_String += data[i];
			}
			return Transformed_String;
		}else {
			return "Overflow";
		}
   }

//Transforming a binary number to its decimal notation 
    
	public int toDecimal() {
    	int decimal_result = 0;
    	for (int i = 0; i < data.length; i++) {
		decimal_result += data[i] * Math.pow(2, i);
	}
	   	return decimal_result;
  }	
	
//Clears the overflow flag
	
	public void clearOverflow() {
		overflow=false;
	}
	
//To check	
public static void main(String[] args) {
		BinaryNumber b1=new BinaryNumber(4);
		BinaryNumber b2=new BinaryNumber("1011"); 
		System.out.println(b1.toString());
		System.out.println(b2.toDecimal());
		System.out.println(b1.getLength());
		System.out.println(b1.getDigit(1));
		b1.shiftR(0);
		b1.add(b2);
		System.out.println(b1.toString());
}
	}
	

	
	     