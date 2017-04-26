package momentopattern;
import java.util.*;

public class CareTaker{
   List <Momento> events= new ArrayList<Momento>();
   
   void add(Momento momento){
      events.add(momento);
   } 
 
   
   List get(int number){
      return events.get(number);
   }

}