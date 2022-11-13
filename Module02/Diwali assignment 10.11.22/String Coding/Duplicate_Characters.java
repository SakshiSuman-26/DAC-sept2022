import java.util.Scanner;
class Duplicate_Characters    //print duplicate character
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter String: ");
		String str1 = sc.nextLine();
		int count;
		
		char array[] = str1.toCharArray();
		
		System.out.println("Duplicate characters are: ");
		
		for(int i=0; i<array.length; i++)
		{
			count =1;
			for(int j=i+1; j<array.length; j++)
			{
				if(array[i] == array[j] && array[i] !=' ')
				{
					count++;
					array[j] =0;
				}
			}
			if(count >1 && array[i]!='0')
			System.out.print(array[i]+"  ");
		}				
	}	
}
/*
OUTPUT

Enter String: happyyyyy
Duplicate characters are:
p  y


Enter String: java
Duplicate characters are:
a

*/