### 2차원 리스트 90도 회전

```python
# 2차원 리스트 90도 회전
def rotate_a_matrix_by_90_degree(a):
    n = len(a)  # 행 길이 계산
    m = len(a[0])   # 열 길이 계산
    result = [[0] * n for _ in range(m)]    # 결과 리스트
    for i in range(n):
        for j in range(m):
            result[j][n - i - 1] = a[i][j]
    return result
```



### DFS 예시 (BFS 포함)

```python
from collections import deque

''' Depth First Search (DFS) '''
def dfs(x):
    print(x, end=' ')
    visited[x] = True
    for y in graph[x]:
        if not(visited[y]):
            dfs(y)

''' Breadth First Search (BFS) '''
def bfs(x):
    q = deque([x])
    visited[x] = True
    while q:
        x = q.popleft()
        print(x, end=' ')
        for y in graph[x]:
            if not visited[y]:
                q.append(y)
                visited[y] = True

n, m, start = map(int, input().split())
graph = [[] for _ in range(n + 1)]
for _ in range(m):
    x, y = map(int, input().split())
    graph[x].append(y)
    graph[y].append(x)

for e in graph:
    e.sort()

visited = [False] * (n + 1)
dfs(start)
print()
visited = [False] * (n + 1)
bfs(start)

'''
[Input Example 1]
4 5 1
1 2
1 3
1 4
2 4
3 4
[Output Example 1]
1 2 4 3 
1 2 3 4
'''
```





### BFS 예시

```python
''' Find the number of connected components '''
from collections import deque

n = 15
m = 14
data = [
    '00000111100000',
    '11111101111110',
    '11011101101110',
    '11011101100000',
    '11011111111111',
    '11011111111100',
    '11000000011111',
    '01111111111111',
    '00000000011111',
    '01111111111000',
    '00011111111000',
    '00000001111000',
    '11111111110011',
    '11100011111111',
    '11100011111111'
]

visited = [[False] * m for _ in range(n)]
dx = [-1, 1, 0, 0]
dy = [0, 0, -1, 1]

def bfs(x, y):
    queue = deque([(x, y)])
    visited[x][y] = True
    while queue:
        x, y = queue.popleft()
        for i in range(4):
            nx = x + dx[i]
            ny = y + dy[i]
            if nx < 0 or ny < 0 or nx >= n or ny >= m:
                continue
            if data[x][y] == '0' and not visited[nx][ny]:
                visited[nx][ny] = True
                queue.append((nx, ny))

result = 0
for i in range(n):
    for j in range(m):
        # Find the number of connected components consisting only of '0'.
        if data[i][j] == '0' and not visited[i][j]:
            bfs(i, j)
            result += 1

print(result)
```



### 소수 판별 코드

```python
import math

# 소수 판별 함수
def is_prime_number(x):
    # 2부터 x의 제곱근까지의 모든 수를 확인하며
    for i in range(2, int(math.sqrt(x)) + 1):
        # x가 해당 수로 나누어떨어진다면
        if x % i == 0:
            return False # 소수가 아님
    return True # 소수임

print(is_prime_number(4)) # 4는 소수가 아님
print(is_prime_number(7)) # 7은 소수임
```



#### 에라토스테네스의 체

```python
import math

n = 1000 # 2부터 1,000까지의 모든 수에 대하여 소수 판별
array = [True for i in range(n + 1)] # 처음엔 모든 수가 소수(True)인 것으로 초기화

# 에라토스테네스의 체 알고리즘 
for i in range(2, int(math.sqrt(n)) + 1): # 2부터 n의 제곱근까지의 모든 수를 확인하며
    if array[i] == True: # i가 소수인 경우 (남은 수인 경우)
        # i를 제외한 i의 모든 배수를 지우기
        j = 2 
        while i * j <= n:
            array[i * j] = False
            j += 1

# 모든 소수 출력
for i in range(2, n + 1):
    if array[i]:
        print(i, end=' ')

```



### 내장함수

#### 곱집합 - product

```python
import itertools

iterable1 = 'ABCD'
iterable2 = 'xy'
iterable3 = '1234'
result = itertools.product(iterable1, iterable2, iterable3)

for item in result:
  print(item)
```

```
('A', 'x', '1')
('A', 'x', '2')
('A', 'x', '3')
('A', 'x', '4')
('A', 'y', '1')
('A', 'y', '2')
('A', 'y', '3')
('A', 'y', '4')
('B', 'x', '1')
('B', 'x', '2')
('B', 'x', '3')
('B', 'x', '4')
('B', 'y', '1')
('B', 'y', '2')
('B', 'y', '3')
('B', 'y', '4')
('C', 'x', '1')
('C', 'x', '2')
('C', 'x', '3')
('C', 'x', '4')
('C', 'y', '1')
('C', 'y', '2')
('C', 'y', '3')
('C', 'y', '4')
('D', 'x', '1')
('D', 'x', '2')
('D', 'x', '3')
('D', 'x', '4')
('D', 'y', '1')
('D', 'y', '2')
('D', 'y', '3')
('D', 'y', '4')
```

:exclamation: 참고로 permutation과 combination과 다르게 **2개 이상**의 리스트에서 모든 조합을 구할 때 사용된다.

```python
from itertools import product

items = [['a', 'b', 'c,'], ['1', '2', '3', '4'], ['!', '@', '#']]
list(product(*items))
# [('a', '1', '!'), ('a', '1', '@'), ('a', '1', '#'), ('a', '2', '!'), ('a', '2', '@'), ('a', '2', '#'), ('a', '3', '!'), ('a', '3', '@'), ('a', '3', '#'), ('a', '4', '!'), ('a', '4', '@'), ('a', '4', '#'), ('b', '1', '!'), ('b', '1', '@'), ('b', '1', '#'), ('b', '2', '!'), ('b', '2', '@'), ('b', '2', '#'), ('b', '3', '!'), ('b', '3', '@'), ('b', '3', '#'), ('b', '4', '!'), ('b', '4', '@'), ('b', '4', '#'), ('c,', '1', '!'), ('c,', '1', '@'), ('c,', '1', '#'), ('c,', '2', '!'), ('c,', '2', '@'), ('c,', '2', '#'), ('c,', '3', '!'), ('c,', '3', '@'), ('c,', '3', '#'), ('c,', '4', '!'), ('c,', '4', '@'), ('c,', '4', '#')]
```



#### 묶어주기 - zip

```python
Number = [1,2,3,4]
Name = ['hong','gil','dong','nim']

Number_Name = list(zip(Number,name))

print(Number_Name)
# 결과 : [(1 ,'hong'), (2 ,'gil'), (3 ,'dong'), (4 ,'nim')]
```

