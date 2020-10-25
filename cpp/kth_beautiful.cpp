/* 
For the given integer n (n>2) let's write down all the strings of length n which
contain n−2 letters 'a' and two letters 'b' in lexicographical (alphabetical) order.
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


void generate_permutation(unsigned long long int n, unsigned long long int k, char* c){

	char a='a';
	char b='b';

	unsigned long long int num_permutations=(k*(k-1))/2;

	// this loop generates the 1st string that satisfies 
	// the conditon n-2 letters 'a' and 2 letters 'b'

	for(int i=0; i<n; i++){

		if(i<n-2){
			c[i]=a;
		}

		else{
			c[i]=b;
		}
	}

	do{

		k--;
		if(k==0){
			break;
		}

	}while(std::next_permutation(c,c+n));

}


int main(){

	std::ios_base::sync_with_stdio(false); std::cin.tie(0); std::cout.tie(0);

	// Dynamically allocating arrays is required when your dimensions are given at runtime
	// std::vector is already a wrapper around this process

	int num_test_cases;
	std::vector<std::string> vec;

	cin>>num_test_cases;

	for(int i=0;i<num_test_cases;i++){

		unsigned long long int n,k;  // 3<=n<=10^5  and 1<=k<=min(2,10^9,n*(n-1)/2)
		char* c;  // create pointer

		cin>>n>>k;

		c=new char[n];   // allocate a block of memory to c
		generate_permutation(n,k,c);

		string str(c,c+n);

		vec.push_back(str); // store in vector

		delete[] c; //deallocate the memory

	}

	for (string s : vec){
		cout<<s<<"\n";
	}

	return 0;
}