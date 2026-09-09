import java.lang.String;
public class d_calculate_comma {
    public static void main(String[] args) {
        long n=1000000000000000L;
        long op=countComma(n);
        System.out.println("O/p: "+op);
    }
    
    // n=1002
    // n=998
    // n=1004590,  op=1008182
    // n=19986765, op=38972532
    // n=1409752114, op=3228255345
    // n=1122872257463, op=3490488028856
    // n=1000000000000000, op=3998998998999005
    static long countComma(long n){
        
        // int d=String.valueOf(Math.abs(n)).length();
        // int f=(d-1)/3;
        // if (d<=6){
        //    long  comma=(n-1000)+1;
        //    return (comma*f);
        // }
        // else if(d<=10){
        //     long dis=1;
        //     for(int i=1; i<7; i++){
        //         dis*=10;
        //     }
        //     long comma=n-dis+1;
        //     return ((n-1000)+1) + comma;
        // }
        // else if(d<=12){
        //     long dis=1;
        //     for(int i=1; i<7; i++){
        //         dis*=10;
        //     }
        //     long comma=n-dis+1;
        //     long  d_C=((n-1000)+1) + comma;
        //     long trip=1;
        //     for(int i=0; i<9 ;i++){
        //         trip*=10;
        //     }
        //     long trp_comma=(n-trip)+1;
        //     return trp_comma+d_C;
        // }
        // else if(d<=15){
        //     long dis=1;
        //     for(int i=1; i<7; i++){
        //         dis*=10;
        //     }
        //     long comma=n-dis+1;
        //     long  d_C=((n-1000)+1) + comma;
        //     long trip=1;
        //     for(int i=0; i<9 ;i++){
        //         trip*=10;
        //     }
        //     long trp_comma=(n-trip)+1;
        //     trip=trp_comma+d_C;

        //     long four=1;
        //     for(int i=1; i<13; i++){
        //         four*=10;
        //     }
        //     long no=n-four+1;
        //     return  no+trip;
        // }
        // if(d==16){
        //     long dis=1;
        //     for(int i=1; i<7; i++){
        //         dis*=10;
        //     }
        //     long comma=n-dis+1;
        //     long  d_C=((n-1000)+1) + comma;
        //     long trip=1;
        //     for(int i=0; i<9 ;i++){
        //         trip*=10;
        //     }
        //     long trp_comma=(n-trip)+1;
        //     trip=trp_comma+d_C;

        //     long four=1;
        //     for(int i=1; i<13; i++){
        //         four*=10;
        //     }
        //     long no=n-four+1;
        //     long fo=no+trip;

        //     long fi=1000000000000000L;
        //     long co=n-fi+1;
        //     return co+fo;

        // }
        // return  0;

       

        // // Second Method
        // int digit=String.valueOf(Math.abs(n)).length();
        
        // // For 0
        // if (digit<4)
        //      return 0;


        // // for digit 4 to 6 digit -> double Comma
        // if(digit<=6)
        // return ((n-1000)+1)*((digit-1)/3);

        // // for digit  7 to 9 -> Double comma
        // if (digit<=9){
        //     long first=((n-1000)+1)*((digit-1)/3);
        //     return ((n-1000000)+1)+ first;
        // }

        // // for digit 10 to 12 -> triple comma 
        // if(digit<=12){
            
        //     long second =((n-1000000)+1)+ (((n-1000)+1)*((digit-1)/3));
        //     return ((n-1000000000L)+1)+second;
        // }  

        // // for digit 13 to 15 -> Four
        // if(digit<=15){
        //     long second =((n-1000000)+1)+ (((n-1000)+1)*((digit-1)/3));
        //     long Triple=((n-1000000000L)+1)+second;
        //     return ((n-1000000000000L)+1)+Triple;
        // }

        // // four last 16
        // long second =((n-1000000)+1)+ (((n-1000)+1)*((digit-1)/3));
        // long Triple=((n-1000000000L)+1)+second;
        // long four=((n-1000000000000L)+1)+Triple;;
        // return ((n-1000000000000000L)+1)+four;



        // Third Metod
        long ans =0;

        for(long i=1000; i<=n; i*=1000){
            ans+=n-i+1;
        }

        return ans;
        


    }
}
