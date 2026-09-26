package com.example.vvce.trj1;
import com.*;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue; 
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
	App app=new App();
	 void testAdd() {
		assertEquals(25,app.add(20,5));
		
	}
	 void testsub() {
		 assertEquals(15,app.add(20,5));
	 }

    /**
     * Rigorous Test :-)
     */
     
    
}
