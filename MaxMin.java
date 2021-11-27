class MaxMin {
    public static void main(String[] args) {
        int[] arr = new int[] { 21, 432, 13, -65, 53, 132, 40, 20013, 432341, -90 };
        int max = arr[0];
        int min = arr[0];
        System.out.print("Array Elements: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("\nMax: " + max);
        System.out.println("Min: " + min);
    }
}
