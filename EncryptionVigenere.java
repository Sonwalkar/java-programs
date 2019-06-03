import java.util.*;
import java.lang.*;
class EncryptionVigenere
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		String plaintext,key;
		int keylen,plaintextlen;
		byte ctoipl[],ctoik[];//convert to integer plaintext and key
		
		//get input
		System.out.println("Enter Plaintext: ");
		plaintext=sc.nextLine();
		System.out.println("Enter Key: ");
		key=sc.nextLine();
		
	//converting to cyper text
		plaintextlen=plaintext.length(); //calculate length
		keylen= key.length();
		
		ctoipl=plaintext.getBytes(); //convert int integer
		ctoik=key.getBytes();
		
		int keyint[]=new int[keylen];// to store key in the form of integer 
		int temparr[]=new int[plaintextlen];
		
		for(int i=0;i<keylen;i++)
		{
			if(Character.isUpperCase(key.charAt(i)))
			{
				keyint[i]=ctoik[i]-65;
			}
			else if(Character.isLowerCase(key.charAt(i)))
			{
				keyint[i]=ctoik[i]-97;
			}
		}
		int k=0;
		for(int j=0;j<plaintextlen;j++)
		{
						
			if(keylen==k)
			{
				k=0;
			}
			if(Character.isUpperCase(plaintext.charAt(j)))
			{
				temparr[j]=(((ctoipl[j]+keyint[k])-65)%26)+65;
				k++;
			}
			else if(Character.isLowerCase(plaintext.charAt(j)))
			{
				temparr[j]=(((ctoipl[j]+keyint[k])-97)%26)+97;
				k++;
			}
			/*else if(Character.isDigit(plaintext.charAt(j)))
			{
				temparr[j]=(((ctoipl[j]+keyint[k])-65)%26)+65;
				k++;
			}*/
			else
			{
				temparr[j]=ctoipl[j];
			}
			
		}
		
		String ctoc;	//convert to char
		System.out.println("Cypher Text: ");
		for(int c: temparr)
		{
			//ctoc[k]=(char)temparr[k];
			ctoc=Character.toString((char)c);//Character.toString ((char) i);
			System.out.print(ctoc);
		}
	}
}