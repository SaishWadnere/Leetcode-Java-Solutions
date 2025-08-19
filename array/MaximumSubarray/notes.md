# Maximum Subarray

**Difficulty:** Medium

## Pattern
Dynamic Programming (Kadane’s Algorithm)

## Approach 

At index `i`, the best subarray ending at `i` is either:
- Just the element `nums[i]`, OR
- `nums[i]` plus `currentSum`.

So we update:  
`currentSum = max(nums[i], currentSum + nums[i])`

At each step, update the global max.  

## Dry Run 
**Example Input:**  
`nums = [-2,1,-3,4,-1,2,1,-5,4]`  
**Expected Output:** `6` (subarray `[4,-1,2,1]`)

**Step-by-step:**
- Start:  
  `maxSum = -2`  
  `currentSum = -2`


- `i=1` → `nums[1]=1`  
  `currentSum = max(1, -2+1) = 1`  
  `maxSum = max(-2,1) = 1`


- `i=2` → `nums[2]=-3`  
  `currentSum = max(-3, 1+(-3)) = -2`  
  `maxSum = 1`


- `i=3` → `nums[3]=4`  
  `currentSum = max(4, -2+4) = 4`  
  `maxSum = 4`


- `i=4` → `nums[4]=-1`  
  `currentSum = max(-1, 4+(-1)) = 3`  
  `maxSum = 4`


- `i=5` → `nums[5]=2`  
  `currentSum = max(2, 3+2) = 5`  
  `maxSum = 5`


- `i=6` → `nums[6]=1`  
  `currentSum = max(1, 5+1) = 6`  
  `maxSum = 6`


- `i=7` → `nums[7]=-5`  
  `currentSum = max(-5, 6-5) = 1`  
  `maxSum = 6`


- `i=8` → `nums[8]=4`  
  `currentSum = max(4, 1+4) = 5`  
  `maxSum = 6`


**Final Answer:** `6`


## Complexity
- **Time Complexity:** O(n) (single pass)
- **Space Complexity:** O(1) (just two variables)

## Mistakes I Made
- **Mistake:** Initially thought of using prefix sum.
- **Fix:** Studied and implemented Kadane’s Algorithm.