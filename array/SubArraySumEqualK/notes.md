# Subarray Sum Equals K

**Difficulty:** Medium

## Pattern
Prefix Sum + HashMap (Cumulative Sum Frequency)

## Approach / Intuition
- Maintain a running prefix sum while iterating
- For each index, check if `(prefixSum - k)` exists in the map → means there is a subarray ending at current index with sum = k
- Use a HashMap to store how many times each prefix sum has appeared
- Increment count whenever a valid subarray is found

## Dry Run
**Input:**  
`nums = [1,1,1]`, `k = 2`

**Steps:**
- `map = {0:1}`, `prefixSum=0`, `count=0`
- `i=0` → `prefixSum=1`  
  `prefixSum-k = -1` (not in map)  
  `map={0:1, 1:1}`
- `i=1` → `prefixSum=2`  
  `prefixSum-k = 0` → found in map → `count=1`  
  `map={0:1, 1:1, 2:1}`
- `i=2` → `prefixSum=3`  
  `prefixSum-k = 1` → found in map → `count=2`  
  `map={0:1, 1:1, 2:1, 3:1}`

**Answer:**  
Total subarrays with sum = 2 → `2`

## Complexity
- **Time:** O(n) (single pass through nums)
- **Space:** O(n) (HashMap for prefix sums)

## Mistakes I Made
- **Mistake:** Initially tried brute force nested loops → O(n²)
- **Mistake:** Forgot to initialize `map.put(0,1)` → missed subarrays starting at index 0
- **Fix:** Used prefix sum + HashMap for optimal O(n) solution