/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		try{
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
            int t = Integer.parseInt(br.readLine());
            while(t--!=0){
                int n = Integer.parseInt(br.readLine()); 
                String b = br.readLine();
                int count=0;
                for (int i = 0; i < b.length(); i++) {
                    if (b.charAt(i) == '1') 
                        count++;
                    if(count==n-30)break;
                    }
                    if(count>=n-30)
                        System.out.println("YES");
                    else 
                        System.out.println("NO");
            }
            br.close();
		}
		catch(Exception e){
		    return;
		}
	}
}
