package benstaniforth.fizzbuzz;

import sun.font.TrueTypeFont;
import sun.security.util.Length;

public class NewMain {

    public static void main(String[] args) {

        for (int number = 1; number < 201; number++) {

            boolean Fizz = false;

            boolean Buzz = false;

            boolean Bang = false;

            boolean Bong = false;

            boolean Fezz = false;

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

            StringBuilder sb = new StringBuilder();
            if (Fizz)
                sb.append("Fizz");
            if (Buzz)
                sb.append("Buzz");
            if (Bang)
                sb.append("Bang");
            if (Bong)
                sb.replace(0, sb.length(), "Bong");
            if (Fezz)
                if (sb.indexOf("B") != -1) {
                    sb.insert(sb.indexOf("B"), "Fezz");
                }
            else if (sb.indexOf("B") == -1){
                    sb.append("Fezz");}
            

            if (sb.length() == 0) {
                System.out.println(number);
            } else {
                System.out.println(sb);
            }
        }


    }

}