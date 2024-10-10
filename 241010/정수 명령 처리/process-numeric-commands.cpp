#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<int> s;   // 빈 스택 추가
    int n;
    cin >> n;
    for (int i = 0; i < n; i++) {
        string order;
        cin >> order;
        if (order == "push") {
            int a;
            cin >> a;
            s.push(a);
        }
        else if(order == "pop") {
            cout << s.top() << endl;
            s.pop();
        }
        else if(order == "size") {
            cout << s.size() << endl;
        }
        else if(order == "empty") {
            if (s.empty()) cout << 1 << endl;
            else cout << 0 << endl;
        }
        else if (order == "top") {
            cout << s.top() << endl;
        }
    }
    return 0;
}