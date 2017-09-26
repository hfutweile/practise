package practise;

public class ch4_4 {
	public static void main(String []args)
	{
		String str=new String("hello world");
		StringBuffer s=new StringBuffer(str);
		s.append("okoooooooooooo0o");
		s.append('o');
		int length=s.length();
		int cap=s.capacity();
		System.out.println(length);
		System.out.println(cap);
		System.out.println(s);
		s=new StringBuffer("0123456789");
		s.setCharAt(0, 'a');
		s.setCharAt(1, 'b');
		System.out.println(s);
		s.insert(2, "**");
		System.out.println(s);
		s.delete(6, 8);
		System.out.println(s);
	}
}
