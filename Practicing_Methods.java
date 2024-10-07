


public class Practicing_Methods {

    
    
    public static void main(String[] args) {
        System.out.println("hello");
        
        int fib1[] = {0,1,2,3,4,5};
        int fib2 =fib1[0];
        for(int i= 0; i<=5 ; i++)
        {
            fib2 += fib1[i];
            System.err.print(fib2 + ",");
        }
        
        // int a[][]= {{1,2,3},{1,2,3},{1,2,3}};
        // int b[][] = {{1,2,3},{1,2,3},{1,2,3}};
        // int c[][] = new int[3][3];

        // for (int i=0 ; i < a.length ; i++)
        // {
        //     for  (int j = 0 ; j < b.length ; j++ )
        //     {
        //         c[i][j] = a[i][j] + b[i][j];
                
        //     }
        // }
        // for(int x[]: c)
        // {
        //     for (int y:x)
        //     {
        //     System.out.print(y +" ");
        //     }
        //     System.out.println(" ");
        // }


    // }
    //MAXIMUM 
    /* 
    static int Max( int x,int y)
    {
        if ( x > y )    return x; 
        else            return y; 
    }
    public static void main(String[] args) {
        int x =  10;
        int y = 15;
        int c;
        c = Max( x , y );
        System.out.println(c);
    }                                                                                                                                        1  */


    //no. is prime or not
    /* 
    static Boolean isPrime(int n)
    {
        for (int i = 2 ; i <= n/2 ; i++)
        {
            if (n%i == 0)
            {
                return false;    
            }

        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(isPrime(num));

    }                                                                                                                                   2 */
    //gcd or hcf 
/* 
    static int hcf(int m , int n )
    {
        while(m!=n)
        {
            if (m<n){ n= n-m; }
            else { m = m-n; }
        }
        return m; //m or n anyone works cuz they will be equal ti end the while loop
    }
    public static void main(String[] args) {
        System.out.println(hcf(10,5));
    }                                                                                                                                   3   */
    


    }

}
