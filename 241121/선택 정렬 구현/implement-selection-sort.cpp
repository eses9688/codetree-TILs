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
    for (int i = 0; i < n - 1; i++){
        int min = i;
        for (int j = i; j < n; j++){
            if (arr[j] < arr[min]){
                min = j;
            }
        }
        tmp = arr[i];
        arr[i] = arr[min];
        arr[min] = tmp;
    }
    // 출력 
    for (int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }
    return 0;
}