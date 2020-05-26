package Java50;
//Write a method that will 
//remove given character from the String
public class removeCharacter {

	public static void main(String[] args) {
		System.out.println(removeChar("sahlanartikeydeniz",'a'));
			String x = "break the distance";
			char[] c = x.toCharArray();
			System.out.println();
 	}
	

    public static String removeChar(String str, char c) {
        return str.replaceAll(Character.toString(c), "");
    }
	

}
