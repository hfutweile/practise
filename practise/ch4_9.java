package practise;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Collection;
import java.util.Collections;;
public class ch4_9 {
	static final int N=50000;
	static Integer al[]=new Integer[N];
	static {for(int i=0;i<N;i++)al[i]=new Integer(i);}
	static List list=Arrays.asList(al);
	static long getTime(List lst)
	{
		long start=System.currentTimeMillis();
		for(int i=0;i<N;i++)
		{
			
			int index=Collections.binarySearch(lst,list.get(i) );
		}
		return System.currentTimeMillis()-start;
	}
	public static void main(String []args)
	{
		System.out.println("ArrayListºÄÊ±:"+getTime(new ArrayList(list))+"ºÁÃë");
		System.out.println("LinkedListºÄÊ±:"+getTime(new LinkedList(list))+"ºÁÃë");
	}
}
