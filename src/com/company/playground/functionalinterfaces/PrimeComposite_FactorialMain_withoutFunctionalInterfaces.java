package com.company.playground.functionalinterfaces;

import java.io.*;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class PrimeComposite_Factorial
{
    void primeOrComposite(int n)
    {
        //Enter your Code here

        if(n==1){
            System.out.println("Neither Prime Nor Composite");
            return;
        }
        int counter=0;
        for(int i=2;i<=n/2;++i){
            if(n%i==0){
                counter++;
            }
        }
        if(counter==0){
            System.out.println("Prime");
        }
        else{
            System.out.println("Composite");
        }
    }

    void findFactorial(int n)
    {
        //Enter your Code here

        int fact=1;


        for(int i=1;i<=n;++i){
            fact=fact*i;
        }
        System.out.println(fact);
    }
}

public class PrimeComposite_FactorialMain_withoutFunctionalInterfaces
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine().trim());

        PrimeComposite_Factorial xyz=new PrimeComposite_Factorial();

        xyz.primeOrComposite(n);
        xyz.findFactorial(n);

    }
}

