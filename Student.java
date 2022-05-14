package Comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student implements Comparable<Student> {
	private String name;
	private int id;
	private String email;
	private String city;
	
	public Student( String name, int id,  String email, String city ) {
		
	this.name= name;
	this.id= id;
	this.email= email;
	this.city= city;
		
	}
	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
//	public int getId() {
//		return this.id;
//	}
//	public String getName() {
//		return this.name;
//	}
	/*@Override
	public int compareTo(Student o) {
		if(this.getId()== o.getId()) 
			return 0;
		else if (this.getId()>o.getId()) return 1;
		}
		
		else return -1;*/
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", email=" + email + ", city=" + city + "]";
	}
	public static void main(String[] args) {
		List<Student> ssd = new ArrayList<>();
//		Student s1 = new Student("Akash",1, "akash123@gmail.com", "bhubsneswar");
//		Student s2 = new Student("Amit",2, "amit123@gmail.com", "cuttack");
//		Student s3 = new Student("Arjun",3, "arjun123@gmail.com", "raipur");
//		Student s4 = new Student("Abhinash",4, "abhinash123@gmail.com", "madhubani");
//		Student s5 = new Student("Arun",5, "arun123@gmail.com", "sitapur");
		ssd.add(new Student("Akash",1, "akash123@gmail.com", "bhubsneswar"));
		ssd.add(new Student("Amit",2, "amit123@gmail.com", "cuttack"));
		ssd.add(new Student("Arjun",3, "arjun123@gmail.com", "raipur"));
		ssd.add(new Student("Abhinash",4, "abhinash123@gmail.com", "madhubani"));
		ssd.add(new Student("Arun",5, "arun123@gmail.com", "sitapur"));
		
		
//		List<Student> st= new ArrayList<Student>();
		
//		st.add(s1);
//		st.add(s2);
//		st.add(s3);
//		st.add(s4);
//		st.add(s5);
		
		
		for(Student s :ssd) {
//			System.out.println(s.id+ "--> " + s.name + "--> "+ s.city+ "-->" + s.email);
			System.out.println(s);
			 
		}
		Collections.sort(ssd);
		System.out.println("**************************");
		for(Student s :ssd) {
//			System.out.println(s.id+ "--> " + s.name + "--> "+ s.city+ "-->" + s.email);
			System.out.println(s);
			 
		}
	}
	
//	@Override
//	public int compareTo(Student o) {
//		if(this.id> o.name)
//			return -1;
//		else if(this.name)
//		return 0;
//	}
}
