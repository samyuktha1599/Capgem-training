package lab3.task2;

import java.util.Scanner;

public class ReplaceConsonants {
	
	public String alterString (String str)
	{
		str=str.toLowerCase();
		char[] ch=str.toCharArray();
		for(int i=0;i<ch.length;i++)
		{
			if(!isVowel(ch[i]))
			{
				if(ch[i]=='z') {
					ch[i]='b';
				}
				else
				{
					ch[i]=(char)(ch[i]+1);
					
					if(isVowel(ch[i]))
					{
						ch[i]=(char)(ch[i]+1);
					}
				}
				
			}
			
		}
		String str2=String.valueOf(ch);
		
		str2=str2.toUpperCase();
		return str2;
		
	}
	
	
	private boolean isVowel(char c) {
		
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
		{
			return true;
		}
		return false;
	}


	public static void main(String[] args) {
		ReplaceConsonants rc=new ReplaceConsonants();
		System.out.println("Enter the word");
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		String str2=rc.alterString(str);
		System.out.println(str2);
		sc.close();
	}

}
