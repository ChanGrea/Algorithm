## magic matrix (마방진)

- 가로, 세로, 대각선의 합이 같은 행렬

```python
#!/bin/python3

import math
import os
import random
import re
import sys

# Complete the formingMagicSquare function below.
def formingMagicSquare(s):
    magic_squares = [[[8, 1, 6], [3, 5, 7], [4, 9, 2]],
                        [[6, 1, 8], [7, 5, 3], [2, 9, 4]],
                        [[4, 9, 2], [3, 5, 7], [8, 1, 6]],
                        [[2, 9, 4], [7, 5, 3], [6, 1, 8]],
                        [[8, 3, 4], [1, 5, 9], [6, 7, 2]],
                        [[4, 3, 9], [9, 5, 1], [2, 7, 6]],
                        [[6, 7, 2], [1, 5, 9], [8, 3, 4]],
                        [[2, 7, 6], [9, 5, 1], [4, 3, 9]]]

    minimum_cost = sys.maxsize

    for magic_square in magic_squares:
        cost = 0
        for i in range(3):
            for j in range(3):
                cost += abs(magic_square[i][j] - s[i][j])
        minimum_cost = min(minimum_cost, cost)

    return minimum_cost



if __name__ == '__main__':
    fptr = open(os.environ['OUTPUT_PATH'], 'w')

    s = []

    for _ in range(3):
        s.append(list(map(int, input().rstrip().split())))

    result = formingMagicSquare(s)

    fptr.write(str(result) + '\n')

    fptr.close()

```



## 2020 카카오 공채

### 자물쇠 문제

```python
# 2차원 리스트 90도 회전
def rotate_a_matrix_by_90_degree(a):
    n = len(a)  # 행 길이 계산
    m = len(a[0])  # 열 길이 계산
    result = [[0] * n for _ in range(m)]  # 결과 리스트
    for i in range(n):
        for j in range(m):
            result[j][n - i - 1] = a[i][j]
    return result


# 자물쇠의 중간 부분이 모두 1인지 확인
def check(new_lock):
    lock_length = len(new_lock) // 3
    for i in range(lock_length, lock_length * 2):
        for j in range(lock_length, lock_length * 2):
            if new_lock[i][j] != 1:
                return False
    return True


def solution(key, lock):
    n = len(lock)
    m = len(key)
    # 자물쇠의 크기를 기존의 3배로 변환
    new_lock = [[0] * (n * 3) for _ in range(n * 3)]
    # 새로운 자물쇠의 중앙 부분에 기존의 자물쇠 넣기
    for i in range(n):
        for j in range(n):
            new_lock[i + n][j + n] = lock[i][j]

    # 4가지 방향에 대해서 확인
    for rotation in range(4):
        key = rotate_a_matrix_by_90_degree(key)  # 열쇠 회전
        for x in range(n * 2):
            for y in range(n * 2):
                # 자물쇠에 열쇠를 끼워 넣기
                for i in range(m):
                    for j in range(m):
                        new_lock[x + i][y + j] += key[i][j]
                # 새로운 자물쇠에 열쇠가 정확히 들어맞는지 검사
                if check(new_lock) == True:
                    return True
                # 자물쇠에서 열쇠를 다시 빼기
                for i in range(m):
                    for j in range(m):
                        new_lock[x + i][y + j] -= key[i][j]
    return False
```

