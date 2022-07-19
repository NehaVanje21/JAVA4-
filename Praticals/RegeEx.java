package Neha;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegeEx {

	public static void main (String[] args)
	{
		
		Pattern p=Pattern.compile(". .m");//.-Single Character
		Matcher m=p.matcher("madam");
		boolean b=m.matches();
		System.out.println(b);
		
		//or
		boolean b1=Pattern .compile("s.").matcher("so").matches();
		System.out.println(b1);
		
		//or
		System.out.println(Pattern.matches("..c.", "much"));
		
		
	}
	

}
