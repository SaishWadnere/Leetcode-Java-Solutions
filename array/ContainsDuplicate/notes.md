# Contains Duplicate
**Difficulty:** Easy

## Pattern
HashSet (detect duplicates while iterating)

## Approach
Maintain a HashSet to keep track of numbers we've already seen.

- As we iterate through `nums`:
    - If the number already exists in the set → duplicate found → return `true`
    - Otherwise, add it to the set
- If we finish without finding duplicates → return `false`

Super straightforward and efficient.

## Dry Run
**Example Input:**  
`nums = [1,2,3,1]`  
**Expected Output:** `true`

**Step-by-step:**
- `num=1` → `set={}` → add → `set={1}`
- `num=2` → `set={1}` → add → `set={1,2}`
- `num=3` → `set={1,2}` → add → `set={1,2,3}`
- `num=1` → already in set → duplicate found → return `true` ✅

## Complexity
- **Time Complexity:** O(n) (each lookup/add in HashSet is O(1) average)
- **Space Complexity:** O(n) (in worst case all elements unique)

## Mistakes I Made
- **Mistake:** At first, thought of sorting and checking neighbors → O(n log n)
- **Fix:** Realized HashSet gives O(n) clean solution

## Edge Cases Considered
- Empty array → `false`
- Single element → `false`
- All elements same → `true`