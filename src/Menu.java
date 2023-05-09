
public class Menu {

	String name;
	   int phonenumber;
	   String hamburger;
	   String juice;
	   
	   public Menu() {
	   }
	   
	   public Menu(String name, int phonenumber) {
	      this.name = name;
	      this.phonenumber = phonenumber;
	   }
	   
	   public Menu(String name, int phonenumber, String hamburger,String juice) {
	      this.name = name;
	      this.phonenumber = phonenumber;
	      this.hamburger = hamburger;
	      this.juice = juice;
	   }
	   
	   public void printInfo() {
	      System.out.println("name: " + name + " phonenumber: " + phonenumber + " hamburger: " + hamburger + "juice: " + juice);
	   }

	
}
