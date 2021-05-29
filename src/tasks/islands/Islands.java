package tasks.islands;

//Подсчет количества островов
public class Islands {

    public int countIslands(int[][] sea) {
        int count = 0;

        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea.length; j++) {
                if (sea[i][j] == 1) {
                    count++;
                    markIsland(sea,i,j);
                }
            }
        }

        return count;
    }

    private void markIsland(int[][]sea, int i, int j){
        if(i < 0 || i >= sea.length || j < 0 || j >= sea[i].length || sea[i][j] == 0)
            return;

        sea[i][j] = 0;

        markIsland(sea, i - 1, j);
        markIsland( sea, i + 1, j);
        markIsland( sea, i, j - 1);
        markIsland(sea,  i, j + 1);
    }

    public void showSea(int[][]sea) {
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea.length; j++)
                System.out.print(sea[i][j]);
            System.out.print("\n");
        }
    }

}
