import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	Scanner sc=new Scanner(System.in);
	int x=sc.nextInt();
	int y=sc.nextInt();
	int z=sc.nextInt();
	int k=(y*z);
	if(x==k)
	{
	    System.out.println(0);
	}
	else if(x>k)
	{
	    System.out.println((x-k));
	}
	else{
	    System.out.println(-1);
	}
	}
}