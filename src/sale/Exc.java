package sale;

import java.util.InputMismatchException;

public class Exc {
   public void badCode(int a) throws Exception{
   }
   
   public void badCode(String a) throws InputMismatchException{
      throw new InputMismatchException();
   }
   
   public int bCode(String a) throws NumberFormatException{
	   int number = Integer.parseInt(a);
	   return number;
   }
}