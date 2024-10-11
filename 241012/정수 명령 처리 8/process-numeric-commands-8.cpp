#include <iostream>
#include <list>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    list<int> s;
    int r, n;
    string order;
    cin >> r;
    for (int i = 0; i < r; i++) {
        cin >> order;
        if (order == "push_front") {
            cin >> n;
            s.push_front(n);
        }
        else if (order == "push_back") {
            cin >> n;
            s.push_back(n);
        }
        else if (order == "pop_front") {
            cout << s.front() << endl;
            s.pop_front();
        }
        else if (order == "pop_back") {
            cout << s.back() << endl;
            s.pop_back();
        }
        else if (order == "size") {
            cout << s.size() << endl;
        }
        else if (order == "empty") {
            if (s.size() == 0) {
                cout << 1 << endl;
            }
            else {
                cout << 0 << endl;
            }
        }
        else if (order == "front") {
            cout << s.front() << endl;
        }
        else if (order == "back") {
            cout << s.back() << endl;
        }
    }
    return 0;
}