# Top K Frequent Elements

**Difficulty:** Medium

## Pattern
HashMap (frequency count) + Bucket Sort

## Approach
1. **Count frequency** of each number using a HashMap
2. **Create a bucket array** (index = frequency) where each bucket stores numbers with that frequency
3. **Traverse backwards** from highest frequency, collecting numbers until we have k elements

## Dry Run
**Example Input:**  
`nums = [1,1,1,2,2,3]`, `k = 2`  
**Expected Output:** `[1, 2]`

1. **Frequency map:**
    - `1 → 3`
    - `2 → 2`
    - `3 → 1`

2. **Bucket (index = frequency):**
    - `0: []`
    - `1: [3]`
    - `2: [2]`
    - `3: [1]`

3. **Collect from highest frequency:**
    - freq=3 → take `1` → `result=[1]`
    - freq=2 → take `2` → `result=[1,2]` (k=2 reached)


## Complexity
- **Time Complexity:** O(n)
    - Counting: O(n)
    - Bucket construction: O(n)
    - Collecting results: O(n)
- **Space Complexity:** O(n) (for bucket + map)

## Mistakes I Made
This was a tough one. Wasn't able to come up with the bucket sort logic to retrieve top k frequent elements initially.

