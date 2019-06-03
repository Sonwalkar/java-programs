//Encryption of caesar cypher 

import java.util.*;

class Encryption
{
	
		Scanner sc = new Scanner(System.in);
		String plaintext;
		int plaintextLen,key;
		byte ctoi[];
			
		void getinput()
		{
			//getting input
			System.out.println("Enter Encryption sentences: ");
			plaintext=sc.nextLine();
			System.out.println("ENTER ENCRYPTION KEY: ");
			key=sc.nextInt();
		}

		
			// calculating length of string
			plaintextLen=plaintext.length();	
			
			//convert string to integer(Ascii)	
			ctoi=plaintext.getBytes();
			
			//converting to the cypher text
			int temparr[]=new int[plaintextLen];
		void processing()
		{
			for(int i=0;i<plaintextLen;i++)
			{
				if(Character.isUpperCase(plaintext.charAt(i)))
				{
					temparr[i]=(((ctoi[i]+key)-65)%26)+65;
				}
				else if(Character.isLowerCase(plaintext.charAt(i)))
				{
					temparr[i]=(((ctoi[i]+key)-97)%26)+97;
				}
				else if(Character.isDigit(plaintext.charAt(i)))
				{
					temparr[i]=(((ctoi[i]+key)-52)%10)+97;
				}
				else
				{
					temparr[i]=ctoi[i];		//+key;
				}
			}
		}
		void putoutput()
		{
			String atoc;	//to store converting Ascii to character
			System.out.println("Cypher Text: ");
			for(int c: temparr)
			{
				atoc=Character.toString((char)c); 
				System.out.print(atoc);
			}
		}
}
class EncryptionCaesar
{
	public static void main(String args[])
	{
			Encryption e = new Encryption();
			e.getinput();
			e.processing();
			e.putoutput();
	}
}