package com.app.TestNGScripts;
import org.testng.Assert;
import org.testng.annotations.Test;


public class AssertionDemo2 {
public void method1() {
String expectedresult="selenium";	
String actualresult="selenium tools";
Assert.assertNotEquals(expectedresult,actualresult);
}


public void method2() {
	String actualresult="selenium";
	Assert.assertNotNull(actualresult);
}
}