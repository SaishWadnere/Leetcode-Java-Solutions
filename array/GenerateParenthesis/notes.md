# Generate Parentheses

**Difficulty:** Medium

## Pattern
Backtracking / DFS

## Approach / Intuition
We need all valid combinations of n pairs of parentheses.

At any step:
- We can add '(' if the count of open brackets < n
- We can add ')' if the count of close brackets < open count
- Continue recursively until the string length = 2 * n
- Collect all valid strings in the result


## Complexity
- **Time:** O(4ⁿ / √n) (Catalan number complexity)
- **Space:** O(n) recursion depth (ignoring output storage)

## Mistakes I Made
- **Mistake:** Tried generating all 2^(2n) combinations and filtering valid ones → too slow
- **Mistake:** Initially forgot to enforce close < open rule → generated invalid sequences
- **Fix:** Used backtracking with proper constraints for optimal solution