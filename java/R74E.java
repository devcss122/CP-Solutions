import java.util.Scanner;

/**
 * E. Keyboard Purchase
time limit per test1 second
 */
public class R74E
{
    final int M = 1<<20;
    final int N= 100050;
    long dp[] = new long[M];
    char[] s = new char[N];
    int cnt[][] = new int[20][20];
    
    void run()
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() , m = sc.nextInt();
        s = sc.next().toCharArray();
        for(int i=1;i<n;i++)
        { 
            if(s[i]!=s[i+1]) 
                cnt[s[i]-'a'][s[i+1]-'a']++;cnt[s[i+1]-'a'][s[i]-'a']++;
        }
        for(int i=0;i<m;i++) 
            for(int j=0;j<m;j++) 
                dp[1<<i]-=cnt[i][j];
        
        for(int mask=1;mask<(1<<m);mask++) 

        if(Integer.bitCount(mask)!=1)
	    {
		int pc=Integer.bitCount(mask);
		dp[mask]=(long)9e18;
        for(int i=0;i<m;i++) 
        if((mask>>i&1 )==1)
		{
			long sum=dp[mask^(1<<i)];
			for(int j=0;j<m;j++)
			{
                if((mask>>j&1)==1)
                 sum+=cnt[i][j]*pc;
				else sum-=cnt[i][j]*pc;
			}
			dp[mask]=Math.min(dp[mask],sum);
		}
	}
	System.out.printf("%d\n",dp[(1<<m)-1]);

    }
    public static void main(String[] args)
    {
        new R74E().run();    
    }
}