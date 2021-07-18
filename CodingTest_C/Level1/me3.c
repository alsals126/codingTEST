// 프로그래머스 연습문제
// 내적
/*
문제 설명
길이가 같은 두 1차원 정수 배열 a, b가 매개변수로 주어집니다.a와 b의 내적을 return 하도록 solution 함수를 완성해주세요.

이때, a와 b의 내적은 a[0] * b[0] + a[1] * b[1] + ... + a[n - 1] * b[n - 1] 입니다. (n은 a, b의 길이)

제한사항
a, b의 길이는 1 이상 1, 000 이하입니다.
a, b의 모든 수는 - 1, 000 이상 1, 000 이하입니다.
입출력 예
a	b	result
[1, 2, 3, 4][-3, -1, 0, 2]	3
[-1, 0, 1][1, 0, -1] - 2
입출력 예 설명
입출력 예 #1

a와 b의 내적은 1 * (-3) + 2 * (-1) + 3 * 0 + 4 * 2 = 3 입니다.
입출력 예 #2

a와 b의 내적은(-1) * 1 + 0 * 0 + 1 * (-1) = -2 입니다.
*/
#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>

// a_len은 배열 a의 길이입니다.
// b_len은 배열 b의 길이입니다.
/*
    size_t는 부호 없는 정수형(unsigned integer)으로, sizeof·alignof·offsetf의 반환 값이다.
    size_t는 32비트 운영체제에서는 "부호없는 32비트 정수"이고, 64비트 운영체제에서는 "부호없는 64비트 정수"이다.
    unsigned int 또는 int는 64비트 os라고 해서 꼭 64비트 정수가 아니다. 여전히 32비트일 수도 있다. 
    이것이 size_t와 unsigned int형의 차이이다.
    메모리나 문자열 등의 길이를 구할 때에는 "unsigned int" 대신 "size_t"라는 형으로 길이가 반환된다.

    [네이버 블로그 - oxcow119님의 블로그에서 추출?인용?했습니다]
*/
int solution(int a[], size_t a_len, int b[], size_t b_len) {
    int answer = 0;

    for (int i = 0; i < a_len; i++) 
        answer += a[i] * b[i];
    
    return answer;
}

int main() {
    int a[] = { 1, 2, 3, 4 };
    int b[] = { -3, -1, 0, 2 };
    printf("%d\n", solution(a, 4, b, 4));

    int c[] = { -1,0,1 };
    int d[] = { 1,0,-1 };
    // 배열의 크기를 구할 때에는 size(배열)/size(배열의 자료형) 으로 해야한다.
    printf("%d\n", solution(c, sizeof(c)/sizeof(int), d, sizeof(d)/sizeof(int)));
}