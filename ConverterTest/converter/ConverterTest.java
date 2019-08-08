package converter;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class ConverterTest {

	@Test
	void testkToC() {
		assertEquals("-263.15",Converter.kToC("10"));
	}
	
	@Test
	void testcToK() {
		assertEquals("293.15",Converter.cToK("20"));
	}
	
	@Test
	void testkToF() {
		assertEquals("539.33",Converter.kToF("555"));
	}
	
	@Test
	void testfToK() {
		assertEquals("533.15",Converter.fToK("500"));
	}
	
	@Test
	void testcToF() {
		assertEquals("50.0",Converter.cToF("10"));
	}
	
	@Test
	void testfToC() {
		assertEquals("10.0",Converter.fToC("50"));
	}
	
	@Test
	void testlToML() {
		assertEquals("1000.0",Converter.lToMl("1"));
	}
	
	@Test
	void testlToGal() {
		assertEquals("0.26417",Converter.lToGal("1"));
	}
	
	@Test
	void testmlToL() {
		assertEquals("1.0",Converter.mlTol("1000"));
	}
	
	@Test
	void testmlToGal() {
		assertEquals("0.00026417",Converter.mlToGal("1"));
	}
	
	@Test
	void testgalToL() {
		assertEquals("3.78544119",Converter.galToL("1"));
	}
	
	@Test
	void testgalToMl() {
		assertEquals("3785.44119317",Converter.galToMl("1"));
	}


}
