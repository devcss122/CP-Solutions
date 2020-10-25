
// You are given two positive integers a and b. In one move you can increase 𝑎 by 1 
// (replace a with a+1). Your task is to find the minimum number of moves you need to do 
// in order to make 𝑎 divisible by b. 

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

#define N 5010

using namespace std;


int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;

	cin>>num_test_cases;

	vector<int> vec;

	for(int i=0;i<num_test_cases;i++){

		int a, b;
		int c;

		cin>>a>>b;

		if(a>b){
			int r; //remainder

			r=a%b;

			if(r==0){
				c=r;  
			}

			else{
				c=b-r; // minimum steps= number - remainder
			}
		}

		else{
			c=b-a;
		}

		vec.push_back(c);
	}

	for (int e : vec){
		cout<<e<<"\n";
	}

	return 0;
}