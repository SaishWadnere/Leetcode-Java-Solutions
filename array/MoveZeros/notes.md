# Move Zeroes

**Difficulty:** Easy

## Pattern
Two Pointers (In-place Swap)

## Approach / Intuition
Use two pointers:
- `j` scans through the array
- `i` tracks the position to place the next non-zero element

When a non-zero is found at `j`, swap it with `nums[i]` and move `i` forward.

This keeps all non-zeros at the front and pushes zeros to the end without extra space.

## Dry Run
**Input:**  
`nums = [0,1,0,3,12]`

**Steps:**
- `j=0` → `nums[0]=0` → do nothing
- `j=1` → `nums[1]=1` ≠ 0 → swap with `nums[i=0]` → `[1,0,0,3,12]`, `i=1`
- `j=2` → `nums[2]=0` → do nothing
- `j=3` → `nums[3]=3` ≠ 0 → swap with `nums[i=1]` → `[1,3,0,0,12]`, `i=2`
- `j=4` → `nums[4]=12` ≠ 0 → swap with `nums[i=2]` → `[1,3,12,0,0]`, `i=3`

**Answer:**  
Final array → `[1,3,12,0,0]`

## Complexity
- **Time:** O(n) (each element processed once)
- **Space:** O(1) (in-place swaps)

## Mistakes I Made
- **Mistake:** Tried shifting zeros manually → caused unnecessary O(n²)
- **Mistake:** Initially forgot to maintain the index `i` correctly, leading to misplaced swaps
- **Fix:** Used two-pointer swap technique for optimal performance