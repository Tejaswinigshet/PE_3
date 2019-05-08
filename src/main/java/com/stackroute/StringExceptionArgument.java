/* Create a class with a main( ) that throws an object of class Exception inside a try block.
a. Give the constructor for Exception a String argument.
b. Catch the exception inside a catch clause and print the String argument.
c. Add a finally clause and print a message to prove you were there.package com.stackroute;*/

package com.stackroute;

public class StringExceptionArgument {
    StringExceptionArgument(String message) {
        message = "this is bound to execute";
        System.out.println(message);
    }

    public static void main(String[] args) throws Exception {
        try {
            throw new Exception();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("printed");
        }

    }
}