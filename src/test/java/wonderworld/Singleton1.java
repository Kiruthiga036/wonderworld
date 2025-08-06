package wonderworld;

public class Singleton1 {
	public static Singleton1 b=null;
	private Singleton1() {}
	public static Singleton1 method() { 
		if(b==null) {
			b= new Singleton1();
		}
		return b;
	}
       public static void main(String[] args) {
    	   Singleton1 ss=method();
    	   Singleton1 ss1=method();
    	   Singleton1 ss2=method();
    	   Singleton1 ss3=method();
    	   
    	   System.out.println(System.identityHashCode(ss));
    	   System.out.println(System.identityHashCode(ss1));
    	   System.out.println(System.identityHashCode(ss2));
    	   System.out.println(System.identityHashCode(ss3));
    	   
    	   
    	   
       }
}
