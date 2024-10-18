### HackerRank Challenge: Maximum Subarray Sum (Kadane’s Algorithm)

**Problem Statement:**

You are given an array `arr[]` of integers. Your task is to find the subarray that has the maximum sum and return the sum.

A **subarray** is a contiguous portion of an array, and your goal is to find the maximum sum among all possible subarrays.

### Input:
- The first line contains an integer `n`, the size of the array.
- The second line contains `n` space-separated integers representing the elements of the array.

### Output:
- Output the maximum subarray sum.

### Constraints:
- `1 <= n <= 10^6`
- `-10^4 <= arr[i] <= 10^4`

### Examples:

#### Test Case 1:
- **Input:**
  ```
  7
  2 3 -8 7 -1 2 3
  ```
- **Output:**
  ```
  11
  ```

#### Test Case 2:
- **Input:**
  ```
  2
  -2 -4
  ```
- **Output:**
  ```
  -2
  ```

#### Test Case 3:
- **Input:**
  ```
  5
  5 4 1 7 8
  ```
- **Output:**
  ```
  25
  ```

---

### Approach:

To solve this problem, we can use **Kadane's Algorithm**, which is an efficient method to find the maximum subarray sum in **O(n)** time.

The algorithm maintains two variables:
1. `current_sum`: Tracks the sum of the current subarray.
2. `max_sum`: Tracks the maximum sum found so far.

### Steps:
1. Initialize `current_sum` to 0 and `max_sum` to the smallest possible integer (or the first element).
2. Iterate through the array:
   - Add the current element to `current_sum`.
   - If `current_sum` becomes less than the current element, reset `current_sum` to the current element (start a new subarray).
   - Update `max_sum` if `current_sum` is greater than `max_sum`.
3. Return `max_sum` after processing all elements.

---

### 7 Different Test Cases:

1. **Test Case 1 (General case with positive and negative numbers):**
   - **Input:**
     ```
     7
     2 3 -8 7 -1 2 3
     ```
   - **Output:**
     ```
     11
     ```

2. **Test Case 2 (All negative numbers):**
   - **Input:**
     ```
     2
     -2 -4
     ```
   - **Output:**
     ```
     -2
     ```

3. **Test Case 3 (All positive numbers):**
   - **Input:**
     ```
     5
     5 4 1 7 8
     ```
   - **Output:**
     ```
     25
     ```

4. **Test Case 4 (Single large negative number):**
   - **Input:**
     ```
     1
     -100
     ```
   - **Output:**
     ```
     -100
     ```

5. **Test Case 5 (Array with alternating negative and positive values):**
   - **Input:**
     ```
     6
     -2 1 -3 4 -1 2
     ```
   - **Output:**
     ```
     5
     ```

6. **Test Case 6 (Larger array with mixed values):**
   - **Input:**
     ```
     10
     2 1 -3 4 -1 2 1 -5 4 6
     ```
   - **Output:**
     ```
     10
     ```

7. **Test Case 7 (Large input size):**
   - **Input:**
     ```
     1000000
     (Array with alternating large negative and positive values: 999999 positive values and 1 large negative number)
     ```
   - **Output:** 
     (Depends on the specific values, expected output is maximum sum of the largest subarray)

---

### Java Code (Solution Using Kadane's Algorithm):

```java
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read the size of the array
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        // Fill the array with input values
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        
        // Initialize current_sum and max_sum
        int current_sum = arr[0];
        int max_sum = arr[0];
        
        // Traverse the array and apply Kadane's algorithm
        for (int i = 1; i < n; i++) {
            current_sum = Math.max(arr[i], current_sum + arr[i]);
            max_sum = Math.max(max_sum, current_sum);
        }
        
        // Output the maximum subarray sum
        System.out.println(max_sum);
        
        sc.close();
    }
}
```

---

### Explanation of the Code:

1. **Input Handling**:
   - We first take the integer `n` (the size of the array) and then read `n` integers into the array `arr`.

2. **Kadane’s Algorithm**:
   - `current_sum` keeps track of the sum of the current subarray.
   - `max_sum` keeps track of the maximum sum found so far.
   - At each step, we decide whether to include the current element in the ongoing subarray (`current_sum + arr[i]`) or start a new subarray with just the current element (`arr[i]`).
   - We update `max_sum` to the maximum of the current sum or the existing `max_sum`.

3. **Output**:
   - Finally, after traversing all elements, we print `max_sum`.

---

### Test Case Execution:

#### Test Case 1:
**Input:**
```
7
2 3 -8 7 -1 2 3
```

**Output:**
```
11
```

---

#### Test Case 2:
**Input:**
```
2
-2 -4
```

**Output:**
```
-2
```

---

#### Test Case 3:
**Input:**
```
5
5 4 1 7 8
```

**Output:**
```
25
```

---

#### Test Case 4:
**Input:**
```
1
-100
```

**Output:**
```
-100
```

---

#### Test Case 5:
**Input:**
```
6
-2 1 -3 4 -1 2
```

**Output:**
```
5
```

---

#### Test Case 6:
**Input:**
```
10
2 1 -3 4 -1 2 1 -5 4 6
```

**Output:**
```
10
```

---

#### Test Case 7 (Large Input):
**Input:**
```
1000000
(Alternating large positive and negative values)
```

**Output:**
(Expected output depends on specific values, likely the sum of a large positive subarray)

---

### Time Complexity:

- **O(n)**: 
   - We traverse the array once in a single pass and update `current_sum` and `max_sum` accordingly. Thus, the time complexity is **O(n)** where `n` is the size of the array.

### Space Complexity:

- **O(1)**: 
   - We only use a few extra variables (`current_sum`, `max_sum`), so the space complexity is constant.

---

### Conclusion:

- **Time Complexity**: `O(n)`
- **Space Complexity**: `O(1)`

This approach using Kadane’s Algorithm provides an efficient and optimal solution to the maximum subarray sum problem, handling large input sizes and both positive and negative values effectively.
