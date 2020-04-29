package recursion;

public class recursionExample {
	int NUMBER_COLLUMS;
	int EMPTY_BLOCK;
	int MINE_BLOCK;
	int COVER_OFBLOCK;
	int[] fields;	
	int allCellsPresent;
/*
 * As the title suggests, this is an example taken from my Mine sweeper project when I needed the program to find empty cells
 * In mine sweeper, usually your initial click is going to result in blocks getting deleted
 * In this code, we check the cell that is located to the left to an empty cell in question. If it is not empty, it is uncovered. 
 * If it is empty, we repeat the whole process by recursively calling the findCells method
 * This algorithm is extremely useful, most of the time it wont be as long as this but since we are checking 8 blocks, this extent is needed
 * As well as it doesn't usually take in multiple if statements 
*/	
	public void findCells(int c) {

	    int current_loc = c % NUMBER_COLLUMS; 
	    int cell;

	    if (current_loc > 0) { 
	        cell = c - NUMBER_COLLUMS - 1;
	        if (cell >= 0) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }
	        }

	        cell = c - 1; 
	        if (cell >= 0) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }
	        }

	        cell = c + NUMBER_COLLUMS - 1;
	        if (cell < allCellsPresent) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }
	        }
	    }

	    cell = c - NUMBER_COLLUMS;
	    if (cell >= 0) {
	        if (fields[cell] > MINE_BLOCK) {
	            fields[cell] -= COVER_OFBLOCK;
	            if (fields[cell] == EMPTY_BLOCK) {
	                findCells(cell);
	            }
	        }
	    }

	    cell = c + NUMBER_COLLUMS;
	    if (cell < allCellsPresent) {
	        if (fields[cell] > MINE_BLOCK) {
	            fields[cell] -= COVER_OFBLOCK;
	            if (fields[cell] == EMPTY_BLOCK) {
	                findCells(cell);
	            }
	        }
	    }

	    if (current_loc < (NUMBER_COLLUMS - 1)) {
	        cell = c - NUMBER_COLLUMS + 1;
	        if (cell >= 0) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }
	        }

	        cell = c + NUMBER_COLLUMS + 1;
	        if (cell < allCellsPresent) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }
	        }
	        
	        cell = c - 1;
	        if (cell <= 0) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }

	        cell = c + 1;
	        if (cell < allCellsPresent) {
	            if (fields[cell] > MINE_BLOCK) {
	                fields[cell] -= COVER_OFBLOCK;
	                if (fields[cell] == EMPTY_BLOCK) {
	                    findCells(cell);
	                }
	            }
	        }
	      }
	    }    

	}

}
