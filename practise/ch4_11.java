package practise;
import java.util.HashMap;
import java.util.Iterator;
public class ch4_11 {
	public static void main(String []args)
	{
		HashMap map=new HashMap();
		map.put("s20099", 80);
		map.put("s20034", 90);
		map.put("s20015", 90);
		map.put("s20036",70);
		map.put("s20077", 70);
		map.put("s20088", 60);
		map.put("s20019", 100);
		System.out.println("keyset="+map.keySet());
		System.out.println("values="+map.values());
		System.out.println("key=s20034 value="+map.get("s20034"));
		System.out.println("values contains 100 is "+map.containsValue(100));
		System.out.println("Keyset contains s20023 is "+map.containsKey("s20023"));
		System.out.println("Keyset contains s20021 is "+map.containsKey("s20021"));
		int sum=0;
		int size=map.size();
		for(Iterator iterator=map.keySet().iterator();iterator.hasNext();)
		{
			sum=sum+map.get(iterator.next()).hashCode();
		}
		System.out.println("Totalscore="+sum);
		System.out.println("students\'s number="+size);
		System.out.println("Average="+sum/(double)size);
	}
}
