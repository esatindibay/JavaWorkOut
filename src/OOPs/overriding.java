package OOPs;

class A{
	void type(){
		System.out.println("this is a");
	}
}
class B extends A{
	void type(){
		System.out.println("this is b");
	}
}
class C extends A{
	void type(){
		System.out.println("this is c");
	}
}
public class overriding {

	public static void main(String[] args) {
	A x = new C();
	x.type();

	}

}
