//Java Practice ( The below Content Written in Comment taken from W3 Schools For reference)//
/* The code below will print the words*/
class Main {
  public static void main(String args[]) {
    System.out.println("Hello world");
    System.out.println("I am learning Java");
    System.out.println("It is Awesome");
    System.out.println("I will print on the same line.");
    System.out.println("Myself Vivek Vardhan and learning java Slowly");
    /*
     * The Below input shows use the println() method to print numbers
     * However, unlike text, we don't put numbers inside double quotes
     */
    System.out.println(3);
    System.out.println(3 + 6);
    System.out.println(2 * 10);
    /*
     * Java Variables like String (stores text, such as "Hello"), float (decimals),
     * int such as (1,2 or any number), boolean (T/F), char (stores single
     * characters, such as 'a' or 'B')
     */
    
    //for String//
    //The Below Shown How to write For string by various methods//
    String name = "Vivek";
    System.out.println("Hello " + name);
    
    String firstName = "Vivek ";
    String lastName = "Vardhan";
    String fullName = firstName + lastName;
    System.out.println(fullName); 
    
    /* Or we can write like this */
    
    String firstName = "Vivek";
    String lastName = "Vardhan";
    System.out.println(firstName.concat(lastName));
    
    String txt = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    System.out.println("The length of the string is: " + txt.length()); // To find the Length of String //
    
    String txt = "Vivek Vardhan";
    System.out.println(txt.toUppercase());
    System.out.println(txt.toLowercase()); // To Find the Upper case and Lower case //
    
    String txt = "Vivek Vardhan 'locate' error";
    System.out.println(txt.indexof("locate")); // To find a Character in a String //

    //for int//
    //The Below Shown How to write For int by various methods//
    int myNum = 15;
    myNum = 20;
    System.out.println(myNum);

    int x = 5;
    int y = 7;
    int z = x + y;
    System.out.println(z);
   
  /* Or we can write like this*/
    int x = 5;
    int y = 7;
    System.out.println(x+y); 
    
    int x = 5, y = 7;
    System.out.println(x+y);
 /* Above two*/
    
    /* If you add two strings, the result will be a string concatenation */
     String x = "10";
     String y = "20"; // Also we can write int y = 20;
     String z = x + y;
     System.out.println(z);  // Output Will be 1020 //
    
    //for float//
    //The Below Shown How to write For float by various methods//
    float f1 = 35e3f;
    System.out.println(f1);
    
    //for boolean//
    //The Below Shown How to boolean For float by various methods//
   boolean isJavaFun = true;
    System.out.println(isJavaFun);
    
    //for character//
   //The Below Shown How to write For character by various methods//
    char myGrade = 'B';
    System.out.println(myGrade);
    
    int myAge = 25;
    int VotingAge = 18;
    System.out.println(myAge<=VotingAge);
    
    /* Java Operators 
    i) Arithmetic Operators:-
    1) Addition = Adds together two values	x + y
    2) Subtraction = Subtraction	Subtracts one value from another	x - y
    3) Multiplication = Multiplies two values	x * y
    4) Increment = Increases the value of a variable by 1	++x */
    
    int x = 10;
    x += 5;
    System.out.println(x); // For Addition//
    
    int x =10;
    x -= 5
    system.out.println(x); // For Subtraction//
    
    /* Type Casting = Type casting is when you assign a value of one primitive data type to another type
     There are two types of Casting:-
     1) Widnening Casting
     2) Narrowing Casting*/
    
    // For Widening Casting//
    
    int myInt = 9;
    double myDouble = myInt;
    
    System.out.println(myInt);
    System.out.println(myDouble);
    
    //For Narrowing Casting//
    
    double myDouble = 9.78d;
    int myInt = (int) myDouble;
    
    System.out.println(myDouble);
    System.out.println(myInt);
  }
}
