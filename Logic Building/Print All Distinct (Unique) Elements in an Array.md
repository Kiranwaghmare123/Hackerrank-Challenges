### HackerRank Challenge: Print All Distinct (Unique) Elements in an Array

**Problem Statement:**

You are given an integer array `arr[]`, which may contain duplicate elements. Your task is to print all the distinct elements from this array. The output should contain each element only once, in the order of their first occurrence in the array.

### Input:
- The first line contains an integer `n`, the size of the array.
- The second line contains `n` space-separated integers representing the elements of the array.

### Output:
- Output the distinct elements from the array in the order they first appear.

### Constraints:
- `1 <= n <= 100`
- `1 <= arr[i] <= 10^4`

### Example:

#### Test Case 1:
- **Input:**
  ```
  8
  12 10 9 45 2 10 10 45
  ```
- **Output:**
  ```
  12 10 9 45 2
  ```

#### Test Case 2:
- **Input:**
  ```
  5
  1 2 3 4 5
  ```
- **Output:**
  ```
  1 2 3 4 5
  ```

#### Test Case 3:
- **Input:**
  ```
  5
  1 1 1 1 1
  ```
- **Output:**
  ```
  1
  ```

### 7 Different Test Cases:

1. **Test Case 1 (General case with duplicates):**
   - **Input:**
     ```
     8
     12 10 9 45 2 10 10 45
     ```
   - **Output:**
     ```
     12 10 9 45 2
     ```

2. **Test Case 2 (All unique elements):**
   - **Input:**
     ```
     5
     1 2 3 4 5
     ```
   - **Output:**
     ```
     1 2 3 4 5
     ```

3. **Test Case 3 (All elements are the same):**
   - **Input:**
     ```
     5
     1 1 1 1 1
     ```
   - **Output:**
     ```
     1
     ```

4. **Test Case 4 (Only one element):**
   - **Input:**
     ```
     1
     100
     ```
   - **Output:**
     ```
     100
     ```

5. **Test Case 5 (Duplicates with large values):**
   - **Input:**
     ```
     7
     10000 10000 5000 5000 9999 10000 5000
     ```
   - **Output:**
     ```
     10000 5000 9999
     ```

6. **Test Case 6 (Repeating sequence):**
   - **Input:**
     ```
     6
     1 2 3 1 2 3
     ```
   - **Output:**
     ```
     1 2 3
     ```

7. **Test Case 7 (Large input size):**
   - **Input:**
     ```
     10
     2 3 2 4 4 4 5 2 5 3
     ```
   - **Output:**
     ```
     2 3 4 5
     ```

---

### Java Code (Solution):

```java
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        
        // Array to store the input elements
        int[] arr = new int[n];
        
        // Fill the array with input values
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Set to store unique elements
        Set<Integer> uniqueElements = new LinkedHashSet<>();
        
        // Insert each element into the set to ensure uniqueness
        for (int i = 0; i < n; i++) {
            uniqueElements.add(arr[i]);
        }
        
        // Print out the distinct elements in the order of their first occurrence
        for (int element : uniqueElements) {
            System.out.print(element + " ");
        }
        
        sc.close();
    }
}
```

---

### Explanation of the Code:
1. **Input Handling:**
   - First, we take the size of the array `n`.
   - Then, we read `n` integers and store them in the array `arr`.

2. **Using `LinkedHashSet`:**
   - We use a `LinkedHashSet` to automatically remove duplicates while maintaining the order of insertion.
   - `Set` ensures that each element is stored only once, while `LinkedHashSet` guarantees that the order of elements is the same as their first appearance in the array.

3. **Output:**
   - After adding all the elements to the `LinkedHashSet`, we iterate through the set and print each element, ensuring that only distinct elements are printed in their original order.

---

### Test Case Execution:

#### Test Case 1:
**Input:**
```
8
12 10 9 45 2 10 10 45
```

**Output:**
```
12 10 9 45 2
```

---

#### Test Case 2:
**Input:**
```
5
1 2 3 4 5
```

**Output:**
```
1 2 3 4 5
```

---

#### Test Case 3:
**Input:**
```
5
1 1 1 1 1
```

**Output:**
```
1
```

---

#### Test Case 4:
**Input:**
```
1
100
```

**Output:**
```
100
```

---

#### Test Case 5:
**Input:**
```
7
10000 10000 5000 5000 9999 10000 5000
```

**Output:**
```
10000 5000 9999
```

---

#### Test Case 6:
**Input:**
```
6
1 2 3 1 2 3
```

**Output:**
```
1 2 3
```

---

#### Test Case 7:
**Input:**
```
10
2 3 2 4 4 4 5 2 5 3
```

**Output:**
```
2 3 4 5
```

---

### Key Concepts:
- **Sets**: A set automatically removes duplicates, which is why we use a `LinkedHashSet` to retain the first occurrence order.
- **Array and Set Operations**: Inserting elements into a set from an array ensures distinct elements while keeping the insertion order.

This challenge tests understanding of arrays, sets, and basic input/output operations in Java.
