# 1.Two Sum

**Difficulty:** Easy

## Pattern
HashMap for complement lookup

## Approach / Intuition
- When at element `nums[i]`, the number we need is `target - nums[i]`.
- If we’ve already seen that number before, we can immediately return the pair.
- Use a HashMap to store `value → index` while iterating.
- This gives **O(n)** time since both lookup and insert in a HashMap are **O(1)**.

## Dry Run 
**Example Input:**  
`nums = [2, 7, 11, 15]`, `target = 9`  
**Expected Output:** `[0, 1]`

**Step-by-step:**
1. `map = {}`
    - `i=0` → `nums[0]=2` → need `x=7` → not found → put `(2,0)` → `map={2:0}`
    - `i=1` → `nums[1]=7` → need `x=2` → found in map → return `[0,1]`

## Mistakes I Made

- **Mistake:** Initially thought of forming pairs using nested loops.
- **Fix:** Realized it is like linear equation (we have two values and we can find other) .


## Complexity
- **Time Complexity:** O(n) (one pass, each lookup/insert O(1))
- **Space Complexity:** O(n) (HashMap may store all elements in worst case)  