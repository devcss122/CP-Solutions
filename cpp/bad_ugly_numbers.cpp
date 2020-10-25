/*
For each test case, print an integer 𝑠 which satisfies the conditions described:
1. s>0,
2. s consists of n digits,
3. no digit in s equals 0,
4. s is not divisible by any of it's digits.
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

#define N 5010

using namespace std;

vector<int> numbers;

bool check_zero(long long int number)
{

	int zero_flag=0;

	while(number !=0){

		int temp = number % 10;
		number = number/10;

		if(temp == 0){
			zero_flag = 1;
		}
	}

	if(zero_flag==1){
       return true;
	}

	return false;
}

bool check_digits(long long int number){


	int s=number;
	while(number > 0) {

		int digit=number%10;

    	// if s is divisible by its digits
    	if(s%digit==0){
    		return true;
    	}

    	number = number / 10;
	}

	return false;
}


long long int generate_number(int digits)
{
	// 1 <= digits <= 10^5
	if(digits==1 || digits>100000 || digits<0){
		return -1;
	}
	else{

		long long int lower_limit, upper_limit;
		long long int hit=-1; 

		lower_limit=pow(10,digits-1);
		upper_limit=pow(10,digits);

		for(int i=lower_limit; i<upper_limit; i++)
		{
			// check if zero is in the numbers

			if(!check_zero(i) && !check_digits(i)){
				hit=i;
				break;
			}

		}

		return hit;
	}
}

int main()
{
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	int num_test_cases; 


	cin>>num_test_cases;

	// 1 <= num_test_cases <= 400
	if(num_test_cases>400 || num_test_cases<0){
		cout<<"-1\n";
		return 0;
	}


	for(int i=0; i<num_test_cases; i++)
	{
		int n;
		cin>>n;
		numbers.push_back(n);
	}


	for (int n: numbers)
		cout<<generate_number(n)<<endl;

	return 0;
}