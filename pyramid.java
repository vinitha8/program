import java.util.Scanner;
public class Pyramid {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in); 
        System.out.println("Level: "); 
        int rows = sc.nextInt(); 
        int count = 1,num=1,digi=0; 
        for (int i=rows;i>0;i--)
        { for (int j = 1; j <= i*2; j++)
            {
        	 System.out.print(" ");
            } 
            for (int j=1;j<=count;j++)             
            {
             if(num>9){
            	num=0;
             }            
             System.out.print(num+" ");
             num++;
            }
             digi=num-2;
            for (int j=count-1;j>=1;j--)
            {
             if(digi<0){
            	 digi=9;
             }
             System.out.print(digi+" ");
             digi--;
            }        
             System.out.println();
             count++;
        }
     sc.close();
	}

}
