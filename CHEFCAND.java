// https://www.codechef.com/problems/CHEFCAND?tab=statement
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
	        int x = s.nextInt();
	        int y = s.nextInt();
	        int res = x-y;
	        int res1 = res/4;
	        if(res>=0){
	            if(res%4==0){
	                System.out.println(res1);
	            }else{
	                System.out.println(res1+1);
	            }
	        }else{
	            System.out.println(0);
	        }
	    }
	}
}
