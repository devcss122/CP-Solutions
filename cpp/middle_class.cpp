/*

Many years ago Berland was a small country where only 𝑛 people lived. Each person had some savings: the 
i-th one had ai burles. The government considered a person as wealthy if he had at least X burles. To 
increase the number of wealthy people Berland decided to carry out several reforms. Each reform looked 
like that-

1. the government chooses some subset of people (maybe all of them);
2. the government takes all savings from the chosen people and redistributes the savings among the 
chosen people equally.

Input:
The first line contains single integer T (1≤T≤1000) — the number of test cases. Next 2T lines contain the 
test cases — two lines per test case. The first line contains two integers n and x (1≤n≤105, 1≤x≤109)
— the number of people and the minimum amount of money to be considered as wealthy. The second line 
contains n integers a1,a2, ..., an (1≤ai≤109) — the initial savings of each person. It's guaranteed that 
the total sum of 𝑛 doesn't exceed 105.

Output:
Print T integers — one per test case. For each test case print the maximum possible number of wealthy 
people after several (maybe zero) reforms.

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

int generate_max_wealthy(std::vector<double> savings, int min_wealth){

	// we have to use a greedy algorithm

	// sort by decreasing order of wealth and select the most wealthiest subset possible
	// that will generate the most possible wealth which can then be divided equally

    sort(savings.begin(), savings.end(), greater<int>());

    int result=0; // initialize
    
    int total_wealth;
    double average_wealth;

    for(int i=0; i<savings.size(); i++){

    	total_wealth=0;
    	average_wealth=0;

    	for(int j=0; j<=i; j++){
    		total_wealth+=savings[j];
    	}

    	int num_people=i+1;
    	average_wealth=total_wealth/num_people;

    	if(average_wealth<min_wealth){

    		return result; // this is breaking point and returns earlier result
    	}

    	// update result
    	result++;

    }

    return result;

}

int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){

		int n, x; // the number of people and the minimum amount of money to be considered as wealthy
		cin>>n>>x; 

		int max_wealthy=0;
		std::vector<double> savings_vec;

		for(int j=0; j<n; j++){

			int saving;
			cin>>saving;

			savings_vec.push_back(saving);
		}

		max_wealthy=generate_max_wealthy(savings_vec,x);
		cout<<max_wealthy<<"\n";

	}
	return 0;
}	
