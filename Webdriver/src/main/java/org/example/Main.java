package org.example;

public class Main {
    public final double a;
    public final double b;
    public final double c;
    private int N;
    public Main (double a, double b, double c){

        this.a = a;
        this.b = b;
        this.c = c;

        double d = b*b - 4*a*c;
        if (d>0){
            N = 2;
        }else {
            if(d == 0){
                N = 1;
            }else {
                N = 0;
            }
        }

    }
    public int RootNumber(){
        return N;
    }
}