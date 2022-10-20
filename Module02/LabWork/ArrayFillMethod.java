   import java.util.*;

    class ArrayFillMethod

    {

        public static void main(String args[]) 

        {

            int array[] = new int [5];

            for (int i = 5; i > 0; i--)

                array[5-i] = i;
		  //index: 0 1 2 3 4	   
				// 5 4 3 2 1

            Arrays.fill(array, 1, 4, 8);
			
			// fill the index 1 to 3  by 8

            for (int i = 0; i < 5 ; i++)

                System.out.print(array[i]);
		 //index: 0 1 2 3 4
			   // 5 8 8 8 1
        }

    }
	
	// output:   58881