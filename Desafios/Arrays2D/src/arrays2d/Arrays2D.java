package arrays2d;

public class Arrays2D {

    public static void main(String[] args) {
        int[][] arr2D = {
            {1, 1, 1,0, 0, 0},
            {0, 1, 0,0, 0, 0},
            {1, 1, 1,0, 0, 0},
            {0, 0, 2,4, 4, 0},
            {0, 0, 0,2, 0, 0},
            {0, 0, 1,2, 4, 0}};

        int max = Integer.MIN_VALUE;
        for (int l = 0; l < 4; l++) {
            for (int c = 0; c < 4; c++) {
                int topRow = arr2D[l][c] + arr2D[l][c + 1] + arr2D[l][c + 2];
                int middleRow = arr2D[l + 1][c + 1];
                int bottowRow = arr2D[l + 2][c] + arr2D[l + 2][c + 1] + arr2D[l + 2][c + 2];
                int curHourGlass = topRow + middleRow + bottowRow;

                if (curHourGlass > max) {
                    max = curHourGlass;
                }
            }

        }
        System.out.println(max);
    }

}
