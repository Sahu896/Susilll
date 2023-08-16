package NumberPrograms;

public class StrongNumber {
	public static void main(String[] args) {
		int num=145;
		int temp=num;
		int sum=0;
		int mul=1;
		int rim;
		while(num>0)
		{
			rim=num%10;
			System.out.println(rim);
			while(rim>0)
			{
				mul=mul*rim;
				sum=sum+mul;
		}
		
	}

}
