package javapacket;

public class CustomerClass {
//Create a customer class (name, sex, address, fee), create four objects - regina, Fidelis, Laxmi and Usman and 
//fill the details to these objects and print the results

		String name;
		String sex;
		String address;
		int fee;
		
		public static void main(String[] args) {
			
			CustomerClass obj= new CustomerClass();
			obj.name="regina";
			obj.sex= "Male";
			obj.address="Virgania";
			obj.fee= 2000;
			
			System.out.println("Name of customer1 "+obj.name);
			System.out.println("Sex of customer1 "+obj.sex);
			System.out.println("Address of customer1 "+obj.address);
			System.out.println("Fee of customer1 "+obj.fee);
			
			CustomerClass obj2= new CustomerClass();
			obj2.name="Fidelis";
			obj2.sex= "Male";
			obj2.address="Virgania";
			obj2.fee= 4000;
			
			System.out.println("Name of customer2 "+obj2.name);
			System.out.println("Sex of customer2 "+obj2.sex);
			System.out.println("Address of customer2 "+obj2.address);
			System.out.println("Fee of customer2 "+obj2.fee);
			
			CustomerClass obj3= new CustomerClass();
			obj3.name="Laxmi";
			obj3.sex= "Female";
			obj3.address="Virgania";
			obj3.fee= 6000;
			
			System.out.println("Name of customer3 "+obj3.name);
			System.out.println("Sex of customer3 "+obj3.sex);
			System.out.println("Address of customer3 "+obj3.address);
			System.out.println("Fee of customer3 "+obj3.fee);
			
			CustomerClass obj4= new CustomerClass();
			obj4.name="Usman";
			obj4.sex= "Male";
			obj4.address="Virgania";
			obj4.fee= 8000;
			
			System.out.println("Name of customer4 "+obj4.name);
			System.out.println("Sex of customer4 "+obj4.sex);
			System.out.println("Address of customer4 "+obj4.address);
			System.out.println("Fee of customer4 "+obj4.fee);

		}

	}


