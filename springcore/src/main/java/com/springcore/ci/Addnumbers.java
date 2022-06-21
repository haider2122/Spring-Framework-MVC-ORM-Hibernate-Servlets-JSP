package com.springcore.ci;

public class Addnumbers {
	int a;
	int b;
	
	public Addnumbers(String a,String b){
		
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
		System.out.println("String Constructor");
		}

	public  Addnumbers(double a,double b){
		this.a=(int)a;
		this.b=(int)b;
		
		System.out.println("Int Constructor");
	
	
	}

	public  Addnumbers(int a,int b){
		
		this.a=a;
		this.b=b;
	System.out.println("Double Constructor");
	}


	public void final_val(){
		System.out.println(this.a+this.b);
	}

}

