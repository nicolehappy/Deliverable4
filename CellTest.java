import static org.junit.Assert.*;

import org.junit.Test;

public class CellTest {
	
	/*
	 * two test cases for ToString() 
	 * test if the cell is alive then return "X"
	 * or if the cell is dead, return "."
	 */

	
    @Test
    public void testCellToStringAlive(){
        Cell newCell = new Cell(true);
        assertEquals(newCell.toString(), "X");
    }

    
    @Test
    public void testCellToStringDead(){
        Cell newCell = new Cell(false);
        assertEquals(newCell.toString(), ".");
    }
    
    @Test
    public void testCellToStringNull(){
    	
        Cell newCell = new Cell();
        newCell.setText(null);
        assertEquals(newCell.toString(), ".");
    }
    

}
