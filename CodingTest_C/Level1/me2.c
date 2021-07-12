#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(int a, int b) {
    long long answer = 0;
    if (a > b) {
        // a�� b���� ũ��, ���� �ٲ��ش�.
        int temp = a;
        a = b;
        b = temp;
    }
    for (int i = a; i <= b; i++)
        answer += i;
    return answer;
}

int main() {
    //long long�� %lld�� ���
    printf("%lld\n", solution(3, 5));
    printf("%lld\n", solution(3, 3));
    printf("%lld\n", solution(5, 3));

    return 0;
}