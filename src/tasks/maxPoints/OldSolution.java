package tasks.maxPoints;

import java.util.HashMap;

/*
public class OldSolution {
    public int maxPoints(int[][] points) {
        if (points.length == 1) {
            return 1;
        }
        HashMap<Line, Integer> lineHashMap = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            lineHashMap.putAll(generateLines(i, points));
        }
        int maxValue = 0;
        for (Integer count : lineHashMap.values())
            if (count> maxValue)
                maxValue = count;

        return maxValue;
    }

    Line checkLines(HashMap<Line, Integer> lineHashMap, int pointX, int pointY) {
        for (Line line : lineHashMap.keySet()) {
            if (isPointOnLine(line, pointX, pointY)) {
                return line;
            }
        }
        return null;
    }

    HashMap<Line, Integer> generateLines(int index, int[][] points) {
        HashMap<Line, Integer> lineHashMap = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            if (index != i) {
                int pointX = points[i][0];
                int pointY = points[i][1];

                Line checkLine = checkLines(lineHashMap, pointX, pointY);
                if (checkLine != null) {
                    int count = lineHashMap.get(checkLine) + 1;
                    lineHashMap.replace(checkLine, lineHashMap.get(checkLine), count);
                } else {
                    Line newLine = new Line(points[index][0], points[index][1], pointX, pointY);
                    lineHashMap.put(newLine, 2);
                }
            }
        }
        return lineHashMap;
    }

    boolean isPointOnLine(Line line, int x, int y) {

        if ((line.getX1() == x && line.getX1() == line.getX2()) || (line.getY1() == y && line.getY1() == line.getY2())) {
            return true;
        }

        double tmpX = (double) (x - line.getX1()) / (double) (line.getX2() - line.getX1());
        double tmpY = (double) (y - line.getY1()) / (double) (line.getY2() - line.getY1());

        System.out.println(tmpX + " " + tmpY);
        if (tmpX == tmpY) {
            return true;
        }
        return false;
    }
}
*/