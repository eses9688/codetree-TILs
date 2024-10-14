#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    int n, k;
    cin >> n;
    cin >> k;
    for (int i = 1; i <= n; i++) {
        q.push(i);
    }
    while (!q.empty()) {
        for (int i = 0; i < k - 1; i++) {
            q.push(q.front());
            q.pop();
            }
            cout << q.front() << " ";
            q.pop();
        }
    return 0;
}

/* function solution(N, K)
	set q = empty queue
	for i = 1 ... N
		q.push(i)
	while q.size() != 1
		for i = 1 ... K - 1
			q.push(q.front())
			(2)
		q.pop();
	return q.front() */