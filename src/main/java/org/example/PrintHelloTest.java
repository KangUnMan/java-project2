package org.example;

public class PrintHelloTest {
    public static void main(String[] args) {
        //콘트롤러
        PrintHello hello = new PrintHello();
        PrintBye Bye = new PrintBye();
        Bye.PrintByeBye();
        hello.printHi();
        hello.printHi();
    }

}
