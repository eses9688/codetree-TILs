#include <iostream>
using namespace std;

// 함수: 피벗 선택 (low, mid, high 중 중앙값 선택)
int select_pivot(int arr[], int low, int high) {
    int mid = low + (high - low) / 2;
    // low, mid, high 값 비교하여 중앙값 계산
    if ((arr[low] > arr[mid]) != (arr[low] > arr[high])) {
        return low; // low가 중앙값
    } else if ((arr[mid] > arr[low]) != (arr[mid] > arr[high])) {
        return mid; // mid가 중앙값
    } else {
        return high; // high가 중앙값
    }
}

// 함수: 분할 (Partition)
int partition(int arr[], int low, int high) {
    int pivotIndex = select_pivot(arr, low, high); // 피벗 인덱스 선택
    int pivot = arr[pivotIndex];
    swap(arr[pivotIndex], arr[high]); // 피벗을 배열 끝으로 이동

    int i = low - 1; // 작은 값들의 마지막 위치
    for (int j = low; j < high; j++) {
        if (arr[j] < pivot) {
            i++;
            swap(arr[i], arr[j]); // i와 j 교환
        }
    }
    swap(arr[i + 1], arr[high]); // 피벗을 적절한 위치로 이동
    return i + 1; // 피벗 위치 반환
}

// 함수: 퀵 정렬 (Quick Sort)
void quick_sort(int arr[], int low, int high) {
    if (low < high) {
        int pos = partition(arr, low, high); // 분할 수행
        quick_sort(arr, low, pos - 1);       // 왼쪽 부분 배열 정렬
        quick_sort(arr, pos + 1, high);     // 오른쪽 부분 배열 정렬
    }
}

int main() {
    int n;
    // 입력
    cin >> n;
    int arr[n];
    for (int i = 0; i < n; i++){
        cin >> arr[i];
    }
    // 퀵 정렬 메서드 호출
    quick_sort(arr, 0, n - 1);

    // 출력
    for (int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }

    return 0;
}