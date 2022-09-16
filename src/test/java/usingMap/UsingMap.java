package usingMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class UsingMap {

	public static void main(String[] args) {
	 HashMap obj=new HashMap();
	 obj.put("sheereesh", 1000);
	 obj.put("ramesh", 9000);
	 obj.put("mohan", 6000);
	 System.out.println(obj);
	System.out.println(obj.put("sheereesh", 1000000)); 
Set s=obj.keySet();
System.out.println(s);
Collection c=obj.values();
System.out.println(c);
	}

	
}
