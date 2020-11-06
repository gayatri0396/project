
public class BinaryToDecimal
{
	static int pow(int n, int p)
	{
		int pw=1;
		while(p>0)
		{
			pw=pw*n;
			p--;
		}
		return pw;
	}
	
	public static void main(String[] args) 
	{
		System.out.println("PS");
		//way 1-using built in method

		String str="1101";
		System.out.println("Binary no. is: "+str);
		int num=Integer.parseInt(str,2);
		System.out.println("Decimal no. is: "+num);

		System.out.println("--------------------");
		//way 2-generic method
		
		int s=pow(2,2);
		int t=pow(2,3);
		System.out.println(s);
		System.out.println(t);
		
		System.out.println("--------------------");
		//way 3-
		int no=1101;
		int temp1=no;
		int dec=0;
		int count=0;
		while(temp1>0)
		{
			int r=temp1%10;
			dec=dec + r*pow(2,count);
			count++;
			temp1=temp1/10;
		}
		System.out.println("Decimal value is: "+dec);
		System.out.println("PE");
	}
}

