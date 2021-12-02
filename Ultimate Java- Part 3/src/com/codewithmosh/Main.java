package com.codewithmosh;

import java.io.IOException;

import com.codewithmosh.exceptions.ExceptionsDemo;
import com.codewithmosh.generics.GenericList;
import com.codewithmosh.generics.Instructor;
import com.codewithmosh.generics.User;
import com.codewithmosh.generics.Utils;

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

        // GENERICS
        var list = new GenericList<Integer>();
        list.add(100);
        int number = list.get(0);
        System.out.println(number);

        var userList = new GenericList<User>();
        userList.add(new User(10));
        userList.add(new User(20));
        User user1 = userList.get(0);
        User user2 = userList.get(1);
        System.out.println(user1.compareTo(user2));

        // Wrapper classes for primitive types
        // int -> Integer
        // float -> Float
        // boolean -> Boolean

        GenericList<Integer> numbers = new GenericList<>();
        numbers.add(1); // Boxing
        int number2 = numbers.get(0); // Unboxing

        // Generic Methods
        var max = Utils.max(new User(10), new User(20));
        System.out.println("Max: " + max);

        // Multiple type parameters
        Utils.print(1, "MOSH");

        // Generic Classes and Inheritance
        User user3 = new Instructor(10);
        Utils.printUser(user3);

        var users = new GenericList<Instructor>();
        users.add(new Instructor(1));
        users.add(new Instructor(2));
        users.add(new Instructor(3));
        Utils.printUsers(users);
    }
}
