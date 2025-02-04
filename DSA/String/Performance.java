package DSA.String;

public class Performance {

    public static void main(String[] args) {
        String series = "";
        /*
         * New string object in every iteration
         * 
         * Time complexity O(n*n)
         * 
         * This is not good approach so we use string builder for better approach
         * 
         */
        for (int i = 0; i < 26; i++) {
            char ch = (char) ('a' + i);
            series += ch;
        }
        System.out.println(series);
    }
}