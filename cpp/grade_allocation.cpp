/*

n students are taking an exam. The highest possible score at this exam is m. Let ai be the score 
of the i-th student. You have access to the school database which stores the results of all students.

You can change each student's score as long as the following conditions are satisfied:

All scores are integers

1. 0≤ai≤m
2. The average score of the class doesn't change.
3. You are student 1 and you would like to maximize your own score.

Find the highest possible score you can assign to yourself such that all conditions are satisfied.

Input:

2
4 10
1 2 3 4
4 5
1 2 3 4

Output:

10    // [10,0,0,0]
5	  // [5,3,1,1]

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


int highest_score(int num_students, std::vector<int> scores_vec, int max_score, int score_sum){

	int highest_score=-1; // initialized with -1

	/*
		Average is basically sum of scores divided by number of scores. As number of scores is 
		fixed (no student will disappear), we will have to increase/decrease scores with a greedy 
		algorithm such that the sum of the numbers is fixed and the maximum score that 
		can be achieved is not violated. Since we have the total score, we don't even 
		need to iterate the whole loop again

	*/

	if(max_score<=score_sum){
		highest_score=max_score;
		score_sum-=max_score;
	}

	else{
		highest_score=score_sum;
		score_sum-=score_sum;
	}

	return highest_score;

}

int main(){
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases;
	cin>>num_test_cases;

	for(int i=0; i<num_test_cases; i++){

		// number of students and highest possible score
		int n,m;
		std::vector<int> student_score;

		cin>>n>>m;

		int score_sum=0;

		for(int j=0; j<n; j++){

			int score;

			cin>>score;
			student_score.push_back(score);
			score_sum+=score;
		}

		int result=highest_score(n,student_score,m,score_sum);

		cout<<result<<"\n";

	}

	return 0;
}
