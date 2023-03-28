import java.util.*;
import java.lang.Math;
public class Main{
    public static void main(String[] args) {

         new Board(8);

        int turn =0;
        boolean hasitmoved=false;//this is needed since pawns can move up to two squares at start but only on the first move

        ChessBoard ChessInstance = new ChessBoard();//TODO :make the enemy pov as well just inverted
        ChessInstance.print2DArray(ChessInstance.board);//EMPTY BOARD

        System.out.println();

        ChessInstance.ChessPlace();
        ChessInstance.print2DArray(ChessInstance.board);//PIECES LOADED
        //START GAME
        while(true){

            Scanner reader =new Scanner(System.in);
            System.out.println("enter the piece to move");
            char piece = reader.next().charAt(0);
            System.out.println("enter the starting x coordinate");
            int xstart = reader.nextInt();
            System.out.println("enter the starting y coordinate");
            int ystart = reader.nextInt();
            System.out.println("enter the x coordinate you want it to go");
            int xfinish = reader.nextInt();
            System.out.println("enter the y coordinate you want it to go");
            int yfinish = reader.nextInt();

            System.out.println(turn);
            turn++;
            ChessInstance.Movement(piece,xstart,ystart,xfinish,yfinish,hasitmoved);//char,int,int,int,int,boolean
            ChessInstance.print2DArray(ChessInstance.board);//PIECES LOADED

        }

    }
}