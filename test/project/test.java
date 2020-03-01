package project;

import static org.junit.Assert.*;

import org.junit.Test;

import project.addition;

public class test {
	@Test
	 public void testadd () {
			
		int x=addition.addint(4,5);
			assertTrue(x==9);
		
		}
		
		@Test
		 public void testadd1 () {
				
			int x=addition.addint(-3,5);
				assertTrue(x==2);
			
			}
		@Test
		 public void testadd2 () {
				
			int x=addition.addint(4,0);
				assertTrue(x==4);
			
			}
		
		
		@Test
		 public void testadd3 () {
				
			int x=addition.addint(-9,-5);
				assertTrue(x==-14);
			
			}
		
		
		

}
