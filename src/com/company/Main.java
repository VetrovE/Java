package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Scanner in = new Scanner(System.in);

        int x = in.nextInt();
        System.out.println(Search(Math.abs(x)));

    }

    public static int Search(int x){
        if (x == Summ(n(x))){
            return n(x);
        }
        int dist = n(x);
        int gr = Search(Math.abs(Summ(n(x) + 1) - x)) + 2;
        int less = Search(Math.abs(Summ(n(x)) - x)) + 2;
        if (gr < less) return gr + dist;
        else return less + dist;
    }


    // формулы геометрической прогрессии
    static public int n(int x){
        return (int)(Math.log(1 - x*(1-2))/Math.log(2));
    }
    static public int Bn(int x){
        return (int)Math.pow(2,x - 1);
    }
    static public int Summ(int n){
        return (int)(1 - Math.pow(2,n))/(1 - 2);
    }

}

