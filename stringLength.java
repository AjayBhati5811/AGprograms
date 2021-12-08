package java8;
interface string{
	abstract String hello(String name); 
}

public class stringLength {
	public static void main(String[] args) {
		string s1=(String n) -> "Hello\t" + n + "\tGood Morning";
		String s = s1.hello("java");
		System.out.println(s);
		System.out.println(s.length());
	}
                       
}
