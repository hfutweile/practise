package practise;
import java.util.*;

public class ch4_6 {
	public static void main(String []args)
	{
		int a[]={1,2,3};
		Vector v=new Vector();
		v.add("����");
		v.add("�Ϻ�");
		v.add("����");
		v.add(a);
		for(int i=0;i<v.size();i++)
		{
			if(v.get(i).equals(a))
			{
				int b[]=a;
				for(int j=0;j<b.length;j++)
				{
					System.out.print(b[j]);
				}
				System.out.println();
			}
			else System.out.println(v.elementAt(i));
		}
			
	}
}
