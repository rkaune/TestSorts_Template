/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testsorts;

public class Sorts {
 	
    
        public static void bubbleSort( int [ ] num )
        {
            int j;
            boolean flag = true;   // set flag to true to begin first pass
            int temp;   //holding variable

            while ( flag )
            {
                flag= false;    //set flag to false awaiting a possible swap
                for( j=0;  j < num.length -1;  j++ )
                {
                    if ( num[ j ] < num[j+1] )   // change to > for ascending sort
                    {
                        temp = num[ j ];                //swap elements
                        num[ j ] = num[ j+1 ];
                        num[ j+1 ] = temp;
                        flag = true;              //shows a swap occurred  
                    } 
                }
            }
        }
    
	/**
	 * Sorts an array of data from low to high
	 * pre: none
	 * post: items has been sorted from low to high
	 */
	public static void bogoSort(int[] a) {
		
            while (!isSorted(a)) {
                   shuffle(a);
            }

	}
        
        public static boolean isSorted(int[] a) {
            for (int i = 0; i < a.length - 1; i++) {
                if (a[i] > a[i + 1]) {
                    return false;
                }
        }
        return true;
}
        // To generate permutation of the array
	public static void shuffle(int[] a)
	{
		// Math.random() returns a double positive
		// value, greater than or equal to 0.0 and
		// less than 1.0.
		for (int i = 0; i < a.length; i++)
			swap(a, i, (int)(Math.random() * i));
	}

        // Swapping 2 elements
	public static void swap(int[] a, int i, int j)
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	/**
	 * Sorts an array of objects from low to high
	 * pre: none
	 * post: objects have been sorted from low to high
	 */
	public static void bogoSort(Comparable[] items) {
		
		// your sort agorithm goes here
	}

}
