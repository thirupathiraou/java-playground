package com.company.playground.functionalinterfaces;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.function.Consumer;
import java.util.function.IntPredicate;
import java.util.stream.IntStream;
import java.util.stream.LongStream;

class PrimeComposite_Factorial_1
{
    void primeOrComposite(int n)
    {
        //Enter your Code here

        String message="";
        if(n==1 || n==0){
            message="Neither Prime Nor Composite";
            printConsumerString(message,a->System.out.println(a));
            return;
        }

        IntPredicate p= (a) -> {return n%a == 0;};

        boolean counterflag= IntStream.range(2,n-1).noneMatch(p);


        if(counterflag){
            message="Prime";
        }
        else{
            message="Composite";
        }
        printConsumerString(message,a->System.out.println(a));
    }

    void findFactorial(int n)
    {
        //Enter your Code here


        long result= LongStream.rangeClosed(1, n)
                .reduce(1,(a,b)->{return a*b;});

        printConsumer(result,(p)->System.out.println(p));
    }

    void printConsumer(Long result, Consumer<Long> consumer){
        consumer.accept(result);
    }

    void printConsumerString(String result,Consumer<String> consumer){
        consumer.accept(result);
    }
}

public class PrimeComposite_FactorialMain_With_FunctionalInterfaces
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

