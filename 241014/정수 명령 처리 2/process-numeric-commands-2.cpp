#include <iostream>
#include <queue>
using namespace std;

int main() {
    queue<int> q;
    int n;
    string order;
    cin >> n;
    for (int i = 0; i < n; i++) {
        cin >> order;
        if (order == "push") {
            int k;
            cin >> k;
            q.push(k);
        }
        else if (order == "pop") {
            cout << q.front() << endl;
            q.pop();
        }
        else if (order == "size") {
            cout << q.size() << endl;
        }
        else if (order == "empty") {
            if (q.size() == 0) {
                cout << 1 << endl;
            }
            else {
                cout << 0 << endl;
            }
        }
        else if (order == "front") {
            cout << q.front() << endl;
        }
    }

    return 0;
}