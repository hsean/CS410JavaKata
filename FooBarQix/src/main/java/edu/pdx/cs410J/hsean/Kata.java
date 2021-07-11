package edu.pdx.cs410J.hsean;

/**
 * A class for getting started with a code kata
 *
 * Use IntelliJ's "Refactor | Rename..." command to change the name of this
 * class (and its tests).
 */

public class Kata {

  public static void FooBarQix(String s) {
    int num = Integer.parseInt(s);
    boolean foobarqix = false;

    System.out.print(s + " => ");

    if(num % 3 == 0) {
      foobarqix = true;
      System.out.print("Foo");

      for(int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '3') {
          System.out.print("Foo");
        }
      }
    }

    if(num % 5 == 0) {
      foobarqix = true;
      System.out.print("Bar");

      for(int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '5') {
          System.out.print("Bar");
        }
      }
    }

    if(num % 7 == 0) {
      foobarqix = true;
      System.out.print("Qix");

      for(int i = 0; i < s.length(); i++) {
        if (s.charAt(i) == '7') {
          System.out.print("Qix");
        }
      }
    }

    if(!foobarqix) {
      System.out.println(s);
    }
  }

  public static void main(String[] args) {

    if(args.length < 1) {
      System.err.println("Missing command line arguments");
      System.exit(1);
    }

    FooBarQix(args[0]);
    System.exit(0);
  }
}

