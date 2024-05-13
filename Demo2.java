import java.util.*;

class MyString
{
	String str;
	void get_str()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		str=sc.nextLine();  // to read a string
	}
	void findchar()  // extract each & every character
	{
		System.out.println("You have given -");
		for(int i=0;i<str.length();i++)    // length() returns the total no of characters of a string
		{
			System.out.print(str.charAt(i));  //charAt(i) returns the ith character
		}
	}
	void check_palin()
	{
		/*logic 1 - without reversing the string
		int f=0;
		for(int i=0,j=str.length()-1;i<=str.length()/2;i++,j--)
		{
			if(str.charAt(i)!=str.charAt(j))   //not a palindrome
			{
				f=1;   
				break;
			}
		}
		if(f==0)
			System.out.println(str+" is a Palindrome");
		else
			System.out.println(str+" is not a Palindrome");
		*/
		//logic 2 - physically reversing a string and then comparing it with the original string
	    String rev=""; //initialize a string with null
	    for(int i=0;i<str.length();i++)
	    {
	    	rev=str.charAt(i)+rev;  // + is the concatenation operator
	    }
	    System.out.println("Reverse of "+str+" is "+rev);
	    if(str.compareTo(rev)==0)
	    	System.out.println(str+" is a Palindrome");
	    else
	    	System.out.println(str+" is not a Palindrome");
	}
	void extract_words()
	{
		str+=" ";  //add a space at the end to extract the last word 
		String temp="";
		for(int i=0;i<str.length();i++) //I love java java
		{
			if(str.charAt(i)!=' ')
			{
				temp+=str.charAt(i);
			}
			else //temp contains the word
			{
				System.out.println(temp);
				temp=""; //to extract the next word
			}
		}
	}
	void find_frequecy()
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any word to find the frequency");
		String word=sc.nextLine();
		str+=" ";  //add a space at the end to extract the last word
		String temp="";
		int c=0; // c is counting the frequency
		for(int i=0;i<str.length();i++)
		{
			if(str.charAt(i)!=' ')
			{
				temp+=str.charAt(i);
			}
			else //temp contains the word
			{
				
				if(temp.compareTo(word)==0)  // check if the given word is found
					c++;
				
				temp=""; //to extract the next word
			}
		}
		if(c==0)
			System.out.println(word+" - is not present in - "+str);
		else
			System.out.println("Frequency of "+word+ " in - "+str+" is "+c);
	}
	void find_frequency_of_allchars()
	{
		int c=0;
		for(int i=65,j=97;i<=90;i++,j++)
		{
			for(int k=0;k<str.length();k++)
			{
				if(str.charAt(k)==(char)i || str.charAt(k)==(char)j)
				{
					c++;
				}
			}
			if(c!=0)
			{
				System.out.println("Frequency of "+(char)i+" or "+(char)j+" is "+c);
			    c=0;
			}
		}
	}
}
public class Demo2 {

	public static void main(String[] args) {
		MyString obj=new MyString();
		obj.get_str();
		//obj.findchar();
		//obj.check_palin();
		//obj.extract_words();
		//obj.find_frequecy();
		obj.find_frequency_of_allchars();

	}

}


/* 
 1. WAP to find the frequency of a given character in a given string.
 2. WAP to find the frequency of all the characters of a given string.
 */