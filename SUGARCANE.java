// https://www.codechef.com/problems/SUGARCANE
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
		    int x = 50*(s.nextInt());
		    double res = 2*(x*0.2) + (x*0.3);
		    int res1 = (int)res;
		    System.out.println(x-res1);
		}
	}
}
