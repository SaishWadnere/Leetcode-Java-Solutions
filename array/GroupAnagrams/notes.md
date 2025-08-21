# Group Anagrams

**Difficulty:** Medium

## Pattern
HashMap (with frequency signature as key)

## Approach 
Instead of sorting each string (O(m log m) per string), we can:
- Count the frequency of each character (since only lowercase letters a-z)
- Represent this frequency as a signature string (e.g., "a1e1t1")
- Use this signature as a key in a HashMap
- Group all words with the same signature together

This avoids sorting and brings the complexity closer to linear in total characters.

## Dry Run
**Example Input:**  
`["eat","tea","tan","ate","nat","bat"]`  
**Expected Output:**  
`[["eat","tea","ate"], ["tan","nat"], ["bat"]]`



- `key1` = [1,0,0,0,1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0]
- `key2` = [1,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,1,0,0,0,0,0,0,0]
- `key3` = [1,1,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,1,0,0,0,0,0,0,0]

**Step-by-step:**
1. Word = "eat"
    - freq = [a:1, e:1, t:1] → key= `key1`
    - `map["key1"] = ["eat"]`


2. Word = "tea"
    - freq → key=`key1`
    - `map["key1"] = ["eat","tea"]`


3. Word = "tan"
    - freq → key=`key2`
    - `map["key2"] = ["tan"]`


4. Word = "ate"
    - freq → key=`key1`
    - `map["key1"] = ["eat","tea","ate"]`


5. Word = "nat"
    - key=`key2`
    - `map["key2"] = ["tan","nat"]`


6. Word = "bat"
    - key=`key3`
    - `map["key3"] = ["bat"]`


**Result:** `[["eat","tea","ate"],["tan","nat"],["bat"]]`


## Complexity
- **Time Complexity:** O(n × m)  
  (where n = number of words, m = length of each word - processing chars)
- **Space Complexity:** O(n × m) (for hashmap keys + output storage)

## Mistakes I Made
**First thought:** "Sort each string and group by sorted value"
- Works but slower (O(m log m) per string)  
  **Fix:** Used frequency counting signature for better performance