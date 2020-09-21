/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casestudy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;
/* A stream is not a data structure, alternatively it takes input from the Collections, Arrays or I/O channels.
A Streams does not change the original data structure, they only provide the result as the pipelined methods.*/

public class CaseStudy {

     static <T> void getEmployees(List<T> lst){
        Stream st= lst.stream();
        st.forEach(employee -> System.out.println(employee));
        
    }
     
     static <K,V> Stream<Map.Entry<K,V>> MapEmployees(HashMap<K,V> emp){
//         Set<Map.Entry<K,V>> entries = emp.entrySet();
//         Stream<Map.Entry<K, V>> entriesStream = entries.stream();
//         return entriesStream;
            Set<K> keySet = emp.keySet();
            Collection<V> values = emp.values();
            Stream<V> valuesStream = values.stream();
            Stream<K> keysStream = keySet.stream();

         
         return emp.entrySet().stream();
     }
    public static void main(String[] args) {
        // TODO code application logic here
        
        List<String> emp= new ArrayList<>();
        emp.add("a");
        emp.add("d");
        emp.add("c");
        emp.add("b");
        emp.add("e");
        getEmployees(emp);
        
        HashMap<Integer,String> empmap= new HashMap<>();
        empmap.put(1, "a");
        empmap.put(2,"b");
        empmap.put(3,"c");
        empmap.put(4,"d");
        empmap.put(5,"e");
        
        
        Stream<Map.Entry<Integer,String>> empstream= MapEmployees(empmap);
        System.out.println("Stream: " + Arrays.toString(empstream.toArray())); 
        
        
    }
    
}
