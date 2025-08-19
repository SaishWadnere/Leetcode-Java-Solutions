# Valid Anagram
**Difficulty:** Easy


## Pattern
Hashing / Frequency Count

## Approach
Since input only contains lowercase letters, we can use a fixed array of size 26 to store frequencies.

- For each index `i`:
    - Increment the count for `s[i]`
    - Decrement the count for `t[i]`
- If the strings are true anagrams, the count array will end up all zeros
- If any entry is non-zero → not anagram

## Dry Run
**Example Input:**  
`s = "anagram"`, `t = "nagaram"`  
**Expected Output:** `true`

**Step-by-step:**  
Start: `arr = [0, 0, 0, ..., 0]` (26 zeros)

Process characters:
- `'a'` vs `'n'`: `arr['a']++ → arr[0]=1`, `arr['n']-- → arr[13]=-1`


- `'n'` vs `'a'`: `arr['n']++ → arr[13]=0`, `arr['a']-- → arr[0]=0`


- `'a'` vs `'g'`: `arr['a']++ → arr[0]=1`, `arr['g']-- → arr[6]=-1`


- `'g'` vs `'a'`: `arr['g']++ → arr[6]=0`, `arr['a']-- → arr[0]=0`


- `'r'` vs `'r'`: `arr['r']++ → arr[17]=1`, `arr['r']-- → arr[17]=0`


- `'a'` vs `'a'`: `arr['a']++ → arr[0]=1`, `arr['a']-- → arr[0]=0`


- `'m'` vs `'m'`: `arr['m']++ → arr[12]=1`, `arr['m']-- → arr[12]=0`

Final `arr` = all zeros → `true`


## Complexity
- **Time Complexity:** O(n) (single pass + fixed 26 array check)
- **Space Complexity:** O(1) (constant 26-length array)

## My thoughts
-This was easy question. First i came HashMap solution. Then learned frequency count approach