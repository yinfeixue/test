package test;



import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import org.junit.Test;
import org.junit.internal.Throwables;

import test2.*;
public class Test1 {
	@Test
    public void test(){
		String a ="ff";
		System.out.println();
	}
	@Test
    public void test1(){
       // int sum=8;
//		for (int i = 0; i < 10; i++) {
//			 
//			for(int j=1;j<=i;j++){
//				 sum=2*sum+sum*10;
//			 }
//			
//			
//		}
//	1286608608
        long sum=0;
        long t=1;
        for(int i=0;i<10;i++) {
        	sum+=t;
        	t=t*10+1;
        }
	System.out.println(8*sum+" "+Integer.MAX_VALUE);
    	
    }
	@Test
    public void test2(){
		String s="aa";
    	switch (s) {
		case "aa":
			System.out.println(1);
			break;
		case "bb":
			System.out.println(2);
			
			break;

		default:
			break;
		}
    }
	@Test
    public void test3(){
		Object c=(String)"Striuttyyu";
		System.out.println(c instanceof StringBuffer);
    	
    }
	
	@Test
    public void test4(){
		Object c=(String)"Striuttyyu";
		System.out.println(c instanceof StringBuffer);
    	
    }
	
	@Test
    public void test5(){
		
		System.out.println(new Person("xue",1).getName());
	}
	
	@Test
    public void test6(){
		Girl yin=new Girl("yin",1) ;
		System.out.println(yin.getName()+" "+yin.getHair());
	}
	
	@Test
    public void test7(){
//		List<String> list=new ArrayList<String>();
//		list.add("Good");
//		list =new LinkedList<String>();
//		list.size();
//		System.out.println(5/0);
		try {
		String string="Hello";
		if(string.equals("Hello")) {
			throw new Exception("NO HELLO!");		}

//		System.out.println(string.trim());
		}catch (Exception e) {
			// TODO: handle exception
//			System.out.println(e.getMessage()) ;
			e.printStackTrace();
			
		}
		System.out.println("ddd");
	}
	
	public void t  ()
			throws Exception
	{
		String s=null;
		System.out.println(s.trim());
		System.out.println("Hello");
		
	}
	
	@Test
	public void test8() {
		try {
		t();
		}
		catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	
	@Test
	public void test9() {
		HashSet<String> s=new HashSet<String>();
		s.add("43");
		s.add("43");
		s.add("53");
		s.add("23");
		s.add("323");
		s.add("23243");
		s.add("299");
//		for(String ss:s) {
//			System.out.println(ss);
//		}
		Object[] o=s.toArray();
		for(int i=0;i<s.size();i++) {
			System.out.println(o[i]);
		}
		Math.random();
		
	}
	
	@Test
	public void test10() {
	   A fu = new A();
	   fu.setA(112);
	   fu.setB(126);
	  System.out.println(fu.max()); 
	   B fub = new B(fu);
	   fub.display();
	}
	class A{
		int a;
		int b;
		public int max() { 
		 int ai=a;
		 int bi=b;
			int r=0;
			int t=0;
			do {
				t=ai;
				ai=ai>bi?ai:bi;
				bi=t>bi?bi:t;
				r=ai%bi;
				ai=bi;
				bi=r;
			}while(r!=0);
			
			return ai;
		}
		public int getA() {
			return a;
		}
		public void setA(int a) {
			this.a = a;
		}
		public int getB() {
			return b;
		}
		public void setB(int b) {
			this.b = b;
		}
//		public void dis() {
//			System.out.println(max(a,b));
//		}
	}
	class B{
		A a;
		B(A a){
			this.a=a;
		}
		public void display() {
			int ji=a.getA()*a.getB();
			System.out.println(ji/a.max());
		}
	}
	
	
	@Test
	public void test11() {
//		Exception e=new Exception();

		Scanner s=new Scanner(System.in);
		try {
			int i=s.nextInt();
			if(i==20)
				throw new MyException(20);
			
			
		}catch(Exception e1){
			e1.printStackTrace();
		}
	}
	class MyException extends Exception {
		int i;
		MyException(int i){
			this.i=i;
		}
		@Override
		public
		void printStackTrace(){
			System.out.println("CAN NOT BE 20!");
		}
	}
    @Test
    public void test12() {
    	String tom = "I am a good cat";
    	System.out.println(tom.indexOf("a", 7));
    	System.out.println(tom.indexOf("good", 2));
    }
    @Test
    public void test13() {
        StringBuffer tom = new StringBuffer();
        tom.append("I am tom");
  
    	System.out.println(tom.charAt(3));
    	tom.setCharAt(5, 'n');
    	System.out.println(tom);
    }
}
