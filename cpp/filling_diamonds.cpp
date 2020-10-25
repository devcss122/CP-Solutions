/*
You have integer n. Calculate how many ways are there to fully cover belt-like area of 4n−2 triangles 
with diamond shapes.

Diamond shape consists of two triangles. You can move, rotate or flip the shape, but you cannot scale it.
2 coverings are different if some 2 triangles are covered by the same diamond shape in one of them and 
by different diamond shapes in the other one.

n=1, triangles=2, diamonds=1, ways=1 (0!)
n=2, triangles=6, diamonds=3, ways=2 (2!)
n=3, triangles=10, diamonds=5, ways=24 (4!)

We basically have to rearrange diamonds in order, and n items can be arranged in n! ways. Initially, 
the order is not enforced as the figure is symmetrical. But the moment we insert 1 diamond, symmetry is
lost and order is enforced. But in this case, 1 item is sacrificed so that order is enforced. So we 
can arrange n diamonds in (n-1)! ways.
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

using namespace std;


// you can move, rotate or flip the shape, but you cannot scale it.
int calculate_ways(int n){

	int num_triangles=(4*n)-2; //  there are 4n−2 triangles for integer n
	int num_diamonds=num_triangles/2;

	// calculate factorial of (num_diamonds-1)

	int result=1;

	for(int i = 1; i <num_diamonds; ++i)
    {
        result *= i;
    }

    return result;
}

int main(){
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){
		int n, result;
		cin>>n;

		result=calculate_ways(n);

		cout<<result<<"\n";
	}

	return 0;
}
