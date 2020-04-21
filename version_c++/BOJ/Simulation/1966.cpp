#include <stdio.h>
#include <algorithm>

using namespace std;

int queue[101][2];
int doc[101];
int position = 0;
int top = 0;
int bottom = 0;
void push(int x, int y) {
	if (bottom + 1 > 100)
		bottom = 0;
	queue[bottom][0] = x;
	queue[bottom++][1] = y;
	return;
}
int pop() {
	if (top == 100) {
		top = 0;
		return 100;
	}
	return top++;
}
const bool cmp(int a, int b) {
	return a > b;
}
int main() {
	int testcase;
	int answer;
	int i, j;
	int n, k;

	scanf("%d", &testcase);
	for (i = 0; i < testcase; ++i) {
		scanf("%d %d", &n, &k);
		answer = 0;
		for (j = 0; j < 101; ++j) {
			queue[j][0] = 0;
			queue[j][1] = 0;
		}
		top = 0;
		bottom = 0;
		for (j = 0; j < n; ++j) {
			scanf("%d", &doc[j]);
			if (j == k)
				push(doc[j], 1);
			else
				push(doc[j], 0);
		}
		sort(doc, doc + n, cmp);
		for (j = 0; j < n; ++j) {
			while(1){
				int temp = pop();
				if (queue[temp][0] == doc[j]) {
					answer++;
					if (queue[temp][1] == 1)
						j = n;
					break;
				}
				else {
					push(queue[temp][0], queue[temp][1]);
				}
			}
		}
		printf("%d\n", answer);
	}

	return 0;
}