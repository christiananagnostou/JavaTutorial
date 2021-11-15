package com.codewithmosh.exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionsDemo {

  public static void show() throws IOException {
    var account = new Account();
    try {
      account.deposit(5);
      account.withdraw(10);

    } catch (IOException e) {
      System.out.println("Logging");
      throw e;
    } catch (AccountException e) {
      e.printStackTrace();
      var cause = e.getCause();
      System.out.println(cause);
      System.out.println(e.getMessage());
    }

    // // FileReader reader = null;

    // try (var reader = new FileReader("file.txt"); var writer = new
    // FileWriter("...");) {
    // var value = reader.read();
    // new SimpleDateFormat().parse("");

    // // reader.close() This will never be accessed if an error is thrown before
    // it.
    // // Options:
    // // 1) Use a finally block to close the reader if it has been initialized
    // // 2) Use a try-with-resourses (as above) and let the java compiler translate
    // // this code to use a finally block and automatically close

    // } catch (FileNotFoundException | ParseException e) {
    // System.out.println("File does not exist.");
    // e.printStackTrace();
    // } catch (IOException e) {
    // e.printStackTrace();
    // System.out.println("Could not read data");
    // }
    // // finally {
    // // if (reader != null)
    // // try {
    // // reader.close();
    // // } catch (IOException e) {
    // // e.printStackTrace();
    // // }
    // // }

  }

}
