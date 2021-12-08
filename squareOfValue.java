package java8;
interface printNumber{
	public void print(int num);
}

public class squareOfValue {
	public static void main(String[] args) {
		printNumber p=n->
		System.out.println("Square is: "+ n*n);
		p.print(5);;
	}
}
