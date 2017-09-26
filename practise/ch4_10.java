package practise;
import java.util.List;
import java.util.LinkedList;
import java.util.ArrayList;
public class ch4_10 {
	static final int N=50000;
	static long addTime(List lst)
	{
		long start=System.currentTimeMillis();
		Object o=new Object();
		for(int i=0;i<N;i++)
		{
			lst.add(0,o);
		}
		return System.currentTimeMillis()-start;
	}
	public static void main(String []args)
	{
		System.out.println("LinkedList插入时间:"+addTime(new LinkedList()));
		System.out.println("ArrayList插入时间:"+addTime(new ArrayList()));
	}
}
