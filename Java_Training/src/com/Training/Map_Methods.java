package com.Training;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Map_Methods {
public static void main(String[] args) {
Map<Integer,Object> ref = new HashMap<Integer,Object>();
         ref.put(1,10);
         ref.put(2,20);
         ref.put(3,30);
         ref.put(4,40);
         ref.put(5,50);
     System.out.println(ref);
   int size = ref.size();
     System.out.println(size);
   Object object = ref.get(4);  
     System.out.println(object);
   Set<Integer> keySet = ref.keySet();  
     System.out.println(keySet);
   Collection<Object> values = ref.values();
     System.out.println(values);
   boolean containsKey = ref.containsKey(6); 
     System.out.println(containsKey);
   boolean containsValue = ref.containsValue(40);
     System.out.println(containsValue);
   Set<Entry<Integer, Object>> entrySet = ref.entrySet(); 
   System.out.println(entrySet);
   for (Iterator iterator = entrySet.iterator(); iterator.hasNext();) {
	Entry<Integer, Object> entry = (Entry<Integer, Object>) iterator.next();
	System.out.println(entry);
}
     
}
}
