import java.awt.Point;
import java.lang.invoke.SwitchPoint;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

// Shane Miller
// This is a programs that shows some skills I have learned.

public class Main {

	public static void main(String[] args) {

		// module 1
		firstGreeting();

		// module2
		secondWeek();

		// module 3
		thirdWeek();
		
		//module 5
		week5();

		//module 6
		week6();
		week6cont();
		
		//mod 7
		esketit();
		
		//mod 8
		
		//mod 9
		simply();
	
		//mod 10
		beary();
		wowe();
		enhancer();
		getnumber();
		
		ArrayList al = new ArrayList<>();
		al.add("OK");
		al.add("WORKS");
		al.add(1,"THIS");
		System.out.println(al);//prints [OK, THIS, WORKS]
		System.out.println(al.size());//prints 3
		
		//mod11
		
		 Scanner cin=new Scanner(System.in);
	        try{
	            int x=cin.nextInt(),y=cin.nextInt();
	            System.out.println(x/y);
	         
	        }catch(InputMismatchException e){
	            System.out.println(e.getClass().toString().substring(6));

	        }catch(Exception e){
	            System.out.println(e);
	        }
		
		
	}

	// mod1
	public static void firstGreeting() {
		System.out.println("Hello World");
		int num1 = 15;
		System.out.println(num1);
	}

	// mod2
	public static void secondWeek() {
		double num2 = 20.2;
		System.out.println(num2);

		String hi = "This is a string"; // the string is being stored in "hi"
		System.out.println(hi); // prints here
	}

	final int shalnotchange = 3; // statement final will make shalnotchange always equal to 3.

	// mod3
	public static void thirdWeek() {
		String string1 = "jellow";
		String string2;
		string2 = ("Me" + "l" + "l" + "o" + "w"); // the String class includes a method for concatenating strings
		System.out.println(string1 + string2);
		System.out.println(string2.substring(1, 4)); // every letter has a numerical number associated with it, starting
														// at 0, this command prints to values stored between 1 - 4
		System.out.println(string2.toUpperCase()); // prints in string2 in UPPERCASE

		System.out.println("Lets try this \"out!\" "); // escape sequence used to insert double quotes

		double excast = 4.686; // casting converts a double to an int
		int converty = (int) excast;
		System.out.println(Math.ceil(excast)); // Math.ceil class rounds up so the output is now 5
	}

	// mod4
	public int week4 (int x, int y) { // A CALL contains an ARGUMENT. A HEADER contains a PARAMETER. A method is a group of statements that have a name
		
		return x * y;
	}
	//
	int length = 22; // length and width are parameters 
	int width = 10;
	int area = week4(length, width);

	// mod5
	public static void week5() {
	System.out.println(Math.min(99.1,66.1 )); // prints the lesser if two numbers
	
	Random randomGen = new Random();
	System.out.println("Next int value: " + randomGen.nextInt(1000)); // generates random number between 1-1000
	}

	// mod6
	public static void week6() {
		int score = 85;
		if (score >= 60) { //uses relational and conditional operaters to see if score is less than or equal to value of 60
			System.out.println("pass");
		}
		else {
			System.out.println("fail");
		}
		
		String v1 = "yes";
		String v2 = "yes";
		if (v1==v2) { // Compares references, not values
			System.out.println("these are the same");
					      
		      System.out.println(v1.compareTo("yes"));
		      System.out.println(v1.equals(v2));
		}
	}
	
	public static void week6cont() {
		int name = 2;            //swtich declares an int named name so since name = 2 so nameString is "Jack"
		String nameString;
		switch (name) {
		case 1: nameString = "Bob";
				break;
		case 2: nameString = "Jack";
				break;
		case 3: nameString = "Susan";
				break;
		}
		
		int operator =+ 5+6-4/20*14*52;
		System.out.println(operator++);
		System.out.println(operator--);
		
	}
			//Operator precedence determines which operator is performed first in an expression with more than one operators with different precedence. like PEMDAS order of operations
	
			//mod 7
	  public static void esketit() {
		    int letsGo = 1;
		    while (letsGo <= 3) {
		      System.out.println("This is going up ");
		      letsGo++;
		      continue;                              	// will continue the loop for 3 repetitions.
		    }

		    for (int count = 5; count >= 0; count--) {
		    
		      System.out.println("This is going down");
		      break;									//break stops this loop so it doesn't print 5 times only 1 time.
		    }


		    int monkaS = 1;
		    do {
		      String TriHard = "yahoooo";
		      System.out.println(TriHard);
		      monkaS++;
		    } while (monkaS <= 3);

		  }

		  	//mod 8  in main2 
	
	
			// mod 9
			public static void simply() {
				System.out.println(Add(1,50));
				System.out.println(Add(1.12,50.12));
				System.out.println(Add("heloo ", "peeps"));
				
			}
			public static int Add (int a, int b) {
				return (a+b);
			}
			public static double Add (double a, double b) {
				return (a+b);
			}
			public static String Add (String a, String b) {
				return (a+b);
			}
			
			//mod 10
					
