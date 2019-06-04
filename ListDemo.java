
public class ListDemo {
	public static void main (String[] args) {
		int [] data = {11,-7,3,42,3,0,14,3};
		ArrayIntList list1 = new ArrayIntList();
		for (int i = 0; i < data.length; i++) {
			int n = data[i];
			;
		}
		{
			int n = 0;
			list1.add(n);
		}
		System.out.print ("List elements:");
		list1.print();
		
		list1.replaceAll(3,999);
		System.out.println("List elements after replacing with 999:");
		list1.print();
		
		
		
		
		
	}

}
