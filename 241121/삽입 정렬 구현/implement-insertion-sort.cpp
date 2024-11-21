#include <iostream>
using namespace std;

int main() {
    int n;
    cin >> n;
    int arr[n];
    // 입력
    for (int i = 0; i < n; i++){
      cin >> arr[i];
    }
    // 삽입 정렬
    for (int i = 0; i < n; i++){
      int j = i - 1;
      int key = arr[i];
      while (j >= 0 && arr[j] > key){
        arr[j + 1] = arr[j];
        j--;
      }
      arr[j + 1] = key;
    }
    // 출력 
    for (int i = 0; i < n; i++){
      cout << arr[i] << " ";
    }
    return 0;
}