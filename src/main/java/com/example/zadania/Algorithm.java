package com.example.zadania;

public class Algorithm {
    private int a;
    private int b;

    public Algorithm(){
        this.a = a;
        this.b = b;
    }
    public int EuklidesAlgorithm(int a,int b){
        int a1 = a;
        int b1 = b;
        int result = 0;
            while (a!=b){
                if (a>b){
                    a = a-b;
                } else {
                    b = b-a;
                }
            }

        result = a;
        System.out.println("The greatest common divisor of numbers: " + a1 + " i " + b1 + " is: " + result);
        return result;
    }


}

class ProgramA {
    public static void main(String[] args) {
        Algorithm algorithm = new Algorithm();
        algorithm.EuklidesAlgorithm(412692,58956);
    }
}
