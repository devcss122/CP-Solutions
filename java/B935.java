//prob 935 B Fafa
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

public class B935 {
    public static int get(String t) {
        return Integer.parseInt(t);
    }

    // Function<String,Integer> f = e->{ Integer.parseInt(e); };
    public static void main(String[] args) throws IOException {
        PrintStream p = System.out;
        BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
        int n = get(b.readLine());
        String val = b.readLine();

        //
        // (0,0) -> U -> (0,1)
        // (0,0) -> R -> (1,0)
        //
        int current_x = 0, current_y = 0;
        int silver_coins = 0;
        int side=-1;
        int last_side=-1;
        for (int i = 0; i < n-1; i++)
        {

            // int last_side = -1;
            if (val.charAt(i) == 'U' )
                {
                    current_y++; 
                    // side =0;
                    // side= (side == -1 )? 0:;

                }
            else if (val.charAt(i) == 'R' )
                {
                    current_x++;

                    // side= (side == -1 )? 1:side;
                }
            // if(current_x < current_y )
            //     side =0 ;
            // else if(current_x > current_y)
            //     side =1;    
            // last_side = side;
            // side = current_x > current_y ? 1:0; 
               
            if ( current_x == current_y )
            {
                if(val.charAt(i) == 'R' && val.charAt(i+1) == 'R') silver_coins++;
                if(val.charAt(i) == 'U' && val.charAt(i+1) == 'U') silver_coins++;
                
                // silver_coins++;
                // side =-1;
                // last_side = side;
                // side =-1;
                // p.println(current_x+" "+current_y+" "+ side);
            }
            // p.printf("%d %d %d %d \n", current_x,current_y,side,last_side);
        }
        p.println(silver_coins);
    }
}