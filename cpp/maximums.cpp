/*

For an array, a1,a2,...,an, of non-negative integers. For each 1<=𝑖<=n, we have to find a non-negative 
integer xi=max(0,a1,...,ai-1). Note that for i=1, xi=0.

So for input a={0,1,2,0,3}, output should be x={0,0,1,2,2}

Then we calculate bi=ai-xi. So, we get b={0-0,1-0,2-0,0-2,3-2}={0,1,2,-2,1}.

In the problem, we are given the array b, and we have to restore the array a.

*/

#define _CRT_SECURE_NO_WARNINGS

#include<algorithm>
#include<cctype>
#include<cmath>
#include<cstdio>
#include<cstdlib>
#include<cstring>
#include<functional>
#include<iomanip>
#include<iostream>
#include<list>
#include<map>
#include<numeric>
#include<queue>
#include<set>
#include<stack>
#include<string>
#include<utility>
#include<vector>

#include<valarray>

#define N 5010

using namespace std;


int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_items;

	cin>>num_items;
	

	int array_b[num_items];

	vector<int> array_x;
	vector<int> array_a;

	// Input Array B
	for(int i=0; i<num_items; i++){

		int inp;

		cin>>inp;
		array_b[i]=inp;
	}


	// Calculate Array A

	for (int i = 0; i < num_items; i++)
	{
		/* ai=bi+xi */

		if(i==0)
		{
			array_x.push_back(0);     		 //x1=0
			array_a.push_back(array_b[i]+0);  //a1=b1+x1=b1+0=b1
		}

 		/* Find max(0,a1,a2,ai-1)*/

		else{

			// declaring iterator to a vector 
			vector<int>::iterator ptr;

			int mx=0;

			// xi=max(0,a1,a2..ai-1)
			for(ptr = array_a.begin(); ptr < array_a.end(); ptr++){

				if(*ptr>mx){
					mx=*ptr;
				}

			}

			// xi=max(0,a1,a2..ai-1)

			array_x.push_back(mx);
			array_a.push_back(array_b[i]+array_x[i]);
	
		}

	}


	for(int n: array_a)
		cout<<n<<" ";
	cout<<"\n";

	return 0;
}
