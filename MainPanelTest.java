import static org.junit.Assert.*;


import org.junit.Test;

public class MainPanelTest {

	  @Test
	    public void testConvertToInt0() { 
	        try {
	            MainPanel m = new MainPanel(15);
	            int n = m.convertToInt(0);
	            assertEquals(0, n);
	        }catch (Exception e) {
	            fail();
	        }
	    }
	  
	  
	  @Test
	    public void testConvertToInt10() { 
	        try {
	            MainPanel m = new MainPanel(15);
	            int n = m.convertToInt(10);
	            assertEquals(10, n);
	        }catch (Exception e) {
	            fail();
	        }
	    }
	  @Test
	    public void testConvertToIntminus10() { 
	        try {
	            MainPanel m = new MainPanel(15);
	            int n = m.convertToInt(-10);
	            assertEquals(-10, n);
	        }catch (Exception e) {
	            fail();
	        }
	    }
}
