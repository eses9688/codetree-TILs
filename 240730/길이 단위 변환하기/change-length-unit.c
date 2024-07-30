#include <stdio.h>

int main() {
    float a = 9.2; 
    float b = 1.3;

    printf("%.1lfft = %.1lfcm\n", a, a*30.48);
    printf("%.1lfmi = %.1lfcm", b, b*160934);
    return 0;
}