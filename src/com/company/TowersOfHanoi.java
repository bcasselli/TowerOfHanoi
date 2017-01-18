package com.company;
/**
 * Created by bc608 on 1/17/17.
 */
public class TowersOfHanoi {


    public void solve(int n, String start, String auxiliary, String end)
    {
        
        if(n == 1)
        {
            System.out.println(number.i + ": " + "Move one disk from " + start + " -> " + end);
        }
        else
        {
            solve(n - 1, start, end, auxiliary);
            System.out.println(g + ": " + "Move one disk from " + start + " -> " + end);
            solve(n - 1, auxiliary, start, end);
        }
    }
    public void number(int i)
    {
        for(i = 1; i <= 40; i++)
        {

        }
    }
}
