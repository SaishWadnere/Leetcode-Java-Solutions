# Minimum Size Subarray Sum

**Difficulty:** Medium

## Pattern
Sliding Window (Two Pointers)

## Approach / Intuition
- Expand the right pointer `j` to increase the sum
- Shrink the left pointer `i` while the sum is ≥ target to minimize window length
- Keep track of the minimum length found

## Dry Run
**Input:**  
`target = 7`  
`nums = [2,3,1,2,4,3]`

**Steps:**
- `j=0` → `sum=2` (not enough)
- `j=1` → `sum=5` (not enough)
- `j=2` → `sum=6` (not enough)
- `j=3` → `sum=8` ≥ 7 → `length=4` → shrink
    - shrink `i=0` → `sum=6`
- `j=4` → `sum=10` ≥ 7 → `length=4` → shrink
    - shrink `i=1` → `sum=7` ≥ 7 → `length=3` → shrink
    - shrink `i=2` → `sum=4`
- `j=5` → `sum=7` ≥ 7 → `length=3` → shrink
    - shrink `i=3` → `sum=5`

**Answer:**  
Minimum length = 2 (subarray `[4,3]`)

## Complexity
- **Time:** O(n) (each element visited at most twice)
- **Space:** O(1)

## Mistakes I Made
- **Mistake:** Initially tried brute force (nested loops) → O(n²)
- **Mistake:** Forgot to shrink the window properly → missed smaller valid subarrays
- **Fix:** Properly implemented sliding window with two pointers