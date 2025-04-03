package com.Wrapper_Classes;

public class AutoBoxing_ParseMethod 
{
	public static void main(String[] args)
{
	int a=20;
	double b=2.567;
	float c=2.0f;
	Integer a1=Integer.parseInt(a+"");
	Double b1=Double.parseDouble(b+"");
	Float c1=Float.parseFloat(c+"");
	System.out.println(a +" -> Non-Premitive: "+a1);
	System.out.println(b +" -> Non-Premitive: "+b1);
	System.out.println(c +" -> Non-Premitive: "+c1);
	}

}
