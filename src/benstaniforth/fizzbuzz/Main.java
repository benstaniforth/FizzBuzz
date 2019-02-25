package benstaniforth.fizzbuzz;

public class Main {

    public static void main(String[] args) {

        for (int number = 1; number < 201; number++) {

            if (number % 11 == 0) {
                System.out.println("Bong");
            }
            else if (number % 7 == 0 && number % 3 == 0 && number % 5 ==0){
                System.out.println("FizzBuzzBang");
            }
            else if (number % 7 == 0 && number % 5 == 0){
                System.out.println("BuzzBang");
            }
            else if (number % 3 == 0 && number % 5 == 0){
                System.out.println("FizzBuzz");
            }
            else if (number % 7 == 0 && number % 3 == 0){
                System.out.println("FizzBang");
            }
            else if (number % 7 ==0){
                System.out.println("Bang");
            }
            else if (number % 3 == 0){
                System.out.println("Fizz");
            }
            else if (number % 5 == 0){
                System.out.println("Buzz");
            }

            else {

                System.out.println(number);


            }
        }

        }
    }


