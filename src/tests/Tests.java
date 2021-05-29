package tests;

import tasks.islands.Islands;

import tasks.maxPoints.Solution;

public class Tests {


    public void islandsTest() {

        System.out.println("\n//Подсчет количества островов");
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

    public void maxPointsTest() {
        System.out.println("\n//1160. Find Words That Can Be Formed by Characters");
        int[][] points = {{0, 2}, {0, 0},{0,1},{1, 1},{0,5},{0,3}};
        Solution solution = new Solution();
        System.out.println("Максимальное количество точек на одной линии: " + solution.maxPoints(points));
    }



}
