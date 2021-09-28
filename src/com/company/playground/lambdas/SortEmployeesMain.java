package com.company.playground.lambdas;

import java.io.*;
import java.util.*;

class Employee
{
    private String name;
    private int id;
    private int age;
    //Create the Constructor here

    public Employee(String name,int id,int age)
    {
        this.age=age;
        this.id=id;
        this.name=name;

    }

    public String getName(){return this.name;}

    public int getId(){return this.id;}

    public int getAge(){return this.age;}

    public String toString(){
        return this.name+" "+this.id+" "+this.age;
    }
}

class SortEmployees
{
    void sortEmployees(ArrayList<Employee> empList)
    {

        //Enter your Code here

        empList.sort((a1,a2)->{return a1.getName().compareTo(a2.getName());});
        empList.forEach(System.out::println);

    }
}

public class SortEmployeesMain
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Employee> empList=new ArrayList<>();

        int n=Integer.parseInt(br.readLine().trim());
        for(int i=0;i<n;i++)
        {
            String inp=br.readLine();
            String inparr[]=inp.split(" ");

            Employee ws=new Employee(inparr[0],Integer.parseInt(inparr[1]), Integer.parseInt(inparr[2]));
            empList.add(ws);
        }

        SortEmployees s1=new SortEmployees();
        s1.sortEmployees(empList);
    }
}

