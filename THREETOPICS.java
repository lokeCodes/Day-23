// https://www.codechef.com/problems/THREETOPICS
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		    int a = s.nextInt();
		    int b = s.nextInt();
		    int c = s.nextInt();
		    int x = s.nextInt();
		    String res = (x==a || x==b || x==c) ? "YES" : "NO";
		    System.out.println(res);
	}
}
