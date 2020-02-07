package com.samhitha;
import java.util.*;
import java.lang.System;
public	class newyear
{public static void main(String args[])
  {try(Scanner scan=new Scanner(System.in)){
  System.out.println("enter the number of choices :");
  int n=scan.nextInt();
  System.out.println("enter choices where for chocolates 1.dairymilk 2.perk 3.munch and sweets 4.gulabjamun 5. gilebi 6.puttarekulu:");
  int arr[]=new int[n];
  for(int i=0;i<n;i++)
  {
  arr[i]=scan.nextInt();
  }
 newyear year=new newyear();
  int k=year.totalweight(arr);
  System.out.println("the total weight of the choclates in the gift"+k);
  }
  finally {
	  System.out.println("inappropriate data");
  }
}
int totalweight(int arr[ ])
{
int s=0;
for(int i=0;i<arr.length;i++)
{
if(arr[i]<=3){
s=s+arr[i];}}
return s;
}
}
class chocolates
{
	   public void cholates()
	   {
	      System.out.println("choclates are:");
	   }
	}
	class diarymilk extends chocolates
	{
	   public void milk()
	   {
	      System.out.println("dairy milk value is :1");
	   }
	}
	class perk extends chocolates
	{
	  public void prk()
	  {
	     System.out.println("perk value is :2");
	  }
	}
	class munch extends chocolates
	{
	  public void mun()
	  {
	     System.out.println("mun value is :3");
	  }
	}
	class sweets
	{
	   public void sweet()
	   {
	      System.out.println("sweets are:");
	   }
	}
	class gulabjamun extends sweets
	{
	   public void gulab()
	   {
	      System.out.println("gulab value is :4");
	   }
	}
	class gilebi extends sweets
	{
	  public void gil()
	  {
	     System.out.println("gilebi value is :5");
	  }
	}
	class puttarekulu extends sweets
	{
	  public void puta()
	  {
	     System.out.println("puttareku value is :6");
	  }
	}

