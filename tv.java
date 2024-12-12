import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int count;
	
        if(x % 2 == 0) {
            count = x / 2; // If X is even
        } else {
            count = (x + 1) / 2; // If X is odd
        }

        System.out.println(count); // Output the count of working channels
    }
	    
	    }
