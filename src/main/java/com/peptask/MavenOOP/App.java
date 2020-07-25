package com.peptask.MavenOOP;

/**
 * Hello world!
 *
 */import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;
 import java.util.*;
 abstract class Gi
 {
 	String na;
 	Integer qu;
 	Integer we;
 	abstract int to();
 }

 class Ch extends Gi
 {
 	Ch(String na,int qu,int we)
 	{
 		this.na=na;
 		this.qu =qu;
 		this.we = we;
 	}
 	
 	int to()
 	{
 		return this.qu*this.we;
 	}
 }

 class Sw extends Gi
 {
 	Sw(String na,int qu,int we)
 	{
 		this.na=na;
 		this.qu =qu;
 		this.we = we;
 	}
 	int to()
 	{
 		return this.qu*this.we;
 	}
 }

 class Ca extends Gi
 {
 	Ca(String na,int qu,int we)
 	{
 		this.na=na;
 		this.qu =qu;
 		this.we = we;
 	}
 	int to()
 	{
 		return this.qu*this.we;
 	}
 }
public class App 
{
	static void name_so(Vector<Gi> child1,Vector<Gi> child2)
	{
		Vector<Ch> v=new Vector<Ch>();
		for(Gi g : child1)
		{
			if(g instanceof Ch)
			{
				Ch c=(Ch) g;
				v.add(c);
			}
		}
		Comparator<Ch> byname=new Comparator<Ch>() {
			public int compare(Ch c1, Ch c2) {
				return c1.na.compareTo(c2.na);
			}
		};
		Collections.sort(v,byname);
		System.out.println("\tFirst gift box : ");
		for(Ch c:v)
			System.out.println("->"+c.na);
		v.clear();
		for(Gi g : child2)
		{
			if(g instanceof Ch)
			{
				Ch c=(Ch) g;
				v.add(c);
			}
		}
		Collections.sort(v,byname);
		System.out.println("\n\tSecond gift box : ");
		for(Ch c:v)
			System.out.println("->"+c.na);
	}
	
	static void quantity_sort(Vector<Gi> child1,Vector<Gi> child2)
	{
		Vector<Ch> v=new Vector<Ch>();
		for(Gi g : child1)
		{
			if(g instanceof Ch)
			{
				Ch c=(Ch) g;
				v.add(c);
			}
		}
		Comparator<Ch> by=new Comparator<Ch>() {
			public int compare(Ch c1, Ch c2) {
				return c1.qu.compareTo(c2.qu);
			}
		};
		Collections.sort(v,by);
		System.out.println("\tFirst gift box : ");
		for(Ch c:v)
			System.out.println("->"+c.na+":"+c.qu);
		v.clear();
		for(Gi g : child2)
		{
			if(g instanceof Ch)
			{
				Ch c=(Ch) g;
				v.add(c);
			}
		}
		Collections.sort(v,by);
		System.out.println("\n\tSecond gift box : ");
		for(Ch c:v)
			System.out.println("->"+c.na+":"+c.qu);
	}
	static void weight_sort(Vector<Gi> child1,Vector<Gi> child2)
	{
		Vector<Ch> v=new Vector<Ch>();
		for(Gi g : child1)
		{
			if(g instanceof Ch)
			{
				Ch c=(Ch) g;
				v.add(c);
			}
		}
		Comparator<Ch> byweight=new Comparator<Ch>() {
			public int compare(Ch c1, Ch c2) {
				return c1.we.compareTo(c2.we);
			}
		};
		Collections.sort(v,byweight);
		System.out.println("\nFirst gift box : ");
		for(Ch c:v)
			System.out.println("->"+c.na+" : "+c.we+" gms");
		v.clear();
		for(Gi g : child2)
		{
			if(g instanceof Ch)
			{
				Ch c=(Ch) g;
				v.add(c);
			}
		}
		Collections.sort(v,byweight);
		System.out.println("\n\tSecond gift box : ");
		for(Ch c:v)
			System.out.println("->"+c.na+" : "+c.we+" gms");
	}
	
