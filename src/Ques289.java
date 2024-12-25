public class Ques289 {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;
        int [][] replica = new int[m][n];

        for(int i = 0;i<m;i++){
            for(int j =0; j<n;j++){
                int oneCounter = 0;
                if(i-1>=0 && j-1>=0){
                    if(board[i-1][j-1]==1){
                        oneCounter++;
                    }
                }
                if(i+1<m && j+1<n){
                    if(board[i+1][j+1]==1){
                        oneCounter++;
                    }
                }
                if(i+1<m && j-1>=0){
                    if(board[i+1][j-1]==1){
                        oneCounter++;
                    }
                }
                if(i-1>=0 && j+1<n){
                    if(board[i-1][j+1]==1){
                        oneCounter++;
                    }
                }
                if(i-1>=0){
                    if(board[i-1][j]==1){
                        oneCounter++;
                    }
                }
                if(i+1<m){
                    if(board[i+1][j]==1){
                        oneCounter++;
                    }
                }
                if(j-1>=0){
                    if(board[i][j-1]==1){
                        oneCounter++;
                    }
                }
                if(j+1<n){
                    if(board[i][j+1]==1){
                        oneCounter++;
                    }
                }

                if(board[i][j]==1){
                    if(oneCounter<2 || oneCounter>3){
                        replica[i][j]=0;
                    }
                    else{
                        replica[i][j]=1;
                    }
                }
                else{
                    if(oneCounter==3){
                        replica[i][j]=1;
                    }
                    else{
                        replica[i][j]=0;
                    }
                }
            }
        }

        for(int i = 0;i<m;i++){
            for(int j=0;j<n;j++){
                board[i][j] = replica[i][j];
            }
        }
    }
}
