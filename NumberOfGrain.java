package BrainStorm;

public class NumberOfGrain {

    public static void main(String[] args) {
        System.out.println(numOfGrain(64));
    }

    static double numOfGrain(int numberOfCells) {
        double numberOfGrain = 1;
        for (int i = 0; i < numberOfCells; i++) {
            System.out.println(numberOfGrain);
            numberOfGrain = (double) (numberOfGrain + Math.pow(2, i));

        }
        return numberOfGrain;
    }

}
