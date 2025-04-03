package com.Wrapper_Classes;

public class AutoBoxing_Explicity
{
	public static void main(String[] args) 
	{
		int a=20;
		double b=2.567;
		float c=2.0f;
		Integer a1=Integer.valueOf(a);
		Double b1=Double.valueOf(b);
		Float c1=Float.valueOf(c);
		System.out.println(a+" -> Non-Premitive: "+a1);
		System.out.println(b+" -> Non-Premitive: "+b1);
		System.out.println(c+" -> Non-Premitive: "+c1);
	}

}