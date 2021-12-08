package java8;
interface EvenOdd {
	void check(int a);
}
public class checkEvenOdd {
	public static void main(String[] args) {
		// Lambda Expression
		EvenOdd x = (int a) -> {
			if(a%2==0){
				System.out.println("Number "+a+" is even.");
			}else{
				System.out.println("Number "+a+" is odd.");
			}
		};
		
		//Check numbers
		x.check(5);
		x.check(8);
	}
	

}
