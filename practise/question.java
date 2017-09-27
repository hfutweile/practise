package practise;
import java.util.*;
public class question {
	public static void main(String []args)
	{
		int a=5;
		/*int转换为string的三种方法*/
		String str=""+a;
		String str1=Integer.toString(a);
		String str2=String.valueOf(a);
		System.out.println(str.getClass().getName());
		System.out.println(str1.getClass().getName());
		System.out.println(str2.getClass().getName());
		/*将string类型转换为数据类型，double等类型方法类似*/
		String nums="123456";
		int numsInt=Integer.parseInt(nums);
		System.out.println(numsInt);
		/*int转换为double*/
		int num=23;
		double dou=(double)num;
		System.out.println(dou);
		int num1=(int)dou;
		System.out.println(num1);
		long log=922337203685477580L;
		int logI=(int)log;
		System.out.println(logI);
		HashMap<Integer,Integer>mp=new HashMap();
		mp.put(1, 1);
		mp.put(1, 2);
		mp.put(1, 3);
		mp.put(1, 4);
		mp.put(1, 5);
		System.out.println(mp.size());//这里hashmap的size是1
		System.out.println(mp.keySet());//keyset是1
		System.out.println(mp.values());//value只有一个是5
	}
}
