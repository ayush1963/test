package test;

import static org.junit.Assert.*;

import org.junit.Test;

public class Square {

	@Test
	public void test() {
		MyTestUnit obj1=new MyTestUnit();
		int output_f=obj1.square(6);
		assertEquals(36,output_f);
	}

	private void assertEquals(int i, int output_f) {
		// TODO Auto-generated method stub
		
	}

}
