## Python 자료형 관련

### 수 자료형 연산

```python
a = 7
b = 3

# 나누기
print(a / b)

# 나머지
print(a % b)

# 몫
print(a // b)

# 거듭제곱
print(a ** b)
```



### 리스트

```python
# 초기화 방법
n = 10
a = [0] * n

# 빈 리스트 (1)
a = list()

# 빈 리스트 (2)
a = []
```



#### 리스트 슬라이싱

:arrow_right: 리스트 [시작 인덱스 : 끝 인덱스 + 1]

```python
a = [1, 2, 3, 4, 5, 6, 7, 8, 9]

# 두 번째 원소부터 네 번째 원소까지
print(a[1 : 4])
```

```
[2, 3, 4]
```



#### 리스트 컴프리헨션

- 리스트를 초기화하는 방법 중 하나
- 대괄호 안에 조건문과 반복문을 넣는 방식으로 리스트 초기화

```python
# 0부터 19까지의 수 중에서 홀수만 포함하는 리스트
array = [i for i in range(20) if i % 2 == 1]
```



:exclamation: 2차원 배열 초기화

```python
n = 3
m = 3
array = [[0] * m for _ in range(n)]
```



#### 리스트 관련 메서드

```python
a = [1, 4, 3]
print("기본 리스트: ", a)

# 리스트에 원소 삽입
a.append(2)
print("삽입: ", a)

# 오름차순 정렬
a.sort()
print("오름차순 정렬: ", a)

# 내림차순 정렬
a.sort(reverse = True)
print("내림차순 정렬: ", a)

# 리스트 원소 뒤짚기
a.reverse()
print("원소 뒤집기: ", a)

# 특정 인덱스에 데이터 추가
a.insert(2, 3)
print("인덱스 2에 3 추가: ", a)

# 특정 값인 데이터 개수 세기
print("값이 3인 데이터 개수: ", a.count(3))

# 특정 값 데이터 삭제
a.remove(1)
print("값이 1인 데이터 삭제: ", a)
```

```
기본 리스트:  [1, 4, 3]
삽입:  [1, 4, 3, 2]
오름차순 정렬:  [1, 2, 3, 4]
내림차순 정렬:  [4, 3, 2, 1]
원소 뒤집기:  [1, 2, 3, 4]
인덱스 2에 3 추가:  [1, 2, 3, 3, 4]
값이 3인 데이터 개수:  2
값이 1인 데이터 삭제:  [2, 3, 3, 4]
```



### 사전 자료형

```python
data = dict()
data['사과'] = 'Apple'
data['바나나'] = 'Banana'
data['코코넛'] = 'Coconut'

# 키 데이터만 담은 리스트
key_list = data.keys()

# 값 데이터만 담은 리스트
value_list = data.values()

print(key_list)
print(value_list)

# 각 키에 따른 값을 하나씩 출력
for key in key_list:
    print(data[key])
```

```
dict_keys(['사과', '바나나', '코코넛'])
dict_values(['Apple', 'Banana', 'Coconut'])
Apple
Banana
Coconut
```



### 집합 자료형

```python
# 집합 자료형 초기화 방법 1
data = set([1, 1, 2, 3, 4, 4, 5])
print(data)

# 집합 자료형 초기화 방법 2
data = {1, 1, 2, 3, 4, 4, 5}
print(data)
```

```
{1, 2, 3, 4, 5}
{1, 2, 3, 4, 5}
```



#### 집합 자료형 연산

```python
a = set([1, 2, 3, 4, 5])
b = set([3, 4, 5, 6, 7])

print(a | b)	# 합집합
print(a & b)	# 교집합
print(a - b)	# 차집합
```

```
{1, 2, 3, 4, 5, 6, 7}
{3, 4, 5}
{1, 2}
```



#### 집합 자료형 관련 함수

```python
data = set([1, 2, 3])
print(data)

# 새로운 원소 추가
data.add(4)
print(data)

# 새로운 원소 여러 개 추가
data.update([5, 6])
print(data)

# 특정한 값을 갖는 원소 삭제
data.remove(3)
print(data)
```

