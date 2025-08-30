# Merge Sorted Array
**Difficulty:** Easy

## Pattern
Two pointers (merge step of merge sort)

## Approach
Use two pointers (`i` for `nums1`, `j` for `nums2`).
- Compare elements and fill a temporary merged array
- Copy merged result back into `nums1`
- *Optimized approach:* merge in-place from the back without extra array

## Dry Run
**Input:**  
`nums1 = [1,2,3,0,0,0]`, `m = 3`  
`nums2 = [2,5,6]`, `n = 3`

**Steps:**
- `i=0`, `j=0` → compare `1` & `2` → `merged=[1]`
- `i=1`, `j=0` → compare `2` & `2` → `merged=[1,2]`
- `i=2`, `j=0` → compare `3` & `2` → `merged=[1,2,2]`
- `i=2`, `j=1` → compare `3` & `5` → `merged=[1,2,2,3]`
- `nums1` exhausted → copy rest of `nums2` → `merged=[1,2,2,3,5,6]`

**Final nums1:** `[1,2,2,3,5,6]`

## Complexity
- **Time:** O(m + n)
- **Space:** O(m + n) (extra array used)
- *Optimized solution:* O(1) extra space

## Mistakes I Made
- **Mistake:** Tried merging directly into `nums1` from the front → overwrote valid elements
- **Mistake:** Forgot to handle leftover elements in either array
- **Fix:** Use temporary array or merge from the back