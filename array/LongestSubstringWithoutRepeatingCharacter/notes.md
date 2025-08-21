# Longest Substring Without Repeating Characters

**Difficulty:** Medium

## Pattern
Sliding Window + HashSet (to track unique characters)

## Approach
Use a sliding window with two pointers (`left` for left, `right` for right).

- Expand `right` until we hit a duplicate
- If duplicate found, shrink from the left (`left`) until it's valid again
- Keep track of the maximum window size
- HashSet helps us quickly check if a character already exists in the window

This is the classic sliding window template.

## Dry Run
**Example Input:**  
`s = "abcabcbb"`  
**Expected Output:** `3` ("abc")

**Step-by-step:**
- `set = {}`, `left = 0`, `maxLen = 0`

- `right=0` → 'a' not in set → add → `set={'a'}`, `maxLen=1`


- `right=1` → 'b' not in set → add → `set={'a','b'}`, `maxLen=2`


- `right=2` → 'c' not in set → add → `set={'a','b','c'}`, `maxLen=3`


- `right=3` → 'a' in set → remove `s[left]='a'`, `left=1` → `set={'b','c'}`
    - add 'a' → `set={'b','c','a'}`, `maxLen=3`


- `right=4` → 'b' in set → remove `s[left]='b'`, `left=2` → `set={'c','a'}`
    - add 'b' → `set={'c','a','b'}`, `maxLen=3`


- `right=5` → 'c' in set → remove `s[left]='c'`, `left=3` → `set={'a','b'}`
    - add 'c' → `set={'a','b','c'}`, `maxLen=3`


- `right=6` → 'b' in set → remove `s[left]='a'`, `left=4` → `set={'b','c'}`
    - 'b' still in set → remove `s[left]='b'`, `left=5` → `set={'c'}`
    - add 'b' → `set={'c','b'}`, `maxLen=3`


- `right=7` → 'b' in set → remove `s[left]='c'`, `left=6` → `set={'b'}`
    - 'b' still in set → remove `s[left]='b'`, `left=7` → `set={}`
    - add 'b' → `set={'b'}`, `maxLen=3`

**Final Answer:** `3`


## Complexity
- **Time Complexity:** O(n) (each character added/removed at most once)
- **Space Complexity:** O(min(n, charset)) (set stores at most unique chars in window)

## My Thoughts
This was a tough one. I needed to study sliding window first. Still wasn't able to solve this question initially without guidance.

