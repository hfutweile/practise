package practise;

import java.util.LinkedList;

public class ch4_8 {
	private LinkedList l=new LinkedList();
	public void put(Object o){l.addFirst(o);}
	public Object get(){return l.removeLast();}
	public boolean empty(){return l.isEmpty();}
	public static void main(String []args)
	{
		ch4_8 stack=new ch4_8();
		stack.put("上海");
		stack.put("北京");
		stack.put("大连");
		System.out.println(stack.empty());
		System.out.println(stack.get());
		System.out.println(stack.get());
		System.out.println(stack.get());
		System.out.println(stack.empty());
	}
}
