#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

// sqrt(), pow() 둘 다 입출력값이 double형이다.
// pow()는 x의 y제곱
// sqrt()는 제곱근
long long solution(long long n) {
    long long answer = 0; // long long형은 8바이트 (long형은 4바이트)

    // (int)sqrt(n)을 하면 소수점뒤는 없어지게 된다.
    // 그리고 sqrt(n)이랑 같은지 비교한다.
    // 만약 소수점 앞은 같은데 소수점 뒤가 0이 아니면 거르게 된다.
    if ((int)sqrt(n) == sqrt(n)) 
        answer = pow((sqrt(n) + 1), 2);
    else
        answer = -1;

    return answer;
}