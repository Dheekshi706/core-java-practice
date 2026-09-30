import java.util.*;
public class LL{
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<String>();
		
			list.addFirst("a");
			list.addFirst("ab");
			list.addFirst("abd");
			System.out.println(list);
			list.addLast("abcd");
			System.out.println(list);
			System.out.println(list.remove(3));
			for(int i=0;i<list.size();i++){
				if(list.get(i)=="ab")
				{
					list.remove(i);
				}
					
			
				System.out.print(list.get(i)+"->");
			}
			System.out.println("null");
			
		
	}
}