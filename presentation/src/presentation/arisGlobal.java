package presentation;
import java.util.ArrayList;

public class arisGlobal {
	
	int n=4;
	 
    class Data {
 
        int roll;
        String name;
        int marks;
        long phone;
 
        Data(int roll, String name, int marks, long phone)
        {
 
            this.roll = roll;
            this.name = name;
            this.marks = marks;
            this.phone = phone;
        }
    }
 
    public static void main(String args[])
    {
 
        int roll[] = { 1, 2, 3, 4 };
        String name[] = { "Sanjay", "Akshay", "Deepika", "Ranbir" };
        int marks[] = { 100, 99, 93, 94 };
        long phone[] = { 8762357381L, 8762357382L,8762357383L, 8762357384L };
 
        arisGlobal ag1 = new arisGlobal();
 
        ag1.addValues(roll, name, marks, phone);
    }
 
    public void addValues(int roll[], String name[],int marks[], long phone[])
    {
       
        ArrayList<Data> list = new ArrayList<>();
 
        for (int i = 0; i < n; i++) {
          
            list.add(new Data(roll[i], name[i], marks[i],phone[i]));
        }
 
        printValues(list);
    }
    public void printValues(ArrayList<Data> list)
    {
 
        for (int i = 0; i < n; i++) 
        {
        	
        	Data data = list.get(i);
            System.out.println(data.roll + " " + data.name+ " " + data.marks + " "+ data.phone);
        }
    }

}
