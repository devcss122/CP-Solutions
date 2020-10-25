/*

Position of Alice is (x,y). And the cat can talk a steps left, b steps right, c steps down, 
d steps up. So afte the walk of a+b+c+d unit moves, Alice hopes that her cat is always in the 
area [x1,x2]×[y1,y2], i.e. for every cat's position (u,v) of a walk x1≤u≤x2 and y1≤v≤y2 holds.

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

struct position
{
	long long int x,y;

	position() {}
	position(long long int x, long long int y) {
		this->x = x; // x-coordinate
		this->y = y; // y-coordinate
	}
};

struct moves
{
	unsigned long long int a,b,c,d;

	moves() {}
	moves(unsigned long long int a, unsigned long long int b, unsigned long long int c, unsigned long long int d) {
		this->a = a; // left
		this->b = b; // right
		this->c = c; // down
		this->d = d; // up
	}
};


bool check_moves(position start, position upper_limit, position lower_limit, moves mv){

	unsigned long long int total_length=(upper_limit.x-start.x)+(start.x-lower_limit.x);
	unsigned long long int total_breadth=(upper_limit.y-start.y)+(start.y-lower_limit.y);

	unsigned long long int net_movement_x=abs(long(long(int(mv.b-mv.a))));
	unsigned long long int net_movement_y=abs(long(long(int(mv.d-mv.c))));

	// cat should always be in the area [x1,x2]×[y1,y2] 
	// so x1≤u≤x2 and y1≤v≤y2 should always be true

	// but we only need to find if only one such move exists

	// there is no x-axis or y-axis
	// but it is guaranteed that a+b+c+d>=1
	if(total_length==0 && total_breadth==0){
		return false;
	}

	//total movement is in acceptable range, so there could be one such move
 	if(net_movement_x<=total_length && net_movement_y<=total_breadth){

 		// there is no x-axis, but there are left and right movements 
 		if(total_length==0){
 			if(mv.a!=0 && mv.b!=0){
 				return false;
 			}
 		}

 		// there is no y-axis, but there are up and down movements 
 		if(total_breadth==0){
 			if(mv.c!=0 && mv.d!=0){
 				return false;
 			}
 		}

 		long long int final_x=long(long(int(start.x+mv.b-mv.a)));
 		long long int final_y=long(long(int(start.y+mv.d-mv.c)));

 		// check if final_x position is outside acceptable range
 		if(upper_limit.x<final_x || final_x<lower_limit.x){
 			return false;
 		}

 		// check if final_y position is in acceptable range
 		if(upper_limit.y<final_y || final_y<lower_limit.y){
 			return false;
 		}

 		return true;
 	}

 	// No move exists as as no movements are not in acceptable range
 	else{
 		return false;
 	}

}

int main(){

	ios_base::sync_with_stdio(0); cin.tie(0); cout.tie(0);

	unsigned short int num_test_cases;
	cin>>num_test_cases;

	for(unsigned short int i=0; i<num_test_cases; i++){
		unsigned long long int a, b, c, d;
		long long int x, y, x1, y1, x2, y2;

		cin>>a>>b>>c>>d;
		cin>>x>>y>>x1>>y1>>x2>>y2;

		position start(x,y);
		position upper_limit(x2,y2);
		position lower_limit(x1,y1);
		moves mv(a,b,c,d);

		if(check_moves(start,upper_limit,lower_limit, mv)){
			cout<<"Yes"<<"\n";
		}
		else{
			cout<<"No"<<"\n";
		}

	}

	return 0;
}

