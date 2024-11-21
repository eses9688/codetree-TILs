#include <iostream>
using namespace std;

int main() {
    int n, tmp;
    cin >> n;
    int arr[n];
    bool sorted = true;
    // 입력
    for (int i = 0; i < n; i++){
        cin >> arr[i];
    }
    // 정렬
    do {
        sorted = true;
        for (int i = 0; i < n - 1; i++){
            if (arr[i] > arr[i + 1]){
                tmp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = tmp;
                sorted = false;
            }
        }
    } while (sorted == false);
    // 출력 
    for (int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    return 0;
}