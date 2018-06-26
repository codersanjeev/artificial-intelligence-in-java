package search;

import java.util.Random;

public class StochasticSearch {

    public static double f(double x){
        return -(x-1)*(x-1) + 2;
    }

    public static void main(String[] args){
        Random random = new Random();
        double startPointX = 0;
        double max = f(startPointX);

        for(double i=0; i<10; i++){
            double index = 2*random.nextDouble();
            if(f(index) > max){
                max = f(index);
            }
        }
        System.out.println("Maximum Value of function is : " + max);
    }

}
