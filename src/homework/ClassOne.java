package homework;
/*
  * What are the different Access Modifiers?
	Write few sentences of each access modifier
 Access modifier, is used to set the access level for classes, attributes, methods and constructors.

Access Modifiers: 4 types

1.Private: The access level of a private modifier is only within the class. 
It cannot be accessed from outside the class.

2.Default: The access level of a default modifier is only within the package. 
It cannot be accessed from outside the package. If you do not specify any access level, it will be the default.

3.Protected: The access level of a protected modifier is within the package and outside the package through child class.
If you do not make the child class, it cannot be accessed from outside the package.

4.Public: The access level of a public modifier is everywhere. 
It can be accessed from within the class, outside the class, within the package and outside the package.

	Create two java classes (ClassOne.java, ClassTwo.java):
	One with the main method (ClassOne.java)
	One without the main method (ClassTwo.java)
	Create a Constructor Chain inside the ClassTwo.java
	Create object in ClassOne.java to invoke the constructor chain

 */
public class ClassOne {
	
	public static void main(String[] args) {
		
		ClassTwo two = new ClassTwo();
	
	}
		
	
}
