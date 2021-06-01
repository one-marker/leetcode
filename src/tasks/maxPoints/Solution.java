package tasks.maxPoints;



//1160. Find Words That Can Be Formed by Characters

import java.util.HashMap;

//

public class Solution {

    public int maxPoints(int[][] points) {
        if (points.length == 1)
            return 1;

        HashMap<Key, Line> lines = new HashMap<>();

        for (int i = 0; i < points.length; i++)
            lines.putAll(generateLines(i, points));

        int maxValue = 0;
        for (Line line : lines.values())
            if (line.getCount() > maxValue)
                maxValue = line.getCount();

        return maxValue;
    }

    HashMap<Key, Line> generateLines(int index, int[][] points) {
        HashMap<Key, Line> lines = new HashMap<>();

        for (int i = 0; i < points.length; i++) {
            if (index != i) {
                int pointX = points[i][0];
                int pointY = points[i][1];

                Line newLine = new Line(points[index][0], points[index][1], pointX, pointY);
                Key newKey = generateKey(newLine);

                if (lines.containsKey(newKey))
                    lines.get(newKey).addCount();
                else
                    lines.put(newKey, newLine);
            }
        }
        return lines;
    }

    Key generateKey(Line line) {

        if (line.getX1() == line.getX2())
            return new Key(0, 0, line.getX1());

        if (line.getY1() == line.getY2())
            return new Key(0, line.getY1(), 0);

        double k = (double) (line.getY2() - line.getY1()) / (double) (line.getX2() - line.getX1());
        int b = (int) (line.getY1() - k*line.getX1());


        return new Key(k, b, 0);
    }

}

