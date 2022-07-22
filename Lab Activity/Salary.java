package Neha;

import java.util.*;
import java.util.Scanner;


public class Salary {
	
public static void main (String args[])

{
	float hra,da,tsalary,gross;
	
	System.out.println("Enter the basic salary =");
	Scanner sc = new Scanner(System.in);
	
	int bsalary=sc.nextInt();
	
	if(bsalary>500)
	{
		hra=500;
		da=90;
        tsalary=hra*da*bsalary;
        System.out.println("total salary:"+tsalary);
             
    }
	else
	{
		hra=500;
		da=90;
		tsalary=hra*da*bsalary;
	 System.out.println("total salary:"+tsalary);
	        
	        
	}
	gross=bsalary+hra+da;
	System.out.println("gross salary:"+gross);
	
}
	

}
