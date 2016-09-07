package samp;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		    String[] s1 =str.split(" ");
		    String s2;
		        for(int i =str.length()-1;i>=0;i--){
		            s1 +=i!=0?str.charAt(i):str.charAt(i)+" ";
		            if(str.charAt(i) == ' '||i==0){
		                for(int j=s1.length-1;j>=0;j--){
		                    s2 += s1.length;
		                }
		                
		            }
		        }
		            System.out.println(s2+" ");
		    }
		}
