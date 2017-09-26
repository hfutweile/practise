package practise;

public class ch4_1 {
	public static void main(String []args)
	{
		ABC a=new ABC();
		System.out.println("a.getClass()="+a.getClass());
		System.out.println("a.getClass().getName()="+a.getClass().getName());
		System.out.println("a.toString()="+a.toString());
		System.out.println("a.toString.chatAt(0)"+a.toString().charAt(0));
		System.out.println("a.toString.chatAt(1)"+a.toString().charAt(1));
		System.out.println("a.toString.chatAt(2)"+a.toString().charAt(2));
		System.out.println("a.hashCode()="+a.hashCode());
		System.out.println("a.equals(a)="+a.equals(a));
	}
}
class ABC{
	
}