package practise;

public class ch4_2 {
	public static void main(String []args)
	{
		double d=64;
		Double D=new Double(d);
		System.out.println("D.byteValue()="+D.byteValue());
		System.out.println("D.shortValue()="+D.shortValue());
		System.out.println("D.intValue="+D.intValue());
		System.out.println("D.longValue="+D.longValue());
		System.out.println("D.floatValue="+D.floatValue());
		System.out.println("D.toHexString()="+Double.toHexString(64));
		System.out.println("D.hashCode()="+D.hashCode());
		System.out.println("D.toString()="+D.toString());
		System.out.println("D.parseDouble(\"123\")="+Double.parseDouble("123"));
		System.out.println("D.parseInt(\"123\")="+Integer.parseInt("123"));
	}
}
