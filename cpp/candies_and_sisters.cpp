/*

There are two sisters Alice and Betty. You have 𝑛 candies. You want to distribute these n candies 
between two sisters in such a way that:

Alice will get a (a>0) candies;
Betty will get b (b>0) candies;
each sister will get some integer number of candies;
Alice will get a greater amount of candies than Betty (i.e. a>b);
all the candies will be given to one of two sisters (i.e. a+b=n).
Your task is to calculate the number of ways to distribute exactly n candies between sisters in a way 
described above. Candies are indistinguishable.

Formally, find the number of ways to represent n as the sum of n=a+b, where a and b are 
positive integers and a>b.

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

int calculate_distributions(int num_of_candies){

	if(num_of_candies==1 || num_of_candies==2){
		return 0;
	}

	// num of candies is odd
	if(num_of_candies%2==1){
		return num_of_candies/2;
	}

	// num of candies is even
	if(num_of_candies%2==0){
		return num_of_candies/2-1; 
	}

}

int main(){
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){

		int n;	// number of candies
		int result;

		cin>>n;
		result=calculate_distributions(n);

		cout<<result<<"\n";
	}

	return 0;
}
