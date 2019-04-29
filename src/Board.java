public class Board {

    public Board(int length, int numberOfMines) { // generates square board of size parameter length
        var grid = new Cell[length][length]; // board is an array of Cell objects

        int row = 0;
        int column = 0;

        for (int x = 0; x < length; x++) {
            for (int y = 0; y < length; y++) {
                grid[x][y].setUnopened();
            }
        }

        for (int m = 0; m < numberOfMines; m++) {  // placing mines
            while (true) {
                int x = 0;
                int y = 0;
//                x = String.valueOf((int) (grid.length * Math.random()));
//                y = String.valueOf((int) (grid[0].length * Math.random()));

                x = (int) (length * Math.random());
                y = (int) (length * Math.random());

                if (x >= 1 && x <= 10) {
                    if ((y >= 1) && (y <= 10)) {
                        grid[x][y].setMine();
                    }
                }
            }
        }

        for (int x = 0; x < length; x++) { // detect surrounding mines - printing the numbers of surrounding mines on the board
            for (int y = 0; y < length; y++) {
                if (grid[x][y].equals(Cell.blank)) {
                    int num = 0;
                    for (int a = (x - 1); a <= (x + 1); a++) {
                        for (int b = (y - 1); b <= (y + 1); b++) {
                            if (grid[a][b].equals(Cell.mine)) {
                                num++;
                            }
                        }
                    }

                    grid[x][y].equals(num);

                }
            }
        }




    }

}