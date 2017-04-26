package momentopattern;
import java.util.*;

public class Originator{
   private String state;
   
   public void setState(String state){
      this.state=state;  
   }
   public String getState(){
      return state;
   }
   public void save(){
   state= getState().Momento(state);
   
   }
   public Momento getStateFromCareTaker(int number){
      return new Momento(state);
   
   }
}