package LeetCode;

public class longestCommonPrefix {

	public static void main(String[] args) {
		//String[] s = {"esat","isabet"};
		System.out.println(lon(new String[]{"esat","esabet"}));
	}
 public static String lon(String[] strs) {
    if (strs.length == 0) return "";
    String prefix = strs[0];
    for (int i = 1; i < strs.length; i++)
        while (strs[i].indexOf(prefix) != 0) {
            prefix = prefix.substring(0, prefix.length() - 1);
            if (prefix.isEmpty()) return "";
        }        
    return prefix;
}
}
