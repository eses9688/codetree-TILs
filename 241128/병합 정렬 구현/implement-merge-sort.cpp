#include <iostream>
using namespace std;

void merge_sort(int arr[], int low, int high) {
    if (low < high) {
        int mid = low + (high - low) / 2;

        // 왼쪽과 오른쪽 부분 배열을 각각 병합 정렬
        merge_sort(arr, low, mid);
        merge_sort(arr, mid + 1, high);

        // 병합
        int n1 = mid - low + 1;
        int n2 = high - mid;

        int left[n1], right[n2];

        // 왼쪽 부분 배열 복사
        for (int i = 0; i < n1; i++) {
            left[i] = arr[low + i];
        }
        // 오른쪽 부분 배열 복사
        for (int i = 0; i < n2; i++) {
            right[i] = arr[mid + 1 + i];
        }

        // 병합
        int i = 0, j = 0, k = low;
        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k] = left[i];
                i++;
            } else {
                arr[k] = right[j];
                j++;
            }
            k++;
        }

        // 남은 왼쪽 배열 복사
        while (i < n1) {
            arr[k] = left[i];
            i++;
            k++;
        }

        // 남은 오른쪽 배열 복사
        while (j < n2) {
            arr[k] = right[j];
            j++;
            k++;
        }
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
    // 병합 정렬 메서드 호출
    merge_sort(arr, 0, n - 1);

    // 출력
    for (int i = 0; i < n; i++){
        cout << arr[i] << " ";
    }

    return 0;
}