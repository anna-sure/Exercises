
public class ComparePerson {
	public static void main(String[] args) {
		
				
		Person p1 = new Person("jack",20);
		Person p2 = new Person("mary",20);
		
		System.out.println(p1.compareTo(p2));
		System.out.println(p2.compareTo(p1));
		
	}

}

class Person{
	String name;
	int age;
	//构造器
	public Person(String name,int age) {
		this.name = name;
		this.age = age;
	}
	
	public boolean compareTo (Person p) {
//		if(this.name.equals(p.name) && this.age == p.age) {
//			return true;
//		} else {
//			return false;
//		}
//		
		return this.name.equals(p.name) && this.age == p.age; //精简写法
	}
	
}
