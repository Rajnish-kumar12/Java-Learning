/*
 * What are the differences between while loop and do while loop.
 */
/*
 * syntax difference
 * 
 * while(condition)
 * {
 *  instruction;    
 * }
 * 
 * do{
 *  instruction
 * }while{
 *  instruction
 * }
 * 
 */

/*
 * In case of while loop, there is no gurantee to execute body minimum one time, but in case of do while loop, there is gurantee
 * to execute loop body minimum one time.
 */

 /*
  * In case if while loop first condition will be executed but in case of do while loop first body will execute then condtion will be
  * executed.
  */

  class Syntax
  {
    public static void main(String[] args) {
        int i = 0;
        do{
            System.out.println(i);
            i+=1;
        }while(i<10);
    }
  }

  /*
   * Conditional expression is mandatory also in do while loop.
   */