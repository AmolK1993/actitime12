class Demo
{
	String a="Global var" ;
	
	public void m1()

{
	String a="Local var" ;
	System.out.println(a);
	System.out.println(this.a);

}
public static void main(String[] args) 
{
	Demo b= new Demo();
	b.m1();

}

}