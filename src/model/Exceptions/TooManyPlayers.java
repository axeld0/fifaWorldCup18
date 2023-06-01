package model.Exceptions;

public class TooManyPlayers extends  Exception{

   public TooManyPlayers(String info){
       super(info);
       System.out.println("You've already 23 players, mate.");
   }
}
