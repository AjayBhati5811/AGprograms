package cop;
class Address
{
	String city, state, country;
	public Address(String city, String state, String country)
	{
		this.city= city;
		this.state = state;
		this.country = country;
	}
}
class Emp
{
	int id;
	String name;
	Address address;
	
	Emp(int id, String name, Address address)
	{
		this.id = id;
		this.name = name;
		this.address = address;
	}
	void display()
	{
		System.out.println(id+" "+name);
		System.out.println(address.city+" "+address.state+" "+address.country);
	}
	
	public static void main(String args[])
	{
		Address address1=new Address("gzb","UP","India");
	    Address address2=new Address("gno","UP","India");
	    Emp e1 = new Emp(111,"varun",address1);
	    Emp e2 = new Emp(112,"arun",address2);
	    e1.display();
	    e2.display();	    
	}
}