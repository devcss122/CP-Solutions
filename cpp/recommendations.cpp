/*

A news recommendation system daily selects interesting publications of one of n disjoint categories 
for each user. Each publication belongs to exactly one category. For each category 𝑖 batch algorithm selects 
ai publications.

The first line of input consists of single integer n — the number of news categories (1≤n≤200000).

The second line of input consists of n integers ai — the number of publications of i-th category selected 
by the batch algorithm

The third line of input consists of n integers ti — time it takes for targeted algorithm to find one 
new publication of category i

We have to find the minimal required time for the targeted algorithm to get rid of categories with the same size.


Input:

5
3 7 9 7 8
5 2 5 7 5

5
1 2 3 4 5
1 1 1 1 1

Output:

8 // distribution will be [4,11,10,8,9]
0 // distibution is already unique


Note- For the first test case, the answer is actually listed as 6 as that will add 3 new publications to 
the second publication, making its count 10. But I believe it is incorrect because it doesn't take into 
consideration the fact that other numbers will increase too. So at t=6, the distribution becomes 
[3,10,10,7,9].

But at t=8 is the smallest possible time period we can add where we get a unique distribution of 
[4,11,10,8,9].

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



bool isUnique(std::vector<int> vec){

	set<int> s(vec.begin(), vec.end());

	return  vec.size()==s.size();

}


int minimal_time(int categories, std::vector<int> magazines, std::vector<int> time){


	if(isUnique(magazines)){
		return 0;
	}

	else{

		int extra_time=1;

		while(true){

			std::vector<int> temp_vec;  // reinitialize at every iteration

			for(int i=0; i<categories; i++){

				int new_publications=extra_time/time[i];
				temp_vec.push_back(magazines[i]+new_publications);
			}

			// break the loop the moment we get a unique distribution
			if(isUnique(temp_vec)){
				break;
			}

			extra_time++;
		}

		return extra_time;
	}

}

int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_categories;
	int result=-1;
	std::vector<int> magazines_vec;
	std::vector<int> time_vec;

	cin>>num_categories;

	for(int i=0;i<num_categories;i++){

		int batch_size;
		cin>>batch_size;

		magazines_vec.push_back(batch_size);
	}

	for(int j=0;j<num_categories;j++){

		int time_taken;

		cin>>time_taken;
		time_vec.push_back(time_taken);
	}

	result=minimal_time(num_categories,magazines_vec,time_vec);

	cout<<result<<"\n";

	return 0;
}
