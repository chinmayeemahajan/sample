import java.util.* ;
import java.io.*; 
public class equillibrium {

	public static void arrayEquilibriumIndex(int[] arr)
	{ int sumi=0;
	int sumj=0;
	for(int j = arr.length;j<0;j--)
	{
		for(int i=0;i<j;i++)
		{
			if((sumi+arr[i]+arr[i+1])==(sumj+arr[j]+arr[j-1]))
			{
				System.out.println(arr[i+1]);
			}
		}
	}
	}

	public static void main(String[] args)
	{
		
		//Your code goes here
		
		Scanner in = new Scanner(System.in);
		int b= in.nextInt();
		int[] arr = new int[b];
		for(int k =0;k<b;k++)
		{
			arr[k]=in.nextInt();
		}
		 arrayEquilibriumIndex(arr);
	}
}