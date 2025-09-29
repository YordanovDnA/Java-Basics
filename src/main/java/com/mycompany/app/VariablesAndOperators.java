package com.mycompany.app;

public class VariablesAndOperators {
    public static void main(String[] args) {
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


    }
}
