import java.lang.*;
import java.util.Arrays;
import java.util.*;

class PrintThis {

 
   
   public PrintThis(Map<?,?> mp) {
    
      Set set = mp.entrySet();
      Iterator it = set.iterator();
      
      while(it.hasNext()) {
         Map.Entry me = (Map.Entry)it.next();
         System.out.print("Key is: "+me.getKey() + " & ");
         System.out.println("Value is: "+me.getValue());
      }
   
      
   }
 
    
   public PrintThis(ArrayList <?> ar) {
   
   
   
   }




}