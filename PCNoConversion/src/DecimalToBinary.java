
public class DecimalToBinary 
{
	public static void main(String[] args)
	{
		System.out.println("PS");
		//way 1-using built in method
		int no=11;
		System.out.println("Decimal no. is:" +no);

		String binary = Integer.toBinaryString(no);
		System.out.println("Binary no. is:" +binary);

		System.out.println("-------------------------");
		//way 2-using array
		int num=11;
		int arr[]=new int[32];
		int temp=num;
		int index=arr.length-1;

		while(temp>0)
		{
			arr[index]=temp%2;
			temp=temp/2;
			index--;
		}

		System.out.println("By using array");
		for(int i=0;i<=arr.length-1;i++)
		{
			System.out.print(arr[i]);
		}

		System.out.println("\n-------------------------");
		//way 3-using string
		String str="";
		int temp1=no;
		while(temp1>0)
		{
			int rem=temp1%2;
			str=rem + str;
			temp1=temp1/2;
		}
		System.out.println("By using String");
		System.out.println(str);

		System.out.println("\nPE");
	}
}
