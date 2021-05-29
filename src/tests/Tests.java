package tests;

import tasks.islands.Islands;

public class Tests {


    public void islandsTest() {
        Islands islands = new Islands();

        int [][]sea = new int[][]{
                {1, 1, 1, 1, 0},
                {1, 1, 1, 1, 0},
                {1, 1, 0, 0, 0},
                {0, 0, 0, 1, 0},
                {0, 0, 0, 0, 0}};
        islands.showSea(sea);
        System.out.println("Количество островов: " + islands.countIslands(sea));
    }



}
