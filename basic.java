
import java.util.*;
public class basic {

	public static void main(String[] args) {
		
		String str;
	    char c[]=new char[20];
		Scanner sc=new Scanner(System.in);
		str=sc.nextLine();
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			c[i]=str.charAt(i);
			System.out.println(c[i]);
			
		}
	
		
		

	}

}
