#include <iostream>
#include <list>
using namespace std;

int main() {
    list<char> l; // 빈 리스트 선언
    list<char>::iterator it; // iterator 선언
    it = l.end(); // 모든 빵의 맨 마지막 다음 위치를 가리킴
    int n, m;
    char order, r, a;
    cin >> n; // 식빵의 개수 입력
    cin >> m; // 레시피 암호문의 개수 입력
    for (int i = 0; i < n; i++){ // 식빵에 적힐 알파벳 입력 받아서 리스트에 저장
        cin >> order;
        l.push_back(order);
    }
    for (int i = 0; i < m; i++){ // 레시피 입력
        cin >> r;
        if (r == 'L'){ // 가리키는 위치를 하나 앞으로 이동
            it--;
        }
        else if(r == 'R'){ // 가리키는 위치를 하나 뒤로 이동
            if(it == l.end()){ // 이미 맨 뒤라면 무시
                continue;
            }
            it++;
        }
        else if(r == 'D'){ // 가리키는 위치의 뒤의 빵을 제거
            it = l.erase(it); // 제거
        }
        else if(r == 'P'){ // 가리키는 위치에 식빵 삽입
            cin >> a ; // 문자를 입력 받아서 a에 저장
            it = l.insert(it, a); // 입력받은 문자를 추가함
            it++;
        }
    }
    // 출력
    for(it = l.begin(); it != l.end(); it++){
        cout << *it;
    }
    return 0;
}