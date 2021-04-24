package basic.part1.ex131140;

/*
    137. Write a Java program to find possible unique paths considering some obstacles,
    from top-left corner to bottom-right corner of a given grid (m x n).
    Note: You can move either down or right at any point in time and an obstacle and empty space is
    marked as 1 and 0 respectively in the grid.
 */
public class Exercise137 {

    static final int[][] obstacle_Grid = {
            { 0, 0, 0 },
            { 0, 1, 0 },
            { 0, 0, 0 },
    };

    public static void main(String[] args) {

        System.out.println(pathFinder(obstacle_Grid));
    }


    public static int pathFinder(int[][] obstaclesGrid) {
        int rows = obstaclesGrid.length;
        int columns = obstaclesGrid[0].length;

        int[][] paths = new int[rows][columns];

        for (int row = 0; row < rows; row++) {
            for (int column = 0; column < columns; column++) {

                if (obstaclesGrid[row][column] == 1) paths[row][column] = 0;

                else if (row == 0 || column == 0) paths[row][column] = 1;

                else paths[row][column] = paths[row - 1][column] + paths[row][column - 1];
            }
        }

        return paths[rows - 1][columns - 1];
    }
}
