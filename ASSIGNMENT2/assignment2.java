 /*
Snippet 1:

public class Main {
 public void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 

In this snippet main method is not static in class main.

Correct code:


*/
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 

-------------------------------------------------------------
/*
Snippet 2:

public class Main1 {
 static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 

In this snippet main method is not define.The main method needs to be public.

corrected code:

*/

public class Main1 {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 

--------------------------------------------------------------------

/*

Snippet 3:

public class Main {
 public static int main(String[] args) {
 System.out.println("Hello, World!");
 return 0;
 }
}


Main method must return a value of type void in class Main,not int.
It does not return a value.
*/
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 
 }
}

---------------------------------------------------------------------
/*
Snippet 4:

public class Main {
 public static void main() {
 System.out.println("Hello, World!");
 }
} 

The main method accept the string[] parameter.
*/

public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
} 

-------------------------------------------------------------------
Snippet 5:

public class Main {
 public static void main(String[] args) {
 System.out.println("Main method with String[] args");
 }
 public static void main(int[] args) {
 System.out.println("Overloaded main method with int[] args");
 }
} 

Yes you can have multiple main methods in java.
But only standard main(String[] args) method will be executed

-------------------------------------------------------------------

/*
Snippet 6:

public class Main {
 public static void main(String[] args) {
 int x = y + 10;
 System.out.println(x);
 }
} 


The code is not compile .
The variable y is mot declared before used.
in java all variable must be declared with a data type and initialize the value.

*/
public class Main {
 public static void main(String[] args) {
 int y=10;
 int x = y + 10;
 System.out.println(x);
 }
}

---------------------------------------------------------------------

/*
Snippet 7:

public class Main {
 public static void main(String[] args) {
 int x = "Hello";
 System.out.println(x);
 }
} 

compilation error in this code.
String is cannot be converted into int.
The variable x is declared as an int but assign a String ("Hello")
Each variable must store only values of its declared

"Hello is string and x is an int , so its complile time error.

*/

public class Main {
 public static void main(String[] args) {
 String x = "Hello";
 System.out.println(x);
 }
} 

--------------------------------------------------------------------
/*
Snippet 8:

public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!"
 }
} 


The System.out.println("Hello, World!" statement is missing a closing bracket ).

The Java compiler does not generate a .class file if there are syntax errors.

*/

public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 }
}

--------------------------------------------------------------------

/*
Snippet 9:

public class Main {
 public static void main(String[] args) {
 int class = 10;
 System.out.println(class);
 }
} 


class is a keyword is not used as a identifier
class is Reserved keywords predefined by the Java language and cannot be used as variable names, method names, or class names.
variable to avoid using a keyword.

*/

public class Main {
 public static void main(String[] args) {
 int s = 10;
 System.out.println(s);
 }
} 

---------------------------------------------------------------------
/*
Snippet 11: 

public class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[5]);
 }
}

The array declared 3 elements and code tries to access arr[5] which is out of bound array has no index 5
*/

public class Main {
 public static void main(String[] args) {
 int[] arr = {1, 2, 3};
 System.out.println(arr[2]);
 }
}

---------------------------------------------------------------------

/*

Snippet 12: 

public class Main {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 }
 }
}

Your program an infinite loop and continuously print
The condition in the while loop is true
There is no exit condition in the loop.
The loop never terminates, the program to run infinite

use break statement to exit loops safely
*/

public class Main {
 public static void main(String[] args) {
 while (true) {
 System.out.println("Infinite Loop");
 break;

 }
 }
}

---------------------------------------------------------------------
/*
Snippet 14: 

public class Main {
 public static void main(String[] args) {
 double num = "Hello";
 System.out.println(num);
 }
}

 incompatible types: String cannot be converted to double this is compilation error.
the variable num is declared as double
"Hello" is a String, which cannot be assigned to a double variable.

Assigning a valid double value
*/

public class Main {
 public static void main(String[] args) {
 double num = 10.2;
 System.out.println(num);
 }
}

------------------------------------------------------------------

/*
Snippet 15: 

public class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 int result = num1 + num2;
 System.out.println(result);
 }
}

incompatible types: possible lossy conversion from double to int

num1 is an int and num2 is an double
so performing num1 + num2 is atomatically double
int cannot store decimal values
java does not allow implicit conversion from double to int
so result are stored in double
*/

public class Main {
 public static void main(String[] args) {
 int num1 = 10;
 double num2 = 5.5;
 double result = num1 + num2;
 System.out.println(result);
 }
}

-------------------------------------------------------------------
/*
Snippet 16: 

public class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4;
 System.out.println(result);
 }
} 

The output this code is 2.0
But this output is not expected
The division is 2.5 
The integer result (2) is then stored in the double result variable, converting it to 2.0
Using 4.0 instead of 4 so then result is 2.5
*/

