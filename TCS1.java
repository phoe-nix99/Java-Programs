public class TCS1 {
    public static void main(String[] args) {
        // Scanner sc = new Scanner (System.in);
        // System.out.println("Enter the size of the array");
        // int h = sc.nextInt();
        int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        int[] left = new int[arr.length];
        int[] right = new int[arr.length];
        int index = 0;

        /*
         * for (int i = 0; i < arr.length; i++ ){
         * 
         * System.out.println("Enter the data: ");
         * arr[i] = sc.nextInt();
         * }
         * System.out.println("The Elements in the array are: ");/*
         */

        /*
         * for ( int j = 0; j < arr.length; j++){
         * System.out.print(arr[j] + " ");
         */

        System.out.println();
        left[0] = 0;
        for (int u = 1; u < arr.length; u++) {

            left[u] = left[u - 1] + arr[u - 1];

        }
        right[0] = 0;
        for (int q = arr.length - 2; q >= 0; q--) {

            right[q] = right[q + 1] + arr[q + 1];

        }

        System.out.println("The Elements in left array are: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.print(left[k] + " ");
        }
        System.out.println();

        System.out.println("The Elements in right array are: ");
        for (int s = 0; s < arr.length; s++) {
            System.out.print(right[s] + " ");
        }

        for (int num = 0; num < arr.length; num++) {
            if (left[num] == right[num]) {

                index = num;
                break;

            }

        }
        System.out.println();
        System.out.println("Key found at index: " + index);

    }

}
