package homework;

public class ClassTwo {

		public  ClassTwo(){
			this("Hello");	
			System.out.println("i am the defaut constructor");
		}
	
		public  ClassTwo(int a) {
			System.out.println("i am constructor with only int");
		}

		public  ClassTwo(String str) {
			this("Hello",10);
			System.out.println("i am constructor with only String");
		}

		public  ClassTwo(String str,int a) {
			this(10,"Hi");
			System.out.println("i am String and int");
		}
		public  ClassTwo(int a,String str) {
			this(9);
			System.out.println("i am int and String");
		}
	

}
