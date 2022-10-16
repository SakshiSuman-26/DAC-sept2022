class String1
{
	public static void main(String args[])
	{
		System.out.println("=========================");
		String s1 ="welcome";
	
		char chr[] = new char[10];
		s1.getChars(2,5,chr,7); // it will occupy 7 spaces more than 7 error out of bound exception
		for(int i=0;i<chr.length;i++)
		{
			System.out.print(chr[i]);
		}
		System.out.println();
		System.out.println("=========================");
		
		byte [] b = s1.getBytes();  // it will print ASCII of each char
		for( byte x :b)  // for each loop
		{
			System.out.println(x);
		}
		
		System.out.println("=========================");
		
		String s2 = "WElcoMe";
		String s3 = "welComE";
		
		//equals consider the case also uppercase and lowercase
		//equalsIgnoreCase  do not consider case
		
		System.out.println("compare with case: "+s2.equals(s3)); //false
		System.out.println("compare with ignore case: "+s2.equalsIgnoreCase(s3)); //true
		
		System.out.println(s2.equalsIgnoreCase("Welcome"));  //true
		
		System.out.println("=========================");
		
		char charr[] = s1.toCharArray(); //print each char of string
		for( char x: charr)
		{
			System.out.println(x);
		}
		System.out.println("=========================");
		
		String s4 = "ABACDD";  //lexicographically smaller
		String s5 = "ABAACC";   //greater
		
		System.out.println(s4.compareTo(s5)); //result :2 = ASCII(C-A)
		
		System.out.println("=========SUBSTRING================");
		
	    System.out.println("begin with 3rd index: "+s1.substring(3));
		System.out.println("begin with 3rd and end at 5th index: "+s1.substring(2,5));
		System.out.println();
		
		System.out.println("=========Concatenate strings================");
		
		String s6 = "Hello ";
		s6 = s6.concat("Friends ").concat("welcome");
		System.out.println(s6);
		System.out.println();
		 
		System.out.println("===========Replace String==============");
		
		String s7 = new String("hello friends");
		System.out.println("before:[hello friends] after: "+s7.replaceFirst("hello","welcome"));
		System.out.println();
		
		//replaceAll("in","net");
		
		
		String s8 = "welcome";
		int res = s8.indexOf('e');  //return type is int
		System.out.println(res);   //return 1
		System.out.println(s8.indexOf("com"));  //return 3 found substring at 3rd index
		System.out.println(s8.indexOf("cme"));  //return -1 no such substring
		System.out.println(); 
		
		// bool type: s1.contains("come")  true
		// int type:  s1.indexOf("come")  3
		// bool : s1.isEmpty
		
		String s9 ="";
		String s10="      ";
		System.out.println("output of s9: "+s9.isEmpty());  //true: is empty
		System.out.println("output of s10: "+s10.isEmpty()); // false: not empty bcoz space is also a character
		System.out.println();
		
		//String.join
		System.out.println(String.join("/","13","10","2022"));   //  13/10/2022
		System.out.println(String.join("--","my","name","is","sakshi"));  //my--name--is--sakshi
		System.out.println();
		
		// String split
		//String s11= new String("13/10/2022");
		//String
		
		
	}
}




/*OUTPUT  lco 
119
101
108
99
111
109
101

compare with case: false
compare with ignore case: true
true

w
e
l
c
o
m
e


  
 output  lco ===  started from 2 and exluded from 5
         ( excluded char at 0,1  and 5,6)
		   w e l c o m e
            0 1 2 3 4 5 6 
  */

//print the occurences of each character in a given string