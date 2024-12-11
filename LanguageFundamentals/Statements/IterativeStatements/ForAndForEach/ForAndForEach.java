/*
 * Example of for loop
 */
class ForLoop {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        System.out.println(startTime);
        int[] a = { 1, 2, 3, 4, 5 };
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("Execution time: " + duration );
    }
}

/*
 * Example of for-each
 */
class ForEachLoop {
    public static void main(String[] args) {
        long startTime = System.nanoTime();
        int[] a = { 1, 2, 3, 4, 5 };
        for (int x : a) {
            System.out.println(x);
        }
        long endTime = System.nanoTime();
        double duration = (endTime - startTime);
        System.out.println("Execution time: " + duration );
    }
}