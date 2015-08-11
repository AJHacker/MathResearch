 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class LCG
{
	public static void main (String args[]) throws java.lang.Exception
	{
		int seed = Integer.parseInt(args[0]);
		int a = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);
		int m = Integer.parseInt(args[3]);
		for(int i = 1;i<30;i++){
			seed = ((a*seed)+c)%m;
			System.out.println(seed);
 
		}
	}
}