	static void search(String cn,Vector<Gi> child1,Vector<Gi> child2)
	{
		boolean c1=false,c2=false;
		for(Gi g : child1)
		{
			if(g instanceof Ca)
			{
				Ca c=(Ca) g;
				if(c.na.equals(cn))
				{
					c1=true;
					break;
				}
			}
		}
		for(Gi g : child2)
		{
			if(g instanceof Ca)
			{
				Ca c=(Ca) g;
				if(c.na.equals(cn))
				{
					c2=true;
					break;
				}
			}
		}
		if(c1==false && c2==false)
			System.out.println(cn+" not found in either of boxes ");
		else
		{
			if(c1)
				System.out.println(cn+" found in gift box 1");
			if(c2)
				System.out.println(cn+" found in gift box 2");
		}
	}
	
    public static void main( String[] args ) throws IOException
    {
    	Vector<Gi> child1=new Vector<Gi>();
    	Vector<Gi> child2=new Vector<Gi>();
    	child1.add(new Ch("Dairy milk",2,15));
    	child1.add(new Ch("Eclairs",10,2));
    	child1.add(new Ch("Five star",5,20));
    	child1.add(new Ch("Munch",1,10));
    	child1.add(new Sw("gulab jamun",1,250));
    	child1.add(new Sw("ladoo",1,150));
    	child1.add(new Sw("jalebi",1,200));
    	child1.add(new Ca("Friut candy",20,2));
    	child1.add(new Ca("Mangobite",10,2));
    	child1.add(new Ca("Kopiko",5,2));
    	
    	child2.add(new Ch("Five star",10,20));
    	child2.add(new Ch("Dairy milk silk",1,100));
    	child2.add(new Ch("Dark chocolate",1,200));
    	child2.add(new Sw("Kaju barfi",2,500));
    	child2.add(new Sw("Motichoor ladoo",1,50));
    	child2.add(new Ca("Alpenlibe",20,2));
    	child2.add(new Ca("Lollipop",10,2));
    	child2.add(new Ca("Skittles",1,20));
    	child2.add(new Ca("Gems",1,20));
    	child2.add(new Ca("Kopiko",5,2));
    	
    	System.out.println("The contents of gift boxes of two children are :- ");
    	System.out.println("1st gift box");
    	for(Gi g:child1)
    	{
    		System.out.println("\t"+g.na);
    	}
    	
    	System.out.println("2nd gift box");
    	for(Gi g:child2)
    	{
    		System.out.println("\t"+g.na);
    	}
    	
    	System.out.print("\nTotal weight of the Gift Boxes (in grams) : ");
    	int total_weight=0;
    	for(Gi g:child1)
    		total_weight += g.to();
    	for(Gi g:child2)
    		total_weight += g.to();
    	System.out.println(total_weight+"\n");
    	
    	
    	int de=0;
    	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
    	while(de!=4)
    	{
	    	System.out.println("\nOptions for sorting the chocolates of children :-");
	    	System.out.println("1) by name");
	    	System.out.println("2) by quantity");
	    	System.out.println("3) by weight");
	    	System.out.println("4) quit menu");
	    	de=Integer.parseInt(br.readLine());
	    	switch(de)
	    	{
	    	case 1: System.out.println("Sorted according to names : ");
	    			name_so(child1,child2);
	    			break;
	    	case 2: System.out.println("Sorted according to quantity : ");
	    			quantity_sort(child1,child2);
	    			break;
	    	case 3: System.out.println("Sorted according to weight : ");
	    			weight_sort(child1,child2);
	    			break;
	    	case 4:break;
	    	default:System.out.println("Invalid option !");
	    	}
    	}
    	String s="yes";
    	while(!s.toLowerCase().equals("no"))
    	{
	    	System.out.println("Enter the candy's name you want to search in gift Boxes : ");
	    	String cn=br.readLine();
	    	search(cn,child1,child2);
	    	System.out.println("Do you want to continue to search candies( type yes/no)");
	    	s=br.readLine();
    	}
    }
}
