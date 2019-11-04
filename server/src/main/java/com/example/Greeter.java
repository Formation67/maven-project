/**
 * This is a package.
 */
package com.example;

/**
 * This is a class.
 */
public class Greeter {

  /**
   * This is a constructor.
   */
  public Greeter() {
   // ok
  }

    /**
   * This is a greet methods.
   * @param someone the name of the personne
   * @return someone string
   */
  public final String greet(final String someone) {
    System.out.println("Hello");
    return String.format("Hello World, %s!", someone);
  }
}
//
