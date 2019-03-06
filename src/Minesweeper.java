import java.util.Scanner;

public class Minesweeper {

    public boolean gameWon = false; // if all unopened positions are mines
    public boolean gameLost = false; // if a mine is opened
    public boolean gameRunning = true; // if gameWon == false && fameLost == false;

    public String[][] grid = new String[10][10];  // 10 * 10 grid, to be printed in console

    public String mine = " X ";
    public String blank = "  ";
    public String unopened = " [] ";


    public Minesweeper(){

        int row = 0;
        int column = 0;


        for(int x = 0; x < grid.length; x++){
            for (int y = 0; y < grid[0].length; y++){
                grid[x][y] = unopened; // Initially, all fields are unopened
            }
        }
    }

    public void printInConsole(String[][] args) {

        for (int x = 0; x < grid.length; x++) {
            for (int y = 0; y < grid[0].length; y++){
                System.out.print(grid[x][y]);
            }
        }
    }

    public void placeMines(int desiredMines) {  // where desiredMines =
        for (int mineNumber = 0; mineNumber < desiredMines; mineNumber++)
            while (true) {
                int x = 0;
                int y = 0;
//                x = String.valueOf((int) (grid.length * Math.random()));
//                y = String.valueOf((int) (grid[0].length * Math.random()));

                x = (int) (grid.length * Math.random());
                y = (int) (grid[0].length * Math.random());

                if (x >= 1 && x <= 10) {
                    if ((y >= 1) && (y <= 10))
                        grid[x][y] = mine;
                }
            }
    }

    public boolean isGameWon() {
        return gameWon;
    }

    public boolean isGameLost() {
        return gameLost;
    }

    public boolean isGameRunning() {
        return gameRunning;
    }

    public void detectSurroundingMines(int args){
        for(int x = 0; x < grid.length; x++){
            for(int y = 0; y < grid.length; y++){
                if(grid[x][y].equals(blank)){
                    int number = 0;

                    for(int a = (x-1); a <= (x+1); a++){
                        for(int b = (y-1); b <= (y+1); b++){
                            if(mine.equals(grid[a][b]))
                                number++;
                        }
                    }
                    grid[x][y] = "" + number; // number = the number displayed in x,y of surounding mines which may be within  +/- x and y
                }
            }
        }
    }

    public void refreshGrid(){
        printInConsole(grid);
    }

    public void play(int args) {
        Scanner coordinate = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Enter a X coordinate:");
        x = coordinate.nextInt();

        System.out.println("Enter a Y coordinate:");
        y = coordinate.nextInt();

        while (true) {

            // TO BE CONTINUED


            if (gameRunning) {

            } else if (gameWon) {

            } else if (gameLost) {

            }
        }
    }







}