```
{1, 2, 3}
{1, 2, 3, 4}
{1, 2, 3, 4, 5, 6}
{1, 2, 4, 5, 6}
```



## Python 입/출력

### 입력을 위한 전형적인 소스코드

```python
# 데이터의 개수 입력
n = int(input())
# 각 데이터를 공백으로 구분하여 입력
data = list(map(int, input().split()))

data.sort(reverse = True)
print(data)
```

```
5
65 90 75 34 99
[99, 90, 75, 65, 34]
```



### 공백을 기준으로 구분하여 적은 수의 데이터 입력

```python
# n, m, k를 공백으로 구분하여 입력
n, m, k = map(int, input().split())
```



### :heavy_plus_sign: 문자열과 숫자 입력 받기

```python
s, k = raw_input().split()		# 입력을 모두 문자열로 입력받는다.
k = int(k)		# 문자열을 숫자로 변환해준다.
```

- raw_input()을 통해 숫자, 문자열 모두 일단 문자열로 입력받음
  - input()은 숫자를 입력받는 메소드
- 숫자일 경우 int()를 통해 숫자로 변환



### 한 줄 입력 받기

```python
import sys
sys.stdin.readline().rstrip()
```



### 출력 관련

#### :heavy_check_mark: 문자열 concat 방법(1)  - (추천)

```python
def method1():
  str_list = []
  for num in xrange(loop_count):
    str_list.append(`num`)
  return ''.join(str_list)
```

#### 문자열 concat 방법(2)

```python
def method2():
  from cStringIO import StringIO
  file_str = StringIO()
  for num in xrange(loop_count):
    file_str.write(`num`)

  return file_str.getvalue()
```

#### 문자열 concat 방법(3)

```python
def method3():
  return ''.join([`num` for num in xrange(loop_count)])
```





## 주요 라이브러리의 문법과 유의점

### 내장 함수

#### sum

```python
result = sum([1, 2, 3, 4, 5])
print(result)    # 15
```

- **iterable 객체**가 입력으로 주어졌을 때 합계



#### min

```python
result = min(7, 3, 5, 2)
print(result)    # 2
```



#### max

```python
result = max(7, 3, 5, 2)
print(result)    # 7
```



#### eval

```python
result = eval("(3 + 5) * 7")
print(result)
```

- 수식을 계산한 결과를 반한



#### sorted

```python
result = sorted([9, 1, 8, 5, 4])
print(result)
result = sorted([9, 1, 8, 5, 4], reverse = True)
print(result)
```

```
[1, 4, 5, 8, 9]
[9, 8, 5, 4, 1]
```

- 특정한 기준에 따라서 정렬 가능

```python
result = sorted([('홍길동', 35), ('이순신', 75), ('아무개', 50)], key = lambda x: x[1], reverse = True)
print(result)
```

```
[('이순신', 75), ('아무개', 50), ('홍길동', 35)]
```



### itertools

#### permutations

- 리스트와 같은 iterable 객체에서 r개의 데이터를 뽑아 일렬로 나열하는 모든 경우(순열)

```python
from itertools import permutations

data = ['A', 'B', 'C']    # 데이터 준비
result = list(permutations(data, 3))    # 모든 순열 구하기

print(result)
```

```
[('A', 'B', 'C'), ('A', 'C', 'B'), ('B', 'A', 'C'), ('B', 'C', 'A'), ('C', 'A', 'B'), ('C', 'B', 'A')]
```



#### combinations

- 리스트와 같은 iterable 객체에서 r개의 데이터를 뽑아 순서를 고려하지 않고 나열하는 모든 경우(조합)

```python
from itertools import combinations

data = ['A', 'B', 'C']    # 데이터 준비
result = list(combinations(data, 2))    # 2개를 뽑는 모든 조합 구하기

print(result)
```

```
[('A', 'B'), ('A', 'C'), ('B', 'C')]
```



#### product

- permutations와 같이 리스트와 같은 iterable 객체에서 r개의 데이터를 뽑아 일렬로 나열하는 모든 경우(순열)
- **중복을 허용**

```python
from itertools import product

data = ['A', 'B', 'C']		# 데이터 준비
result = list(product(data, repeat=2))		# 2개를 뽑는 모든 순열 구하기(중복 허용)

print(result)
```

