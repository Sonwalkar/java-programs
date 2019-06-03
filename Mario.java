import java.util.*;
class Mario
{
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		  int i, j, rows;
        System.out.print("Enter number of rows: ");
     rows=sc.nextInt();

    
     for(i=1; i<=rows; i++)
     {
        
        for(j=i; j<rows; j++)
        {
             System.out.print(" ");
        }
        
        for(j=1; j<=i; j++)
        {
             System.out.print("#");
        }
		for(int b=0;b<rows;b++)
		{
			System.out.print(" ");
		}
		for(j=1; j<=i; j++)
        {
             System.out.print("#");
        }	

        
      System.out.print("\n");
    }
    
}	

}