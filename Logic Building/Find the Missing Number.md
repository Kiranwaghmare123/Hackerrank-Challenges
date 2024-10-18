### HackerRank Challenge: Find the Missing Number

**Problem Statement:**

You are given an array `arr[]` of size `N-1` with integers in the range `[1, N]`. The task is to find the missing number from the range `[1, N]`.

- The array has no duplicates, and every number except one is present.
- You need to find the missing number.

### Input:
- The first line contains an integer `N`, representing the range of numbers from `1` to `N`.
- The second line contains `N-1` space-separated integers representing the elements of the array.

### Output:
- Output the missing number from the range `[1, N]`.

### Constraints:
- `2 <= N <= 10^6`
- `1 <= arr[i] <= N`

### Example:

#### Test Case 1:
- **Input:**
  ```
  8
  1 2 4 6 3 7 8
  ```
- **Output:**
  ```
  5
  ```

#### Test Case 2:
- **Input:**
  ```
  5
  1 2 3 5
  ```
- **Output:**
  ```
  4
  ```

---

### Approach:

The problem can be solved using the following approach:

1. **Sum of First N Numbers**:
   - The sum of the first `N` natural numbers is given by the formula:
     \[
     \text{sum} = \frac{N \times (N + 1)}{2}
     \]
   - The missing number can be found by subtracting the sum of the elements of the array from the expected sum.
   - Formula:
     \[
     \text{missing\_number} = \left( \frac{N \times (N + 1)}{2} \right) - \text{sum of array elements}
     \]

2. **Alternative Approach Using XOR (for optimal bitwise solution)**:
   - XORing all numbers from `1` to `N` with the array's elements will leave us with the missing number.
   - XOR has the property that `a ^ a = 0` and `a ^ 0 = a`. So, by XORing all elements from `1` to `N` and the array, all numbers except the missing one will cancel out.

---

### 7 Different Test Cases:

1. **Test Case 1 (General case):**
   - **Input:**
     ```
     8
     1 2 4 6 3 7 8
     ```
   - **Output:**
     ```
     5
     ```

2. **Test Case 2 (Missing the last element):**
   - **Input:**
     ```
     5
     1 2 3 4
     ```
   - **Output:**
     ```
     5
     ```

3. **Test Case 3 (Missing the first element):**
   - **Input:**
     ```
     6
     2 3 4 5 6
     ```
   - **Output:**
     ```
     1
     ```

4. **Test Case 4 (Only two elements):**
   - **Input:**
     ```
     2
     2
     ```
   - **Output:**
     ```
     1
     ```

5. **Test Case 5 (Large array missing somewhere in the middle):**
   - **Input:**
     ```
     10
     1 2 3 5 6 7 8 9 10
     ```
   - **Output:**
     ```
     4
     ```

6. **Test Case 6 (Large input size):**
   - **Input:**
     ```
     1000000
     (Array contains numbers 1 to 1000000, except missing number 999999)
     ```
   - **Output:**
     ```
     999999
     ```

7. **Test Case 7 (Edge case with smallest possible N):**
   - **Input:**
     ```
     2
     1
     ```
   - **Output:**
     ```
     2
     ```

---

### Java Code (Solution Using Summation Formula):

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the value of N (range of numbers from 1 to N)
        int N = sc.nextInt();
        
        // Array of size N-1
        int[] arr = new int[N-1];
        
        // Sum of all elements in the array
        long arraySum = 0;
        
        // Fill the array with input values and calculate the sum
        for (int i = 0; i < N-1; i++) {
            arr[i] = sc.nextInt();
            arraySum += arr[i];
        }
        
        // Calculate the sum of the first N numbers (1 to N)
        long expectedSum = (long)N * (N + 1) / 2;
        
        // The missing number is the difference between expectedSum and arraySum
        long missingNumber = expectedSum - arraySum;
        
        // Output the missing number
        System.out.println(missingNumber);
        
        sc.close();
    }
}
```

---

### Explanation of the Code:

1. **Input Handling**:
   - We read the integer `N` (the total number of elements in the full sequence) and then the array of size `N-1`.

2. **Summation Formula**:
   - The sum of the first `N` numbers is calculated using the formula: `N * (N + 1) / 2`.
   - We subtract the sum of the elements of the array from this total sum to get the missing number.

3. **Output**:
   - The missing number is printed after calculating the difference between the expected sum and the array sum.

---

### Time Complexity:

- **Time Complexity**: `O(N)`:
   - We loop through the array to compute the sum of its elements, which takes linear time (`O(N-1)`), and we also calculate the sum of the first `N` numbers in constant time (`O(1)`). Thus, the total time complexity is **O(N)**.

- **Space Complexity**: `O(1)`:
   - We use a constant amount of extra space (`long` variables for sum and a single array).

---

### Test Case Execution:

#### Test Case 1:
**Input:**
```
8
1 2 4 6 3 7 8
```

**Output:**
```
5
```

---

#### Test Case 2:
**Input:**
```
5
1 2 3 5
```

**Output:**
```
4
```

---

#### Test Case 3:
**Input:**
```
6
2 3 4 5 6
```

**Output:**
```
1
```

---

#### Test Case 4:
**Input:**
```
2
2
```

**Output:**
```
1
```

---

#### Test Case 5:
**Input:**
```
10
1 2 3 5 6 7 8 9 10
```

**Output:**
```
4
```

---

#### Test Case 6:
**Input:**
```
1000000
(1 to 1000000 except 999999)
```

**Output:**
```
999999
```

---

#### Test Case 7:
**Input:**
```
2
1
```

**Output:**
```
2
```

---

### Conclusion:

- **Time Complexity**: `O(N)`
- **Space Complexity**: `O(1)`

This approach provides an efficient and simple solution for finding the missing number in a sequence, even for large input sizes.