```
[('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'A'), ('B', 'B'), ('B', 'C'), ('C', 'A'), ('C', 'B'), ('C', 'C')]
```



#### combinations_with_replacement

- combinations와 같이 리스트와 같은 iterable 객체에서 r개의 데이터를 뽑아 순서를 고려하지 않고 나열하는 모든 경우(조합)
- **중복 허용**

```python
from itertools import combinations_with_replacement

data = ['A', 'B', 'C']		# 데이터 준비
result = list(combinations_with_replacement(data, 2))		# 2개를 뽑는 모든 조합 구하기(중복 허용)
print(result)
```

```
[('A', 'A'), ('A', 'B'), ('A', 'C'), ('B', 'B'), ('B', 'C'), ('C', 'C')]
```



### heapq

- 다익스트라 최단 경로 알고리즘

- 우선순위 큐 기능

- PriorityQueue 라이브러리보다 빠르다.

- 원소 삽입 :arrow_right: heapq.heappush()

  원소 꺼낼 때 :arrow_right: heapq.heappop()

```python
import heapq


def heapsort(iterable):
    h = []
    result = []
    # 모든 원소를 차례대로 힙에 삽입
    for value in iterable:
        heapq.heappush(h, value)
    # 힙에 삽입된 모든 원소를 차례
    for i in range(len(h)):
        result.append(heapq.heappop(h))
    return result


result = heapsort([1, 3, 5, 7, 9, 2, 4, 6, 8, 0])
print(result)

```

```
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
```



### bisect

- 이진 탐색을 쉽게 구현하기 위한 라이브러리
- '정렬된 배열'에서 특정한 원소를 찾아야 할 때 매우 효과적
- bisect_left(), bisect_right()

```python
from bisect import bisect_left, bisect_right

a = [1, 2, 4, 4, 8]
x = 4

print(bisect_left(a, x))
print(bisect_right(a, x))
```

- bisect_left(a, x)
  - 정렬된 순서를 유지하면서 리스트 a에 데이터 x를 삽입할 가장 왼쪽 인덱스를 찾는 메서드
- bisect_right(a, x)
  - 정렬된 순서를 유지하도록 리스트 a에 데이터 x를 삽입할 가장 오른쪽 인덱스를 찾는 메서드



### collections

#### deque

- 파이썬에서는 deque를 사용해 큐를 구현
- 리스트와 비교했을 때, 앞쪽에 있는 데이터를 삭제하거나 추가할 때 deque가 더 빠르다. (O(1))
- 인덱싱, 슬라이싱 등의 기능은 사용할 수 없다.
- 스택, 큐 자료구조의 대용

```python
from collections import deque

data = deque([2, 3, 4])
data.appendleft(1)
data.append(5)

print(data)
print(list(data))		# 리스트 자료형으로 변환
```

```
deque([1, 2, 3, 4, 5])
[1, 2, 3, 4, 5]
```



#### Counter

- 등장 횟수를 세는 기능
- 리스트와 같은 iterable 객체가 주어졌을 때, 해당 객체 내부의 원소가 몇 번씩 등장했는지를 알려준다.

```python
from collections import Counter

counter = Counter(['red', 'blue', 'red', 'green', 'blue', 'blue'])

print(counter['blue'])  # 'blue'가 등장한 횟수 출력
print(counter['green'])  # 'green'이 등장한 횟수 출력
print(dict(counter))  # 사전 자료형으로 변환
```

```
3
1
{'red': 2, 'blue': 3, 'green': 1}
```



### math

#### factorial

- 팩토리얼

```python
import math

print(math.factorial(5))	# 5 팩토리얼을 출력
```



#### sqrt

- 제곱근

```python
import math

print(math.sqrt(7))	# 7의 제곱근을 출력
```



#### gcd

- 최대 공약수

```python
import math

print(math.gcd(21, 14))
```



#### pi, e

- 파이(pi)
- 자연상수(e)

```python
import math

print(math.pi)	# 파이(pi) 출력
print(math.e)	# 자연상수 e 출력
```

