package task2;

import java.util.Random;

public class task2Main
{public static void main(String[] args){
    int x=3;
    String[] sumnum = new String[x];
    int[] num = new int[x];
    for (int i =0; i <x; i++)
    {
        Random rand = new Random();
        num[i] = rand.nextInt(1000);
        sumnum[i]=Integer.toString(num[i]);
        int sum=Integer.valueOf(sumnum[0]);
        if (i!=0)sum -=  Integer.valueOf(sumnum[i]);
        System.out.println("Random number "+(i+1)+" is " + num[i]);
        System.out.println("difference between random numbers "+sum);
    }
    
    for(String str : sumnum) {
        sum += Integer.valueOf(str);
    }
}


