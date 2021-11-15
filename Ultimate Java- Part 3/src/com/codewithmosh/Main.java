package com.codewithmosh;

import java.io.IOException;

import com.codewithmosh.exceptions.ExceptionsDemo;

public class Main {
    public static void main(String[] args) {
        try {
            ExceptionsDemo.show();
        } catch (Throwable e) {
            System.out.println("An unexpected error occured.");
        }

        // TYPES OF EXCEPTIONS

        // CHECKED
        // - Exceptions that we should anticipate and handle properly
        // - checked at compile time or "on save"
        // EX: var reader = new FileReader("file.txt");

        // UNCHECKED (runtime)
        // - Exceptions not checked by compiler at compile time.
        // - They occur because of programming errors.
        // * Examples of runtime exceptions: *
        // - NullPointerException - passing null to a method that requires a String
        // - ArithmeticException - thrown when trying to divide a value by 0
        // - IllegalArgumentException - indicates an argument passed to a method is not
        // valid
        // - IndexOutOfBoundsException - occurs when trying to access an element in a
        // list, array, or string using an invalid index
        // - IllegalStateException - calling a method when the underlying method is not
        // in the right state

        // ERROR
        // Indicates an error external to our application
        // Examples: StackOverflowError & OutOfMemoryError

        // Exceptions Heirarchy:

        // Throwable
        // / \
        // Exception Error
        // /
        // RuntimeException

        // Example of Exception Heirarchy:
        // java.lang.Object
        // -> java.lang.Throwable
        // -> java.lang.Exception
        // -> java.lang.RuntimeException
        // -> java.lang.NullPointerException
    }
}
