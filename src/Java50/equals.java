package Java50;

public class equals {

	public static void main(String[] args) {
		String x = "esat";
		String y = "barla";
		String z = "ESAT";
		String w = "esat";
		System.out.println(x==y);
		System.out.println(z==x);
		System.out.println(x==w);
		System.out.println(x.equals(w));
		System.out.println(x.equalsIgnoreCase(z));
		System.out.println(x=z);
		System.out.println(x=y);
		
		String a = new String("apple");// here 2 objects created
		//1st apple in string pool, 2nd in heap memory as a string apple
		String b = new String("apple");// now in heap memory it does not create again apple
		System.out.println(a == b);
		System.out.println(a.equals(b));
		
		String s1 = "ali";
		StringBuffer s2 = new StringBuffer(s1);
		System.out.println(s1.equals(s2));

		//string is immutable!! so its thread safe
		//why its imm --> security,
		//String is not a keyword its wrapper class
	}

}
