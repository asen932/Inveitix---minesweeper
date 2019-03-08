import java.util.Scanner;

public class Play {

    public static String play(){
        Minesweeper minesweeper = new Minesweeper();
        minesweeper.placeMines(10);
        minesweeper.refreshGrid();
        minesweeper.printInConsole(minesweeper.grid);

        Scanner scanner = new Scanner(System.in);

        int x;
        int y;

        System.out.println("Please enter X coordinate");
        x = scanner.nextInt();

        System.out.println("Please enter X coordinate");
        y = scanner.nextInt();

        minesweeper.minesweeperTurn(x,y);
        minesweeper.detectSurroundingMines(); // I removed (int args) from detect method in Minesweeper class
        minesweeper.refreshGrid();

        while(true){
            if(minesweeper.gameWon && minesweeper.gameRunning == false){
                System.out.println("Congratulations! You win!");
                break;
            }
            else if(minesweeper.gameLost && minesweeper.gameRunning == false){
                System.out.println("You loose. Good say, sir.");
                break;
            }
            else if(minesweeper.gameRunning){
                System.out.println("Please enter X coordinate");
                x = scanner.nextInt();

                System.out.println("Please enter X coordinate");
                y = scanner.nextInt();

                minesweeper.minesweeperTurn(x,y);
                minesweeper.detectSurroundingMines();
                minesweeper.refreshGrid();
            }
        }
        return minesweeper.printInConsole(minesweeper.grid);
    }

}
