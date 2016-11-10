# Deliverable4 
Refactoring Conway's Game of Life.  Yue Li (yul134)

Before: 

<img src = "before.png">

* MainPanel.java -- runContinuous()

	There is no return value in the method, so we have to use manual test.


* Cell.java -- toString()

	 I have three cases for ToString() 
	 test if the cell is alive then it should return "X"
	 or if the cell is dead, it should return "."
	 or if the cell is null, it should return "."
	

* MainPanel.java -- convertToInt()

After: 
