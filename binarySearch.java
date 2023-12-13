public class MyClass {

   public static void main(String[] args) {
        MyClass myClass = new MyClass();
        myClass.binarySearch(3, new int[]{1, 3, 5, 8, 9, 10});
    }

    private int binarySearch(int target, int[] numbers) {
        int minPosition = 0;
        int maxPosition = numbers.length -1;
        int middlePosition;

        while (minPosition <= maxPosition) {
            middlePosition = (minPosition + maxPosition) / 2;

            if (numbers[middlePosition] == target) {
                System.out.println("target Element " + target);
                return middlePosition;
            }

            if (target > numbers[middlePosition]) {
                minPosition = middlePosition + 1;
            }

            if (target < numbers[middlePosition]) {
                maxPosition = middlePosition - 1;
            }
        }
        return -1;
    }
}
