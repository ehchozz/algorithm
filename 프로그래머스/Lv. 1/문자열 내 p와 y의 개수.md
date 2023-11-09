### 문제
https://school.programmers.co.kr/learn/courses/30/lessons/12916

### 나의 풀이(Java)
```java
class Solution {
    boolean solution(String s) {
        boolean answer = true;

        int pCnt = 0, yCnt = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p' || s.charAt(i) == 'P') {
                pCnt++;
            } else if (s.charAt(i) == 'y' || s.charAt(i) == 'Y') {
                yCnt++;
            }
        }
        
        answer = (pCnt == yCnt);

        return answer;
    }
}
```

### 다른 사람의 풀이(Java)
```java
class Solution {
    boolean solution(String s) {
        s = s.toLowerCase();
        int count = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'p')
                count++;
            else if (s.charAt(i) == 'y')
                count--;
        }

        if (count == 0)
            return true;
        else
            return false;
    }
}
```

### 나의 풀이(JavaScript)
```javascript
function solution(s){
    let count = 0;

    s = s.toUpperCase();
    for (let i = 0; i < s.length; i++) {
        if (s.charAt(i) === 'P') {
            count++;
        } else if (s.charAt(i) === 'Y') {
            count--;
        }
    }

    return (count === 0);
}
```

### 다른 사람의 풀이(JavaScript)
```javascript
function solution(s){
    return (s.match(/p/ig)||[]).length == (s.match(/y/ig)||[]).length;
}
```
