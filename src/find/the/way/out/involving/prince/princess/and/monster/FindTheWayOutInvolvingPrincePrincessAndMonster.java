package find.the.way.out.involving.prince.princess.and.monster;

import java.util.LinkedList;
import java.util.Queue;

public class FindTheWayOutInvolvingPrincePrincessAndMonster {

    private static final int MONSTER = 1, BLOCKED = 2, UNVISITED = -1;

    public boolean solution(int[][] matrix, int sx, int sy, int tx, int ty) {
        int n = matrix.length;
        int m = matrix[0].length;
        int[][] output = new int[n][m];
        Queue<Cell> q = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (matrix[i][j] == MONSTER) {
                    q.offer(new Cell(i, j, 0));
                }
                output[i][j] = UNVISITED;
            }
        }

        while (!q.isEmpty()) {
            Cell element = q.poll();
            int elementRow = element.row;
            int elementCol = element.col;
            int elementSteps = element.steps;

            if (output[elementRow][elementCol] == UNVISITED) {
                output[elementRow][elementCol] = elementSteps;
            }

            int[] rowsTraversal = {-1, 0, 0, 1};
            int[] colsTraversal = {0, -1, 1, 0};

            for (int i = 0; i < 4; i++) {
                int newRow = elementRow + rowsTraversal[i];
                int newCol = elementCol + colsTraversal[i];
                if (newRow >= 0 && newRow < n && newCol >= 0 && newCol < m
                        && output[newRow][newCol] == UNVISITED
                        && matrix[newRow][newCol] != BLOCKED) {
                    q.offer(new Cell(newRow, newCol, elementSteps + 1));
                    output[newRow][newCol] = elementSteps + 1;
                }
            }
        }

        q.offer(new Cell(sx, sy, 0));
        while (!q.isEmpty()) {
            Cell element = q.poll();
            int elementRow = element.row;
            int elementCol = element.col;
            int elementSteps = element.steps;

            if (output[elementRow][elementCol] != UNVISITED && output[elementRow][elementCol] < elementSteps) {
                continue;
            }

            int[] rowsTraversal = {-1, 0, 0, 1};
            int[] colsTraversal = {0, -1, 1, 0};

            for (int i = 0; i < 4; i++) {
                int newRow = elementRow + rowsTraversal[i];
                int newCol = elementCol + colsTraversal[i];
                if ((newRow >= 0 && newRow < n && newCol >= 0 && newCol < m)
                        && ((output[newRow][newCol] == UNVISITED
                        || output[newRow][newCol] > elementSteps + 1)
                        && matrix[newRow][newCol] != BLOCKED)) {
                    if(newRow == tx && newCol == ty){
                        return true;
                    }
                    q.offer(new Cell(newRow, newCol, elementSteps + 1));
                }
            }
        }

        return false;
    }

}

class Cell {
    int row, col, steps;

    Cell() {
    }

    Cell(int _row, int _col, int _steps) {
        this.row = _row;
        this.col = _col;
        this.steps = _steps;
    }
}
