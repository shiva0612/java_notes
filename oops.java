Oops :

if you see static in class then no object is required to access it
eg: //we have a class "Student" and in that we have static function "fee"
//to call "fee" function in "main" method we have two ways
//1. Student.fee()
//2. fee()
if not object of the class is required 
// if you simply write then it belongs to that class and a object is required to access it 

class Outer{
	int x=2;
	class Inner{
	int y=2;
	}
}
class Main{
	public static void Main(String[] args){
		Outer out = new Outer();
		Outer.Inner in = out.new Inner(); // Here, we have used "out.new Inner()" not "Outer.new Inner()"
										  // first we have to create the obj for the outer class an then use it to create the obj of the Inner class
	}
}
//-----------------------------------------------------------------------------------------------------
class Outer{
	int x=2;
	static class Inner{
	int y=2;
	}
}
class Main{
	public static void Main(String[] args){
		Outer.Inner in = new Outer.Inner(); // Here, we don't have to create the object of the outer class to 										create the object of the inner class
	}
}
//-----------------------------------------------------------------------------------------------------


Abstract:
	 - can't create an object
	 - can have both normal and abstract methods ( only have declaration )
	 - we can create object of Abstract Class using Anonymous classes
	 https://www.javatpoint.com/anonymous-inner-class
	 https://www.javatpoint.com/java-lambda-expressions
	 


abstract class Animal {
  public abstract void animalSound();
  public void sleep() {
    System.out.println("Zzz");
  }
}

Interface:
	- same as abstract but some more restrictions
	- Interface methods are by default abstract and public (cannot have normal methods where definition is also given)
	- Interface attributes are by default public, static and final
	- An interface cannot contain a constructor (as it cannot be used to create objects so thats obvious)
	- we can create object of Interface using Anonymous classes
	https://www.javatpoint.com/anonymous-inner-class
	https://www.javatpoint.com/java-lambda-expressions


Final:
	- cannot be derived 
	
//-----------------------------------------------------------------------------------------------------

Class.forName("ClassName")
https://www.youtube.com/watch?v=me9CcSXLHHc&list=PLsyeobzWxl7rU7Jz3zDRpqB-EODzBbHOI&index=5


public class New 
{
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class.forName("ClassName") // this loads the class and executes the static block
		Class.forName("ClassName").newInstance();
	}
}
class Sample
{
	// this gets executed when the class is loaded
	static
	{
		System.out.println("loaded class");
	}
	
	// simple instance block which gets executed when the instance of this class is created
	{
		System.out.println("instance created");
	}
	
}

// for other Oops concepts refer JavaTpoint


	
	


