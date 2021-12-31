class Solution {
    public int[][] generateMatrix(int n) {
        int counter=1;
        int rowStart=0;
        int rowEnd=n-1;
        int colStart=0;
        int colEnd=n-1;
        int[][] res=new int[n][n];
        while(rowStart<=rowEnd && colStart<=colEnd){
            for(int i=colStart;i<=colEnd;i++){
                res[rowStart][i]=counter++;
            }
            rowStart++;
            
            for(int i=rowStart;i<=rowEnd;i++){
                res[i][colEnd]=counter++;
            }
            colEnd--;
            if(rowStart<=rowEnd){
            for(int i=colEnd;i>=colStart;i--){
                res[rowEnd][i]=counter++;
            }
            }
            rowEnd--;
            if(colStart<=colEnd){
                for(int i=rowEnd;i>=rowStart;i--){
                    res[i][colStart]=counter++;
                    
                }
            }
            colStart++;
        }
        return res;
        
        
    }
}