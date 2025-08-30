# Happy Number 
**Difficulty:** Easy

## Pattern
HashSet cycle detection (to avoid infinite loops)  
Can also be solved with Floyd's cycle detection (tortoise & hare)

## Approach
- Keep a set of numbers we've already seen
- Each time, replace `n` with the sum of squares of its digits
- If `n == 1` → happy number
- If we ever see the same number again → loop detected → unhappy

## Dry Run 
**Example Input:**  
`n = 19`

**Steps:**
- `19` → 1² + 9² = `82`
- `82` → 8² + 2² = `68`
- `68` → 6² + 8² = `100`
- `100` → 1² + 0² + 0² = `1` ✅

So `19` is a happy number.

## Complexity
- **Time Complexity:** O(log n) per iteration, but in practice bounded (digits squared sum shrinks fast)
- **Space Complexity:** O(log n) (for HashSet storing seen numbers)

## Mistakes I Made
- **Mistake:** Initially forgot to detect cycles → infinite loop for unhappy numbers
- **Fix:** Added HashSet to track seen numbers and detect cycles
- **Note:** Some numbers loop (e.g., 2) rather than reducing to 1