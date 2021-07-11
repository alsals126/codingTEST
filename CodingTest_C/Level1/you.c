#include <stdio.h>
#include <stdbool.h>
#include <stdlib.h>
#include <math.h>

// sqrt(), pow() �� �� ����°��� double���̴�.
// pow()�� x�� y����
// sqrt()�� ������
long long solution(long long n) {
    long long answer = 0; // long long���� 8����Ʈ (long���� 4����Ʈ)

    // (int)sqrt(n)�� �ϸ� �Ҽ����ڴ� �������� �ȴ�.
    // �׸��� sqrt(n)�̶� ������ ���Ѵ�.
    // ���� �Ҽ��� ���� ������ �Ҽ��� �ڰ� 0�� �ƴϸ� �Ÿ��� �ȴ�.
    if ((int)sqrt(n) == sqrt(n)) 
        answer = pow((sqrt(n) + 1), 2);
    else
        answer = -1;

    return answer;
}