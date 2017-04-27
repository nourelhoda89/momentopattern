package momentopattern;
import java.util.*;

public class CareTaker{
   List <Message> events= new ArrayList<Message>();
   
   void add(Message state){
      events.add(state);
   } 
 
   
   List get(int number){
      return events.get(number);
   }

}