public class Main {
 public static void main(String[] args) {
 int num = 10;
 double result = num / 4.0;
 System.out.println(result);
 }
} 

---------------------------------------------------------------------
Snippet 17:

public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a ** b;
 System.out.println(result);
 }
} 

In this code compilation error because we use illegal expression like **
** this operator is not valid in java

----------------------------------------------------------------
/*
Snippet 18:

public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = a + b * 2;
 System.out.println(result);
 }
}


multiplication has higher precedence than addition
so means first multiplication then addition 
b * 2 = 5*2 = 10
a + 10 = 10 +10 = 20

so i want to addition first happen the use (a + b) * 2
*/

public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 5;
 int result = (a + b) * 2;
 System.out.println(result);
 }
}

----------------------------------------------------------------
Snippet 19:

public class Main {
 public static void main(String[] args) {
 int a = 10;
 int b = 0;
 int result = a / b;
 System.out.println(result);
 }
} 


Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Main.main(Main.java:5)

division by zero is undefined mathematically.

----------------------------------------------------------------
Snippet 20:

/*
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World")
 }
}

This syntax error occur 
error: ';' expected
 System.out.println("Hello, World")

 Java, each statement must end with a semicolon (;)
compiler doesn't know where the statement end 

*/

public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World");
 }
}

---------------------------------------------------------------
Snippet 21:

/*
public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // Missing closing brace here
} 


compiler says about mismatched braces is reached end of file while parsing
*/

public class Main {
 public static void main(String[] args) {
 System.out.println("Hello, World!");
 // Missing closing brace here
} 
}

---------------------------------------------------------------

Snippet 22:

/*

public class Main {
 public static void main(String[] args) {
 static void displayMessage() {
 System.out.println("Message");
 }
 }
} 


error occur is error: illegal start of expression
 static void displayMessage() {
 ^
Main.java:7: error: class, interface, or enum expected

Invalid method declaration inside main()

Java does not allow method declarations inside other methods.
*/

public class Main {
    
    static void displayMessage() {
        System.out.println("Message");
    }

    public static void main(String[] args) {
        displayMessage(); 
    }
}

---------------------------------------------------------------
Snippet 23: 

/*

public class Main {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 case 2:
 System.out.println("Value is 2");
 case 3:
 System.out.println("Value is 3");
 default:
 System.out.println("Default case");
 }
 }
} 

the default case print after "Value is 2 because of the there is no break statement used
after excuting case 2 it continue execute case 3 and default case

you can prevent the program from executing the default case use break statement after each case
*/

public class Main {
 public static void main(String[] args) {
 int value = 2;
 switch(value) {
 case 1:
 System.out.println("Value is 1");
 break;
 case 2:
 System.out.println("Value is 2");
 break;
 case 3:
 System.out.println("Value is 3");
 break;
 default:
 System.out.println("Default case");
 }
 }
}

----------------------------------------------------------------
Snippet 24: 

/*
public class MissingBreakCase {
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 case 2:
 System.out.println("Level 2");
 case 3:
 System.out.println("Level 3");
 default:
 System.out.println("Unknown level");
 }
 }
} 


there is no break statement, execution continues to case 2, case 3, and default

The role of the break statement only matches case execute
*/

public class MissingBreakCase {
 public static void main(String[] args) {
 int level = 1;
 switch(level) {
 case 1:
 System.out.println("Level 1");
 break;
 case 2:
 System.out.println("Level 2");
 break;
 case 3:
 System.out.println("Level 3");
 break;
 default:
 System.out.println("Unknown level");
 }
 }
}

---------------------------------------------------------------
Snippet 25:

/*
public class Switch {
 public static void main(String[] args) {
 double score = 85.0;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
} 


error: incompatible types: possible lossy conversion from double to int
switch only support certain data types
float double long are not allowed in switch statement.

use int instead of double . Int is allowed in switch
*/

public class Switch {
 public static void main(String[] args) {
 int score = 85;
 switch(score) {
 case 100:
 System.out.println("Perfect score!");
 break;
 case 85:
 System.out.println("Great job!");
 break;
 default:
 System.out.println("Keep trying!");
 }
 }
} 

----------------------------------------------------------------
/*
Snippet 26: 

public class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 5:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}

compile time error is  duplicate case label

Your switch statement duplicate case is not allowed in Java.
Each case label in a switch must be different.

they would be confusion on which case should execute
*/

public class Switch {
 public static void main(String[] args) {
 int number = 5;
 switch(number) {
 case 5:
 System.out.println("Number is 5");
 break;
 case 6:
 System.out.println("This is another case 5");
 break;
 default:
 System.out.println("This is the default case");
 }
 }
}





