/*

The first line of input is the total number of test cases. In the first line of each test case, 
you are given two integers, n and x. In the second line, you are given a list of n integers 
which denotes the ranking achieved in that particular round.

We have to find the largest v the person can collect all places from 1 to v after x or more contests.

Input: 

3
6 2
3 1 1 5 7 10
1 100
100
4 57
20 40 60 80

Output:

5
101
60

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


int generate_v(set<int> rankings, int x){

    int counter=1;

    while(true){
        const bool is_in=rankings.find(counter) !=rankings.end();

        // if number not in set, then the extra games will be utilized
        if(!is_in){
        	if(x==0){
        		break;
        	}
        	x--;
        }

        counter++;
    }

    // this loop may generates an extra increment if last number is not in set

    if(rankings.count(counter)){
        return counter;
    }

    return --counter;

}

set<int> remove_duplicates(priority_queue<int, vector<int>, greater<int> > gq) 
{

    priority_queue<int, vector<int>, greater<int> >g = gq;
    set<int> rankings_set;

    // add to a set to remove duplicates
    while(!g.empty())
    {

        int item=g.top();

        rankings_set.insert(item);

        g.pop();
    }

    return rankings_set;

} 

int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){

		int n, x;

        int v=0; // initialized

		priority_queue<int, vector<int>, greater<int> >ranking_pq;
        set<int> rankings_set;

		std::vector<int> result;

		cin>>n>>x;

		// collect all rankings and add to priority queue
		for(int j=0; j<n; j++){

			int ranking;

			cin>>ranking;
			ranking_pq.push(ranking);
		}

        rankings_set=remove_duplicates(ranking_pq);
        v=generate_v(rankings_set,x);
        cout<<v<<"\n";
	}

	return 0;
}

