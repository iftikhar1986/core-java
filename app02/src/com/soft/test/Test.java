//Program to find Identities of Object , Hash code and Object reference.
package com.soft.test;

class A{
	
}

public class Test {

	public static void main(String[] args) {
			A a = new A();
			int hashCode = a.hashCode();
			System.out.println("Hash Code : "+hashCode);
			
			String ref = a.toString();
			System.out.println("Obj Ref   : "+ref);
			
	}

}
