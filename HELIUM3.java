// https://www.codechef.com/problems/HELIUM3
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int res1 = a*b;
		    int res2 = x*y;
		    String res = res2 >= res1 ? "Yes" : "No";
		    System.out.println(res);
		}
	}
}
