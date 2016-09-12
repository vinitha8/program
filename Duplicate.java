package samp;

import java.util.Scanner;

public class Duplicate {

	public static String main(String[] args) {
		// TODO Auto-generated method stub
	    String s=null;
		char [] ch = s.toCharArray();
	    int length =ch.length; 
	    for (int i=0;i<length;i++)
	    {
	        for (int j = i+1; j<length;j++)
	        {
	            if(ch[i]==ch[j])
	            {
	                int test =j;
	                for(int k=j+1; k<length ; k++)
	                {
	                    ch[test] = ch[k];
	                    test++;
	                }
	                length--;
	                j--;
	            }
	        }
	    }
	    return String.copyValueOf(ch).substring(0,length);
	}

}
