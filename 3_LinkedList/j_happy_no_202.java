public class j_happy_no_202 {
   public static void main(String[] args) {
    //int n = 19;
    int n = 2;
    boolean ans=isHappy(n);

    System.out.println("o/p: "+ans);
   } 
    // int n=19 ->true
    // int n=2 -> false
   static boolean isHappy(int n){
      int slow=n;
      int fast=n;
      while(fast!=1 && slow!=1){
        slow=sumDigit(slow);
        fast=sumDigit(sumDigit(fast));

        if(slow==fast && slow!=1){
            return false;
        }
      }
      return true;
   }
   static int sumDigit(int n){
    int sum=0;
    int d=0;
    while(n!=0){
        d=n%10;
        sum=sum+d*d;
        n=n/10;
    }
    return sum;
   }
}
