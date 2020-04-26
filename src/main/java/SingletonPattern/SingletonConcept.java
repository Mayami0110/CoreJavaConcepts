package SingletonPattern;

public class SingletonConcept {
	
	//In OOP, a singleton class is a class that can have only one object or instance of the class at a time.
	//Hos to design a singleton class
	//1. make constructor  as private
	//2. write a public static method (getInstance) that has return type object of this singleton class - lazy initialization
	
	//diff b/w Singleton and Normal class
	//for normal class we  use constructor where as for singleton class we use getInstance() method for instantiation 
	
	private static SingletonConcept singleton_instance = null;
	
	public String str;
	
	private SingletonConcept() {
		
		str = "Hey, I am using Singleton Class Pattern";
	}
	
	public static SingletonConcept getInstance() {
		if(singleton_instance==null)
		{
			singleton_instance= new SingletonConcept();
		}
		return singleton_instance;
		
	}
	
	
	public static void main(String[] args) {
		
		SingletonConcept x = new SingletonConcept();		
		SingletonConcept y = new SingletonConcept();
		SingletonConcept z = new SingletonConcept();
		
		
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toUpperCase(); //because of z value of x and y also get change as all are point to same obj
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);

		
	
	
	}
	
	
	
	
}
