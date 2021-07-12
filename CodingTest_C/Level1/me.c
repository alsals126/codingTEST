#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

long long solution(long long n) {
    long long answer = 0;

    for (answer = 0; answer <= n; answer++)
        if (answer * answer == n)
            return (answer + 1) * (answer + 1);
    return -1;
}

int main() {
    //char, short, int는 %d로 출력
    //long은 %ld로 출력
    //long long은 %lld로 출력
    printf("%lld\n", solution(121));
    printf("%lld", solution(3));

    return 0;
}