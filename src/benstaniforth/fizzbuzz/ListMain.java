package benstaniforth.fizzbuzz;

import sun.jvm.hotspot.utilities.ReversePtrs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        for (int number = 1; number < 501; number++) {

            boolean Fizz = false;

            boolean Buzz = false;

            boolean Bang = false;

            boolean Bong = false;

            boolean Fezz = false;

            boolean Reverse = false;

            if (number % 3 == 0)
                Fizz = true;

            if (number % 5 == 0)
                Buzz = true;

            if (number % 7 == 0)
                Bang = true;

            if (number % 11 == 0)
                Bong = true;

            if (number % 13 == 0)
                Fezz = true;

            if (number % 17 == 0)
                 Reverse = true;

            List myArray = new ArrayList();

                    if (Fizz){
                        myArray.add("Fizz");}
                    if (Buzz){
                        myArray.add("Buzz");}
                    if (Bang){
                        myArray.add("Bang");}
                    if (Bong){
                        myArray.clear();{
                            if (Fezz){
                                myArray.add("Fezz");}
                            }
                        myArray.add("Bong");
                        }
                    if (Reverse){
                        Collections.reverse(myArray);
                    }

            StringBuilder sb = new StringBuilder();
                    if (myArray.isEmpty()){
                        System.out.println(number);
                    }
                    else{
                        System.out.println(myArray);
                    }

           System.out.println(sb);

        }
    }

}
