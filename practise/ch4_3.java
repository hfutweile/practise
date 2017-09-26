package practise;

public class ch4_3 {
	public static void main(String []args)
	{
		char c='c';
		Character C=new Character(c);
		int a=3;
		Integer A=new Integer(a);
		String s=new String();
		s=A.toString();
		System.out.println(s);
		s=new String("hello world");
		System.out.println(s);
		System.out.println("C.charValue()="+C.charValue());
		System.out.println("C.toUpperCase('x')="+Character.toUpperCase('x'));
		System.out.println("C.toLowerCase('X')="+Character.toLowerCase('x'));
		System.out.println("C.ValueOf('A').hashCode()="+Character.valueOf('A').hashCode());
		System.out.println("C.ValueOf('B').hashCode()="+Character.valueOf('B').hashCode());
		System.out.println("C.ValueOf('C').hashCode()="+Character.valueOf('C').hashCode());
	}
}
