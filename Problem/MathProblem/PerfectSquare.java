/*
 * Finding number is perfect square or not.
 */
class PerfectSquare
{
    public static void main(String[] args) {
        int num = 16;
        for(int i =1;i<=num/2;i++){
            if(i*i==num){
                System.out.println("Number is perfect square, whose square root is "+i);
                break;
            }
        }
    }
}

/*
 * Finding number of perfect square upto given number including number.
 */
class NumberOfPerfectSquare
{
    public static void main(String[] args) {
        int num = 12;
        int count = 0;
        for(int i =1;i<=num;i++){
            for(int j=1;j<=i;j++){
                if(j*j==i){
                    System.out.println(i);
                    count++;
                    break;
                }
            }
        }
        System.out.println(count);
    }
}