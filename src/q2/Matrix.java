package q2;

import java.util.ArrayList;

public class Matrix {
    private String[][] grid;
    private int numRows;
    private int numColumns;

    class Cell {
        private int row;
        private int column;

        public Cell(int row, int column) {
            this.row = row;
            this.column = column;
        }

        @Override
        public String toString() {
            return "Cell(" + row + ", " + column + ")";
        }

    }

    public Matrix(int numRows, int numColumns) {
        this.numRows = numRows;
        this.numColumns = numColumns;
        grid = new String[numRows][numColumns];
    }

    public void set(int row, int column, String description) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            grid[row][column] = description;
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }

    public String get(int row, int column) {
        if (row >= 0 && row < numRows && column >= 0 && column < numColumns) {
            return grid[row][column];
        } else {
            throw new IndexOutOfBoundsException("Invalid row or column index");
        }
    }

    public ArrayList<Cell> getDescribedCells() {
        ArrayList<Cell> describedCells = new ArrayList<>();
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numColumns; j++) {
                if (grid[i][j] != null) {
                    describedCells.add(new Cell(i, j));
                }
            }
        }
        return describedCells;
    }

}
