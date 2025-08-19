# Best Time to Buy and Sell Stock
**Difficulty:** Easy

## Pattern
Greedy (Tracking Minimum & Maximum Difference)

## Approach

To maximize profit, we just need to know the lowest price so far and see what profit we could make if we sell today.

- Keep track of the running minimum `minPrice`
- For each price, calculate `profit = price - minPrice`
- Update `maxProfit` whenever we find a bigger profit
- Only one pass, very efficient

## Dry Run 
**Example Input:**  
`prices = [7, 1, 5, 3, 6, 4]`  
**Expected Output:** `5` (buy at 1, sell at 6)

**Step-by-step:**
- `minPrice = ∞`, `maxProfit = 0`
- `price=7` → `minPrice=7` → `profit=0` → `maxProfit=0`
- `price=1` → `minPrice=1` → `profit=0` → `maxProfit=0`
- `price=5` → `profit=5-1=4` → `maxProfit=4`
- `price=3` → `profit=3-1=2` → `maxProfit=4`
- `price=6` → `profit=6-1=5` → `maxProfit=5`
- `price=4` → `profit=4-1=3` → `maxProfit=5`

**Final Answer:** `5`


## Complexity
- **Time Complexity:** O(n) (single pass)
- **Space Complexity:** O(1) (only variables)

## Mistakes I Made
- **Mistake:** Didn't come up with logic.Needed to watch a video
