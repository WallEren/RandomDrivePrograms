/*
Longest Sequence of elements in increasing/non-decreasing order with corresponding to their color
(colors should not be consequtively same above 2 times)
Link: https://onlinegdb.com/Z3FxlDNDC
*/

import java.util.*;
public class Main
{
    static boolean colorCheck(int arr[], int mColor, int nColor, int n)
    {
        if(n>=2)
        {
            if(mColor==nColor && nColor==arr[n])
            {
                return false;
            }
        }
        return true;
    }
    static boolean colorSame(int arr[], int arrSize)
    {
        int same = arr[0];
        for(int i = 1; i < arrSize; i++)
        {
            if(same != arr[i])
            {
                return false;
            }
        }
        return true;
    }
	public static void main(String[] args)
	{
	    Scanner sc = new Scanner(System.in);
	    int N = sc.nextInt();
	    int A[] = new int[N];
	    int C[] = new int[N];
	    for(int i = 0; i < N; i++)
	    {
	        A[i] = sc.nextInt();
	    }
	    for(int i = 0; i < N; i++)
	    {
	        C[i] = sc.nextInt();
	    }
	    int maxSequence = 0;
	    if(colorSame(C, N))
	    {
	        System.out.println("2");
	        return;
	    }
	    else
	    {
	        for(int i = 0; i < N-1; i++)
	        {
	            int longestSequence = 1;
	            int m = i;
	            int n = m+1;
	            //int mValue = 0;
	            int mColor = C[m];
	            //int nValue = 0;
	            int nColor = C[n];
	            while(true)
	            {
	                if(m<N && n<N && A[m]<A[n] && colorCheck(C, mColor, nColor, n))
	                {
	                    mColor = C[m];
	                    nColor = C[n];
	                    longestSequence++;
	                    m=n;
	                }
	                n++;
	                if(n==N)
	                {
	                    break;
	                }
	            }
	            if(maxSequence < longestSequence)
	            {
	                maxSequence = longestSequence;
	            }
	        }
	    }
		System.out.println(maxSequence);
	}
}
