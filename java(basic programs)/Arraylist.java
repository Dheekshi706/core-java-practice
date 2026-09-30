import java.util.*;

 class Arraylist{
	public static void main(String[] args)
	{
		ArrayList<Integer> list=new ArrayList<Integer>();
		list.add(0);
		list.add(1);
		list.add(2);
		System.out.println(list);
		list.set(1,5);
		
		System.out.println(list.get(1));
		list.remove(0);
		list.add(2,7);
		Collections.sort(list);
		System.out.println(list);
		
	}
}