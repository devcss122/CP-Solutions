/*

You have array of n numbers a1,a2,…,an. Rearrange these numbers to satisfy |a1−a2|≤|a2−a3|≤... 
where |x| denotes absolute value of x. It's always possible to find such rearrangement.

The first line contains a single integer t (1≤t≤104) — the number of test cases. The first line of 
each test case contains single integer n (3≤n≤105) — the length of array a. It is guaranteed that 
the sum of values of n over all test cases in the input does not exceed 105.

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

bool greater_num(int a, int b){
	return a>=b;
}

bool adjacent_differences_check(std::vector<int> inputs){

	int a1, a2; 
	int differences=-1; // initialize

	for(int i=0; i<inputs.size()-1; i++){

		int a1=inputs[i];
		int a2=inputs[i+1];

		if(differences==-1){
			differences=abs(a2-a1);
		}

		else{

			// check if current difference is less than previous
			if(abs(a2-a1)<differences){
				return false;
			}
			// update difference
			else{
				differences=abs(a2-a1);
			}
		}

	}

	return true;
}

std::vector<int> sorted_differences(std::vector<int> inputs){

	std::vector<int> result;

/*	
	We solve this by generating pairs of inputs by sorting them in 
	ascending and decending order.For example, (8 6 5 5 4 -2) and (-2 4 5 5 6 8)
	So, -2 must be paired with 8, 6 paired with 4, 5 with 5 and so on.

	also, it is given that |a1−a2|≤|a2−a3|, so we have to generate pairs in the 
	order small-big, big-small, small-big ...... or vice versa

	My pairing approach is correct, but I still haven't quite fixed the issue about
	ordering the gaps "between" the pairs, which is probably why I am getting error
	in the third test, which has 100000 negative numbers.

	Basically, my solution is correct but it is not complete as I am solving for

	|a1−a2|≤|a3−a4|≤|a5−a6|≤|a7−a8|

	but not

	|a1−a2|≤|a2−a3|≤|a3−a4|≤|a4−a5|

*/

	sort(inputs.begin(), inputs.end());

	// check if sorted inputs already fulfills criteria
	if(adjacent_differences_check(inputs)){
		return inputs;
	}

	bool flag=true;

	for(int i=inputs.size()/2-1; i>=0; i--){

		int big, small;

		if(greater_num(inputs[i],inputs[inputs.size()-i-1])){
			big=inputs[i];
			small=inputs[inputs.size()-i-1];
		}
		else{
			small=inputs[i];
			big=inputs[inputs.size()-i-1];
		}

		// if flag is true, store bigger first
		if(flag){
			result.push_back(big);
			result.push_back(small);

			flag=false; // reset flag
		}

		else{
			result.push_back(small);
			result.push_back(big);

			flag=true;
		}

	}

	return result;
}

int main(){
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){

		int n;
		cin>>n;

		std::vector<int> input_vec;
		std::vector<int> output_vec;

		for(int j=0; j<n; j++){
			int item;
			cin>>item;

			input_vec.push_back(item);
		}

		output_vec=sorted_differences(input_vec);

		for(int num: output_vec){
			cout<<num<<" ";
		}

		cout<<"\n";
	}

	return 0;
}
