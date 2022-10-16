class WrapperDemo
{
	public static void main(String args[])
	{
		Integer i1 = new Integer(567);
		Integer i2 = new Integer("567");
		Integer i3 = Integer.valueOf("555");
		Integer i4 = Integer.parseInt("590");
		System.out.println(i1+"\t"+i2+"\t"+i3+"\t"+i4);
		
		String s1 = i1.toString();
		System.out.println("s1 ="+s1);
		
		int res1 = i1.compareTo(i2);   
		System.out.println("i1=i2: "+res1);    //result 0
		int res2 = i1.compareTo(i3);
		System.out.println("i1>i3: "+res2);      //result 1
		int res3 = i1.compareTo(i4);
		System.out.println("i1<i4: "+res3);       //result -1
		
		boolean res4 = i1.equals(i2);           //result: True
		System.out.println("Result of i1.equals(i2): "+res4);
		System.out.println("Result of i1.equals(i3): "+(i1.equals(i3))); //result false
		
		Integer i5 = new Integer("258");
		//integer ip = i5.intValue();  //Returns int primitive from Integer object
		byte bp = i5.byteValue();
		System.out.println("primitive byte value of (i5)258: "+bp);    //result 2
		double dp = i5.doubleValue();
		System.out.println("primitive double value of (i5)258: "+dp);   //result 258.0
		
		
		//Character ch = new Character('A');  
		
		
		
	}
}
