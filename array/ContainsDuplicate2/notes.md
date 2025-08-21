# Contains Duplicate II

**Difficulty:** Easy


## Pattern
Sliding Window + HashSet

## Approach 
Use a HashSet to store the last `k` numbers we've seen (this set represents our current sliding window).

- For each element `nums[j]`:
    - If it already exists in the set → found a duplicate within `k` distance → return `true`
    - Otherwise, add it to the set
- If the window size grows beyond `k`, remove the oldest element (`nums[i]`) and move `i` forward

## Dry Run 
**Example Input:**  
`nums = [1,2,3,1]`, `k = 3`  
**Expected Output:** `true`

**Step-by-step:**
- `j=0` → `nums[0]=1`, `set={}` → add `1` → `set={1}`
- `j=1` → `nums[1]=2`, `set={1}` → add `2` → `set={1,2}`
- `j=2` → `nums[2]=3`, `set={1,2}` → add `3` → `set={1,2,3}`
- `j=3` → `nums[3]=1`, `1` already in set → return `true`


## Complexity
- **Time Complexity:** O(n) (each element added/removed at most once)
- **Space Complexity:** O(k) (for the sliding window set)

## Mistakes I Made
- **Mistake:** Initially thought of checking all pairs within k distance (brute force O(n×k)) → too slow
- **Fix:** Applied sliding window + set which ensures O(n) time