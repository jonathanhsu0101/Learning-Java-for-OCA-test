package lesson2_1;

public class Demo5 {
	public static void main(String[] args) {
		JavaCourse c = new JavaCourse("java");
		c.print();
	}
}
class Course{
	String name;
	Course(String name){
		this.name  = name;
	}
	void print() {
		System.out.println(name);
	}
}
class JavaCourse extends Course{
	JavaCourse(String name){
		super(name);
	}
	void print() {
		System.out.println("我贏java課程");
	}
}