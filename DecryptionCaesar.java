//Decryption of caesar cypher

import java.util.*;

class Decryption
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String plaintext;
		int plaintextLen,key;
		byte ctoi[];
		int corrections;
			
		//getting input
		System.out.println("Enter Encryption sentences: ");
		plaintext=sc.nextLine();
		System.out.println("ENTER ENCRYPTION KEY: ");
		key=sc.nextInt();
			
		// calculating length of string
		plaintextLen = plaintext.length();	
		
		//convert string to integer(Ascii)	
		ctoi = plaintext.getBytes();
		
		//converting to the cypher text
		int temparr[]=new int[plaintextLen];
		for(int i=0;i<plaintextLen;i++)
		{
			if(Character.isUpperCase(plaintext.charAt(i)))
			{
				corrections=0;
				corrections=((ctoi[i]-key)-65)%26;
				if(corrections<0)
				{
					corrections=26+(corrections);
					temparr[i]=corrections+65;
				}
				else
				{
					temparr[i]=corrections+65;
				}
			}
			else if(Character.isLowerCase(plaintext.charAt(i)))
			{
				corrections=0;
				corrections=((ctoi[i]-key)-97)%26;
				if(corrections<0)
				{
					corrections=26+(corrections);
					temparr[i]=corrections+97;
				}
				else
				{
					temparr[i]=corrections+97;
				}
			}
			else if(Character.isDigit(plaintext.charAt(i)))
			{
				temparr[i]=(((ctoi[i]-key)));
			}
			else
			{
				temparr[i]=ctoi[i];		//+key;
			}
		}
		String atoc;	//to store converting Ascii to character
		System.out.println("plain text: ");
		for(int c: temparr)
		{
			atoc=Character.toString((char)c); 
			System.out.print(atoc);
		}
	}
}