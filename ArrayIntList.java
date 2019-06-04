
public class ArrayIntList {
	private int [] elementData;
	private int size;
	//constructor 
	public ArrayIntList () {
		elementData = new int [100];
		size = 0;
	}
	//method adds element into array 
	public void add (int value) {
		elementData[size] = value;
		size++;
	}
	//Displays elements 
	public void print () {
		if (size == 0)
		{
			System.out.println ("[]");
		}
		else
		{
			System.out.print("[" + elementData[0]);
			for (int i = 1; i < size; i++) {
				System.out.print (", " + elementData[i]);
			System.out.println("]");
				}
		}
		/*Replaces all occurrences of first parameter with second
		 */
	}	
		public void replaceAll (int val, int rep)
		{
		for (int i = 0 ;i < size; i++)
				if (elementData [i]==val)
					 elementData[i] = rep;
				
		}
		
	
}

