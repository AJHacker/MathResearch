 
import java.util.*;
import java.lang.*;
import java.io.*;
 
class XOR
{
	public static void main (String args[]) throws java.lang.Exception
	{
	long x = Long.parseLong(args[0]); {
	x ^= (x << 21);	
  	x ^= (x >>> 35);
  	x ^= (x << 4);
	System.out.println(x);
}
 
	}
}