			public static void beary() {
				int [] anArray = {100, 200, 300};
				int sum = IntStream.of(anArray).sum();
				int smallest = anArray[0];
				int largest = anArray[0];
				for (int i = 1; i < anArray.length; i ++)
				{
					if (anArray[i] > largest)
						largest = anArray[i];
					else if (anArray[i] < smallest)
						smallest = anArray[i];
				
				}
					System.out.println("Smallest " + smallest);
					System.out.println(sum);
					
			}
			
			public static int  findIndex (int[] my_array, int t) {
		        if (my_array == null) return -1;
		        int len = my_array.length;
		        int i = 0;
		        while (i < len) {
		            if (my_array[i] == t) return i;
		            else i=i+1;
		        }
		        return -1;
		    }
		    public static void wowe() {
		      int[] my_array = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
		      System.out.println("Index position of 25 is: " + findIndex(my_array, 25));
		      System.out.println("Index position of 77 is: " + findIndex(my_array, 77));
		       }
			
		    public static void enhancer() {
		    	char[] vowels = {'a', 'e', 'i', 'o', 'u'};
		        // foreach loop
		        for (char item: vowels) {
		           System.out.println(item);
		        }
		        
		    }
		    public static void deWaytac() {
		    	int[][] board = new int[3][3];
		    	for (int i = 0; i < board.length; i++) {
		    		for (int j = 0; j < board[i].length; j++) {
		    			board[i][j] = i + j;
		    		}
		    	}
		    }
		    
		    	
		    public static void getnumber() {
		    	int[][] a = {
		                {1, 2, 3}, 
		                {10, 5, 6, 9}, 
		                {7}, 
		          };
		          
		          System.out.println("Length of row 2: " + a[1].length);
		    	}
		    
		    public static void locateStar(char[][] board) {
		        int x = 0, y = 0;
		        for (int i=0; i < board.length; i++) {
		            for (int j=0; j < board[0].length; j++) {
		                if (board[i][j] == '*') {
		                    x = i;
		                    y = j;
		                }
		            }
		        }
		        System.out.println("Found a star at (" + x + ", " + y + ")");
		    }

		  
		    
		    
		    
		    
		    
		    
		 
			
			
		
			
			/* The most frequent use f inheritance is for deriving classes using existing classes, which provides reusability
			 The existing classes remain unchanged. By reusability, the development time of software is reduced. 
			 */
}

/*
 * This is a list and description of Java built-in data types byte: The byte
 * data type is an 8-bit signed two's complement integer. It has a minimum value
 * of -128 and a maximum value of 127 (inclusive). The byte data type can be
 * useful for saving memory in large arrays, where the memory savings actually
 * matters. They can also be used in place of int where their limits help to
 * clarify your code; the fact that a variable's range is limited can serve as a
 * form of documentation.
 * 
 * short: The short data type is a 16-bit signed two's complement integer. It
 * has a minimum value of -32,768 and a maximum value of 32,767 (inclusive). As
 * with byte, the same guidelines apply: you can use a short to save memory in
 * large arrays, in situations where the memory savings actually matters.
 * 
 * int: By default, the int data type is a 32-bit signed two's complement
 * integer, which has a minimum value of -231 and a maximum value of 231-1. In
 * Java SE 8 and later, you can use the int data type to represent an unsigned
 * 32-bit integer, which has a minimum value of 0 and a maximum value of 232-1.
 * Use the Integer class to use int data type as an unsigned integer. See the
 * section The Number Classes for more information. Static methods like
 * compareUnsigned, divideUnsigned etc have been added to the Integer class to
 * support the arithmetic operations for unsigned integers.
 * 
 * long: The long data type is a 64-bit two's complement integer. The signed
 * long has a minimum value of -263 and a maximum value of 263-1. In Java SE 8
 * and later, you can use the long data type to represent an unsigned 64-bit
 * long, which has a minimum value of 0 and a maximum value of 264-1. Use this
 * data type when you need a range of values wider than those provided by int.
 * The Long class also contains methods like compareUnsigned, divideUnsigned etc
 * to support arithmetic operations for unsigned long.
 * 
 * float: The float data type is a single-precision 32-bit IEEE 754 floating
 * point. Its range of values is beyond the scope of this discussion, but is
 * specified in the Floating-Point Types, Formats, and Values section of the
 * Java Language Specification. As with the recommendations for byte and short,
 * use a float (instead of double) if you need to save memory in large arrays of
 * floating point numbers. This data type should never be used for precise
 * values, such as currency. For that, you will need to use the
 * java.math.BigDecimal class instead. Numbers and Strings covers BigDecimal and
 * other useful classes provided by the Java platform.
 * 
 * double: The double data type is a double-precision 64-bit IEEE 754 floating
 * point. Its range of values is beyond the scope of this discussion, but is
 * specified in the Floating-Point Types, Formats, and Values section of the
 * Java Language Specification. For decimal values, this data type is generally
 * the default choice. As mentioned above, this data type should never be used
 * for precise values, such as currency.
 * 
 * boolean: The boolean data type has only two possible values: true and false.
 * Use this data type for simple flags that track true/false conditions. This
 * data type represents one bit of information, but its "size" isn't something
 * that's precisely defined.
 * 
 * char: The char data type is a single 16-bit Unicode character. It has a
 * minimum value of '\u0000' (or 0) and a maximum value of '\uffff' (or 65,535
 * inclusive).
 */
