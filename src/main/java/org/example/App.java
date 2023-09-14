package org.example;

import org.example.interview.practise.A;
import org.example.interview.practise.B;
import org.example.interview.practise.C;
import org.example.interview.practise.D;

import java.util.Optional;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        A a = new A();
        Optional.ofNullable(a)
                .map(A::getB)
                .map(B::getC)
                .map(C::getD)
                .ifPresent(D::printMsg);
    }
}
