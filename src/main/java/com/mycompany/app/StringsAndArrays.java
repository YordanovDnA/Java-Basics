package com.mycompany.app;

public class StringsAndArrays {
    public static void main(String[] args){
        //Advanced data types
        // Strings and Arrays
        
        String welcoming_message = "Welcome to the World of Java!";
        System.out.println(welcoming_message);

        int[] my_array = {1,2,3,4,5};
        String message = "";
        int i = 0;
        for (int num :  my_array){
            if(i < my_array.length - 1){
                message = message + num + ", ";
            }
            else{
                message = message + num;
            }
            i++;
        } 
        System.out.println("[ " + message +" ]");

    }
}
