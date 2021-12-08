package practice;

public class area {
	
	 int length;
	  int breadth;
	  
	  // constructor to initialize values
	  area(int length, int breadth) {
	    this.length = length;
	    this.breadth = breadth;
	  }

	  // method to calculate area
	  public void getArea() {
	    int area = length * breadth;
	    System.out.println("Area: " + area);
	  }
	}

	class Mai {
		public static void main(String[] args) {

	    // create object of Area
	    // pass value of length and breadth
	    area rectangle = new area(5, 6);
	    rectangle.getArea();
	  }

}
