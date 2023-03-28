public class ChessBoard extends Board {

    public void print2DArray(char[][] Board) {
        for (int i = 0; i < Board.length; i++) {
            for (int j = 0; j < Board[i].length; j++) {
                System.out.print(Board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public ChessBoard() {
        this.board = new char[N][N];
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                board[i][j] = '-';
            }
        }
    }

    public void ChessPlace(){
        for(int j=0; j<8; j++){
            //place pawns
            board[1][j] = 'p';//Lowercase letter for black piece
            board[6][j] = 'P';//uppercase letter for white piece


        }//place rooks
        board[0][0]='r';
        board[0][7]='r';
        board[7][0]='R';
        board[7][7]='R';
        //place horses
        board[0][1]='h';
        board[0][6]='h';
        board[7][1]='H';
        board[7][6]='H';
        //place bishops
        board[0][2]='b';
        board[0][5]='b';
        board[7][2]='B';
        board[7][5]='B';
        //place queen and king
        board[0][3]='q';
        board[0][4]='k';
        board[7][3]='Q';
        board[7][4]='K';
    }

    public void Movement(char piece,int xstart,int ystart,int xfinish,int yfinish,boolean hasitmoved){//y is <--------------------------------------->while x is opposite
       switch (piece){

           case'p':{
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'p';
               break;
           }
           case'P':{
            board[xstart][ystart] = '-';
            board[xfinish][yfinish] = 'P';
            break;
            }
           case'h':{
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'h';
               break;
           }
           case'H':{
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'H';
               break;
           }
           case 'b':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'b';
               break;
           case 'B':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'B';
               break;
           case 'r':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'r';
               break;
           case 'R':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'R';
               break;
           case 'q':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'q';
               break;
           case 'Q':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'Q';
               break;
           case 'k':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'k';
               break;
           case 'K':
               board[xstart][ystart] = '-';
               board[xfinish][yfinish] = 'K';
               break;
           default:
               System.out.println("Invalid piece");
               break;


        }

    }
}
