// ���α׷��ӽ� ��������
// �� ������ ��
/*
���� ����
�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���.
���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.

���� ����
a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
a�� b�� - 10, 000, 000 �̻� 10, 000, 000 ������ �����Դϴ�.
a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.

����� ��
a	b	return
3	5	12
3	3	3
5	3	12
*/
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