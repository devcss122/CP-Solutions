/*
The first line contains a single integer T (1≤T≤500) — the number of test cases.

The first line of each test case contains a single integer n (1≤n≤100) — the number of moments of time 
Polycarp peeked at the stats. Each of the next n lines contains two integers pi and ci (0≤pi,ci≤1000) — the number of plays and the 
number of clears of the level at the 𝑖-th moment of time.

For each test case print a single line. If there could exist such a sequence of plays (and clears, 
respectively) that the stats were exactly as Polycarp has written down, then print "YES".
Otherwise, print "NO".

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


struct GamePair
{
	int plays, clears;
	GamePair() {}
	GamePair(int p, int c) {
		this->plays = p;
		this->clears = c;
	}
};


bool validate_games(std::vector<GamePair> games){

	auto it=games.begin();

	// initialize previous stats
	int previous_plays=it->plays;;
	int previous_clears=it->clears;

	for(;it!=games.end(); it++){

		// number of clears cannot be more than number of plays
		if(it->clears>it->plays){
			return false;
		}

		// number of plays or number of clears cannot decrease
		if(it->plays<previous_plays || it->clears<previous_clears){
			return false;
		}

		// update previous
		previous_plays=it->plays;
		previous_clears=it->clears;

	}

	return true;
}

int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){

		int n;
		bool result;

		cin>>n; // number of peeks

		std::vector<GamePair> games_vec;

		for(int j=0; j<n; j++){

			int p, c;
			cin>>p>>c;  // the number of plays and the number of clears of the level 
						// at the i-th moment of time.

			GamePair GP(p,c);
			games_vec.push_back(GP);
		}

		result=validate_games(games_vec);

		if(result){
			cout<<"YES"<<"\n";
		}
		else{
			cout<<"NO"<<"\n";
		}
	}

	return 0;
}
