#include <iostream>
#include <vector>
using namespace std;

int main() {
    // 여기에 코드를 작성해주세요.
    vector<int> v;
    int r, n = 0;
    string order;
    cin >> r; // 횟수 입력 -> r
    for (int i = 0; i < r; i++){ // r회 반복
        cin >> order;
        if (order == "push_back") {
            cin >> n;
            v.push_back(n);
        }
        else if (order == "pop_back") {
            v.pop_back();
        }
        else if (order == "size") {
            cout << v.size() << endl;
        }
        else if (order == "get") {
            cin >> n;
            cout << v[n-1] << endl;
        }
    }
    
    return 0;
}