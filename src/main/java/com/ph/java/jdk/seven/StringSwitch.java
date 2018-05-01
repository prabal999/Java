package com.ph.java.jdk.seven;

/**
 * Switch statements work either with primitive types or enumerated types. Java
 * 7 introduced another type that we can use in Switch statements: the String
 * type.
 * 
 * @author Prabal
 *
 */
public class StringSwitch {

	public static void main(String[] args) {
		StringSwitch ss = new StringSwitch();
		ss.processStringtype("PENDING");
		ss.processStringtype("new"); // caseSensitive
		Object test = "Test";
		ss.processStringtype((String)test); // Only String not even Object
		ss.processStringtype(null); // NullPointerException
	}

	public void processStringtype(String type) {
		//Type field is always compared against the case label 
		//by using the String.equals() method.
		switch (type) {
		case "NEW":
			System.out.println("case NEW for:" + type);
			break;
		case "EXECUTE":
			System.out.println("case EXECUTE for:" + type);
			break;
		case "PENDING":
			System.out.println("case PENDING for:" + type);
			break;
		default:
			System.out.println("case default for:" + type);
			break;
		}
	}
}
