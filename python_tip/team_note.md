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

