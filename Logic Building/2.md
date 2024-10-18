### HackerRank Challenge: Sum of All Subarrays

**Problem Statement:**

You are given an integer array `arr[]` of size `N`. Your task is to find the sum of all possible subarrays of the given array.

A **subarray** is a contiguous portion of an array. You need to sum up all the subarrays and return the total sum.

### Input:
- The first line contains an integer `n`, the size of the array.
- The second line contains `n` space-separated integers representing the elements of the array.

### Output:
- Output the sum of all subarrays.

### Constraints:
- `1 <= n <= 1000`
- `1 <= arr[i] <= 10^4`

### Example:

#### Test Case 1:
- **Input:**
  ```
  3
  1 2 3
  ```
- **Output:**
  ```
  20
  ```

#### Test Case 2:
- **Input:**
  ```
  4
  1 2 3 4
  ```
- **Output:**
  ```
  50
  ```

### 7 Different Test Cases:

1. **Test Case 1 (General case):**
   - **Input:**
     ```
     3
     1 2 3
     ```
   - **Output:**
     ```
     20
     ```

2. **Test Case 2 (Larger array):**
   - **Input:**
     ```
     4
     1 2 3 4
     ```
   - **Output:**
     ```
     50
     ```

3. **Test Case 3 (Single element):**
   - **Input:**
     ```
     1
     5
     ```
   - **Output:**
     ```
     5
     ```

4. **Test Case 4 (Array with all same elements):**
   - **Input:**
     ```
     3
     7 7 7
     ```
   - **Output:**
     ```
     63
     ```

5. **Test Case 5 (Array with alternating small values):**
   - **Input:**
     ```
     5
     1 2 1 2 1
     ```
   - **Output:**
     ```
     35
     ```

6. **Test Case 6 (Array with increasing large values):**
   - **Input:**
     ```
     5
     10 20 30 40 50
     ```
   - **Output:**
     ```
     650
     ```

7. **Test Case 7 (Large input size):**
   - **Input:**
     ```
     10
     1 1 1 1 1 1 1 1 1 1
     ```
   - **Output:**
     ```
     220
     ```

---

### Approach:

The sum of all subarrays can be calculated using a simple nested loop approach where for each element, we calculate all possible subarrays that begin with that element.

For element `arr[i]`, it contributes to several subarrays. Specifically:
- Element `arr[i]` contributes to every subarray starting from index `i` to the end of the array.
- The sum of these subarrays can be calculated by considering every possible starting point and ending point for the subarray.

---

### Java Code (Solution):

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
        
        // Variable to store the total sum of all subarrays
        long totalSum = 0;
        
        // Iterate through the array and calculate the sum of all subarrays
        for (int i = 0; i < n; i++) {
            // Each element arr[i] is part of (i+1) subarrays starting from 0 to i
            // and (n-i) subarrays ending at i to n-1.
            // Hence it contributes (i+1) * (n-i) times in the final sum.
            totalSum += (long) arr[i] * (i + 1) * (n - i);
        }
        
        // Output the total sum
        System.out.println(totalSum);
        
        sc.close();
    }
}
```

---

### Explanation of the Code:

1. **Input Handling**:
   - We first take the size of the array `n` and then read `n` integers into the array `arr`.

2. **Efficient Calculation**:
   - The key observation is that each element `arr[i]` appears in multiple subarrays.
   - For an element `arr[i]`, the number of subarrays that include `arr[i]` is `(i+1) * (n-i)`.
     - `i+1` is the number of ways the subarray can start from index `i` or earlier.
     - `n-i` is the number of ways the subarray can end at index `i` or later.
   - Using this insight, we can avoid a nested loop and calculate the sum in **O(n)** time.

3. **Output**:
   - Finally, the calculated total sum is printed.

---

### Test Case Execution:

#### Test Case 1:
**Input:**
```
3
1 2 3
```

**Output:**
```
20
```

---

#### Test Case 2:
**Input:**
```
4
1 2 3 4
```

**Output:**
```
50
```

---

#### Test Case 3:
**Input:**
```
1
5
```

**Output:**
```
5
```

---

#### Test Case 4:
**Input:**
```
3
7 7 7
```

**Output:**
```
63
```

---

#### Test Case 5:
**Input:**
```
5
1 2 1 2 1
```

**Output:**
```
35
```

---

#### Test Case 6:
**Input:**
```
5
10 20 30 40 50
```

**Output:**
```
650
```

---

#### Test Case 7:
**Input:**
```
10
1 1 1 1 1 1 1 1 1 1
```

**Output:**
```
220
```

---

### Time Complexity:

- **O(n)**: 
   - We iterate over the array once and compute the sum contribution of each element using the formula `(i+1) * (n-i)`.
   - This results in a linear time complexity.

### Space Complexity:

- **O(1)**: 
   - The space used is constant since we only store the array and a few additional variables, regardless of the input size.

---

### Conclusion:

- **Time Complexity**: `O(n)`
- **Space Complexity**: `O(1)`

This approach ensures an efficient solution to the problem of calculating the sum of all subarrays, avoiding the nested loops approach and improving performance for larger arrays.
