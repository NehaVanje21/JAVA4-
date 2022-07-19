package Neha;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class RegeEx1 {

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
		
		System.out.println(Pattern.matches("[a-zA-Z]", "FiFax"));
		
		System.out.println("Password :"+ Pattern.matches("[a-zA-Z0-9]{8.}","NehaV1234"));
		
		
		System.out.println("MObile Phone :"+ Pattern.matches("[6789]{1}[0-9]{9}","9234567891"));
		
		System.out.println("Email:"+Pattern.matches("[a-z0-9]+@[a-z]+\\.[a-z]{2,3}","mamta123@gmail.com"));
	}
	

}
