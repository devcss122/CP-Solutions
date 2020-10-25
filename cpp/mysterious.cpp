/*

Chain here is such a sequence of envelopes A = {a1,  a2,  ...,  an}, where the width and 
the height of the i-th envelope is strictly higher than the width and the height of the 
(i  -  1)th envelope respectively. Chain size is the number of envelopes in the chain.

We have to make the chain of the maximum size from the envelopes, such that we will be able
to put a card into it. The card fits into the chain if its width and height is lower than the 
width and the height of the smallest envelope in the chain respectively.

author: https://github.com/Waqar-107 

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

struct env
{
	int w, h, idx;
	env() {}
	env(int w, int h, int idx) {
		this->w = w;
		this->h = h;
		this->idx = idx;
	}
};

bool cmp(env a, env b) {
	if (a.w == b.w)
		return a.h < b.h;

	return a.w < b.w;
}

int w, h;
vector<env> vec;
int dp[N];
int parent[N];

int main()
{
	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);
	
  	int i, j, k;
	int n, m;

	cin>>n>>w>>h;

	for (i = 1; i <= n; i++)
	{

		cin>>j>>k;
		if (j > w && k > h)
			vec.push_back(env(j, k, i));
	}

	if (vec.size() == 0) {
		cout<<"0"<<endl;
		return 0;
	}

	sort(vec.begin(), vec.end(), cmp);

	n = vec.size();

	memset(dp, 0, sizeof(dp));
	memset(parent, -1, sizeof(parent));

	dp[0] = 1;
	for (i = 1; i < n; i++)
	{
		for (j = i - 1; j >= 0; j--)
		{
			if (vec[j].w < vec[i].w && vec[j].h < vec[i].h)
			{
				if (1 + dp[j] > dp[i])
				{
					dp[i] = 1 + dp[j];
					parent[i] = j;
				}
			}
		}

		if (!dp[i])dp[i] = 1;
	}

	int mx = 1; k = 0;
	for (i = 1; i < n; i++)
	{
		if (dp[i] > mx)
			mx = dp[i], k = i;
	}


	cout<<mx<<endl;

	vector<int> ans; ans.push_back(vec[k].idx);
	while (1)
	{
		k = parent[k];
		if (k == -1)break;

		ans.push_back(vec[k].idx);
	}

	reverse(ans.begin(), ans.end());
	for (int e : ans)
		cout<<e<<endl;

	return 0;
}
