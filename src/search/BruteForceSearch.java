package search;

public class BruteForceSearch {

    public static double f(double x){
        return -(x*x) + 2;
    }

    public static void main(String[] args){

        double startPositionX = -2;
        double maximumX = startPositionX;
        double dx = 0.1;
        double max = f(startPositionX);

        for(double i=startPositionX; i < 2; i += dx){
            if(f(i) > max){
                max = f(i);
                maximumX = i;
            }
        }

        System.out.println("Maximum Value : " + max);
        System.out.println("At Point : " + maximumX);
    }

}
