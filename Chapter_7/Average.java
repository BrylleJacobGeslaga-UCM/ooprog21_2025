public class Average {
    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int result = countGreaterThanAvg(responseTimes);
        System.out.println(result);
    }
    
    public static int countGreaterThanAvg(int[] arr) {
        int count = 0;
        double sum = arr[0];

        for (int i = 1; i < arr.length; i++) {
            double avg = sum / i;

            if (arr[i] > avg) {
                count++;
            }

            sum += arr[i];
        }

        return count;
    }
}
