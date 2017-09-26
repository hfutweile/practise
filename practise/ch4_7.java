package practise;
import java.util.*;
public class ch4_7 {
	private LinkedList l=new LinkedList();
	public void push(Object o){l.addFirst(o);}
	public Object pop(){return l.removeFirst();}
	public Object peek(){return l.getFirst();}
	public boolean empty(){return l.isEmpty();}
	public static void main(String []args)
	{
		ch4_7 stack=new ch4_7();
		stack.push("上海");
		stack.push("北京");
		stack.push("大连");
		System.out.println(stack.empty());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.empty());
	}
}
