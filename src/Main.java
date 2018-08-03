import java.util.Arrays;
import java.util.Scanner;

/**
 * @program: untitled
 * @description: main
 * @author: wuqi
 * @create: 2018-08-01 13:15
 **/


class Point{
    int x;
    int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int distanceTo(Point point){
        return Math.abs(x - point.x) + Math.abs(y - point.y);
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

public class Main {

    private static Point start = new Point(0,0);
    static int shortestPath = Integer.MAX_VALUE;

    public static void doChoice(Point[] points, int begin, int end){
        if(begin == end ){
            System.out.println(Arrays.toString(points));
            shortestPath = Math.min(shortestPath,calculateDistance(start,points));
            return;
        }

        for(int i=begin;i <= end;i++){
            swap(points,begin,i );
            doChoice(points, begin+1,  end);
            swap(points,begin,i );
        }
    }

    static int calculateDistance(Point start, Point[] points){
        int distance =  start.distanceTo(points[0]);
        for (int i = 0; i < points.length - 1; i++){
            distance += points[i].distanceTo(points[i + 1]);
        }
        return distance;
    }
    static void swap(Point[] array,int a,int b){
        Point temp=array[a];
        array[a]=array[b];
        array[b]=temp;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        Point[] points = new Point[n];
        for (int i = 0; i < n; i++){
            String line = scanner.next();
            String[] arr = line.split(",");
            int x = Integer.parseInt(arr[0]);
            int y = Integer.parseInt(arr[1]);
            points[i] = new Point(x,y);
        }

        doChoice(points,0,points.length -1 );
        System.out.println(shortestPath);
    }
}
