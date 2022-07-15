package Neha;

import java.security.PKCS12Attribute;

public class StringEx1 {
	
	public static void main(String args[])
	{
		String s="Neha Suresh Vanje Neha";
		System.out.println(s.toUpperCase());
		//System.out.println(s.toLowerCase());
		System.out.println(s.startsWith("Ne"));//true
        System.out.println(s.endsWith("a"));//false
        System.out.println(s.length()); //4
        String rs=s.replace(" Vanje","ccccc");//replace all the occurances in string
        System.out.println(rs);
        String s1="Ramkumar";
        String s2=" Kumar";
        String s3="ramkumar";
        System.out.println(s1.equals(s2));//false
        System.out.println(s1.equals(s3));//false.case do not match
        System.out.println(s1.equalsIgnoreCase(s3));//true
        System.out.println(s1.compareToIgnoreCase(s3));
        System.out.println(s1.compareTo(s2));//positive
        System.out.println(s2.compareTo(s1));//negative
        System.out.println(s2.concat("Kiran"));
        System.out.println(s3.contains("good")); //true
        String[] arr=s3.split("\\s");//split on whitespace
        for(String a : arr)
        {
        	System.out.println(a);
        	
        }
        System.out.println(s3.substring(3));
        System.out.println(s3.substring(0,8));
	}

        

	}


