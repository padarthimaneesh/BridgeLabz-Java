package datastructures.stackqueuehashmaphashfunction;

class CircularTour {

    static int tour(int[] petrol, int[] distance) {
        int start = 0, surplus = 0, deficit = 0;

        for (int i = 0; i < petrol.length; i++) {
            surplus += petrol[i] - distance[i];
            if (surplus < 0) {
                deficit += surplus;
                start = i + 1;
                surplus = 0;
            }
        }
        return (surplus + deficit >= 0) ? start : -1;
    }

    public static void main(String[] args) {
        int[] petrol = {6, 3, 7};
        int[] distance = {4, 6, 3};
        System.out.println(tour(petrol, distance));
    }
}