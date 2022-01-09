/*
Number of toys can be brought with given money
Link: https://onlinegdb.com/wzLmCtg1b
*/

import java.util.*;
public class Main
{
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int X = sc.nextInt();
	    int Y = sc.nextInt();
	    int Z = sc.nextInt();
	    int A[] = new int[N];
	    for(int i = 0; i < N; i++)
	    {
	        A[i] = sc.nextInt();
	    }
	    
	    int totalAmount = (1*X)+(2*Y)+(3*Z);
	    int canBuy = 0;
	    for(int i = 0; i < N; i++)
	    {
	        if(totalAmount>=A[i])
	        {
	            canBuy++;
	        }
	    }
		System.out.println(canBuy);
	}
}
