public class Palindrome{
	public static void main(String args[]){
		String a = "abcba";
		System.out.println(a.length());
		for (int i=a.length()-1; i >= 0; i--){
			String temp = a[i];
			System.out.println(i);
		}
	}
}
