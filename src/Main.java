
class Islands {

    //private int[][] sea;

    Islands() {
//        sea = new int[][]{
//                {1, 1, 1, 1, 0},
//                {1, 1, 1, 1, 0},
//                {1, 1, 0, 0, 0},
//                {0, 0, 0, 1, 0},
//                {0, 0, 0, 0, 0}};
    }
    
    int countIslands(int[][] sea) {
        int count = 0;

        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea.length; j++) {
                if (sea[i][j] == 1) {
                    count++;
                    markIsland(sea,i,j);
                }
            }
        }
        for (int i = 0; i < sea.length; i++) {
            for (int j = 0; j < sea.length; j++)
                System.out.print(sea[i][j]);
            System.out.print("\n");
        }
        System.out.print("\n");
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

    void showSea() {

    }

    void in(int[] k){
        on(k);
        System.out.println(k[0]);
    }
    void on(int[] k){
        k[0]=2;
    }

}

public class Main {


    public static void main(String[] args) {

        int h=0;
        int[] s = new int[]
               {1, 1, 1, 1, 0};
        Islands islands = new Islands();
        islands.in(s);
        for (int i = 0; i < s.length; i++) {

            System.out.print(s[i]);
        }
//
//        int [][]sea = new int[][]{
//                {1, 1, 1, 1, 0},
//                {1, 1, 1, 1, 0},
//                {1, 1, 0, 0, 0},
//                {0, 0, 0, 1, 0},
//                {0, 0, 0, 0, 0}};
//        System.out.println(islands.countIslands(sea));
//
//
//        islands.showSea();
//        System.out.println("Hello");
    }


}
