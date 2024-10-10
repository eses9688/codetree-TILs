#include <iostream>
#include <stack>
using namespace std;

int main() {
    stack<string> s;    // 빈 스택 추가
    string answer = "";
    string str;         // str 배열 입력받음
    cin >> str;
    for (int i = 0; i< str.size(); i++) {
        if (str[i] == '(') {    // str[i]에 '('가 있는 경우
            s.push("(");        // 스택에 ( 추가
        }
        else {                  // '('가 없는 경우 = ')'인 경우
            if (s.empty() == true) {    // 스택이 비어 있는 경우
                answer = "No";
                break;           // No 출력
            }
            s.pop();            // 
        }
    }
    if (answer == "") {
        if (s.empty() == false) {
            answer = "No";
        }
        else{
            answer = "Yes";
        }
    }
    cout << answer;

    return 0;
}