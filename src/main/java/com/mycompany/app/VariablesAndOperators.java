package com.mycompany.app;

public class VariablesAndOperators {
    public static void main(String[] args) {
        /*Primitive data types */
        //Boolean
        boolean myBoolean = false;
        System.out.println("My Boolean: " + myBoolean);

        //String
        String text = "Hello Coder"; // Notice the difference between String and char. "" - for String 
        System.out.println("String: " + text);

        //Character 
        char letter = 'A';           // '' for char 
        System.out.println("Character: " + letter);

        
        //byte - Stores a number between -128 to 127
        byte byteNumber = 127;
        System.out.println("Byte number: " + byteNumber);
        
        //short - 	Stores whole numbers from -32,768 to 32,767
        short shortNumber = 2015;
        System.out.println("Short: " + shortNumber);;
        
        //Integer - Stores a whole number between -2,147,483,648 to 2,147,483,647
        int wholeNumber = 10;
        System.out.println("Integer: "+ wholeNumber);
        
        //Float - Sufficient for storing 6 decimal digits, however it has to be specified with "f" at the end as by default is  a double.
        float decimalNumber = 10.123456f; // Notice the "f" after the number. This specify that the number is float.
        System.out.println("Float: "+ decimalNumber);

        //Double - Sufficient for storing 14 decimal digits. 
        double longDecimalNumber = 10.12345678901234;
        System.out.println("Double: "+ longDecimalNumber);

        // Variable - Java 10+ automatically picks up the typeof the variable and assign it.
        var any = "This can be any data type. Java 10+ will automatically pick up the type. However, still can't change the type in the future.";
        System.out.println("Variable: "+ any);

        /*  So far I learned the Variables and I used the assignment operator "=". But it has nothing to do with the math "=".
            In programming we use "=" to assign a value to a variable. So "x = 10" assign the value of 10 to variable "x"
            If for example we have c = 5 and we assign "x = c" this will not be a comparison like in math. 
            "x = c" will assign the value of "c" to the "x" variable. Or "x" = 5 and "c" = 5 (Note that "c" value does not change) 
        
        */ 

        // Now let's look at some other operators:
        //Mathematical operators

        // + (addition)    
        int a_1, b_1, c_1; //another way to declare multiple variables from same type
            a_1 = 1;
            b_1 = 2;
            c_1 = a_1 + b_1;
            System.out.println("Addition: 1 + 2 = " + c_1) ;

        // - (subtraction)
            float b_2, c_2;
            int a_2 = 5;
            b_2 = 2.2f;
            c_2 = a_2 - b_2;
            System.out.println("Subtraction: " + a_2 + " + " + b_2 + " = "+ c_2);

        // * (multiplication)
            int a_3, b_3, c_3;
            a_3 = 3;
            b_3 = 10;
            c_3 = a_3 * b_3;
            System.out.println("Multiplication: " + a_3 + " * " + b_3 + " = " + c_3);

        // / (division)
            int a_4, b_4, c_4;
            a_4 = 25;
            b_4 = 5;
            c_4 = a_4 / b_4;
            System.out.println("Division: " + a_4 + " / " + b_4 + " = " + c_4);

        // % (modulus/remainder)
            int runners, group_number, remainder;
            runners = 2500;
            group_number = 60;
            remainder = runners % group_number;
            System.out.println("Last group will be with: " + remainder + " runners.");

        // We can also use "+="" to increase a number or any of the other operators subsequential.
            group_number += 2;
            System.out.println("Adding 2 more players with '+=': " + group_number);
            ++ group_number;
            System.out.println("Adding 1 more player with '++': " + group_number);
    }
}
