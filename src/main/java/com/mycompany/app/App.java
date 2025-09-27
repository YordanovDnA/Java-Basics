/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package com.mycompany.app;

/*
On the first line, we have the statement package com.mycompany.helloworld;

This statement tells the compiler that the Java file we wrote belongs to the 
com.mycompany.helloworld package.

A package is a grouping of related classes and interfaces. 
Do not worry if you do not know what classes and 
interfaces are; we’ll cover them in subsequent chapters. 

When we write package com.mycompany.helloworld; at the top of our file,
we are asking the compiler to include this file in the
com.mycompany.helloworld package.

The compiler will then create a folder called “com”. 
This folder contains a subfolder called “mycompany”, which in turn contains a deeper subfolder called “helloworld”.

Files that belong to the com.mycompany.helloworld package will be stored in this folder.
*/

public class App {
    public static void main(String[] args) {
        System.out.println("Hello Remote World!");
    }
}

/*
 * The main() method is the entry point of all Java applications. 
 * Whenever a Java application is started, the main() method is the first method to be called.
 */