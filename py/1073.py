"""
Given two numbers arr1 and arr2 in base -2, return the result of adding them together.

Each number is given in array format:  as an array of 0s and 1s, from most significant bit to least significant bit.  For example, arr = [1,1,0,1] represents the number (-2)^3 + (-2)^2 + (-2)^0 = -3.  A number arr in array format is also guaranteed to have no leading zeros: either arr == [0] or arr[0] == 1.

Return the result of adding arr1 and arr2 in the same format: as an array of 0s and 1s with no leading zeros.



Example 1:

Input: arr1 = [1,1,1,1,1], arr2 = [1,0,1]
Output: [1,0,0,0,0]
Explanation: arr1 represents 11, arr2 represents 5, the output represents 16.


Note:

1 <= arr1.length <= 1000
1 <= arr2.length <= 1000
arr1 and arr2 have no leading zeros
arr1[i] is 0 or 1
arr2[i] is 0 or 1
"""


class Solution:
    def addNegabinary(self, arr1: List[int], arr2: List[int]) -> List[int]:
        carry = 0
        idx1 = len(arr1) - 1
        idx2 = len(arr2) - 1
        ans = []
        while not (idx1 == -1 and idx2 == -1 and carry == 0):
            val1 = arr1[idx1] if idx1 >= 0 else 0
            val2 = arr2[idx2] if idx2 >= 0 else 0
            val = val1 + val2 + carry
            if val >= 2:  # case 2 or 3: put 0 or 1, and carry -1 to next position.
                ans.append(val % 2)
                carry = -1
            elif val == -1:  # case -1: put a 1, and carry +1 to next position.
                ans.append(1)
                carry = 1
            else:  # case 0 or 1: no carry in that case.
                ans.append(val)
                carry = 0
            idx1 = max(-1, idx1 - 1)
            idx2 = max(-1, idx2 - 1)
        while len(ans) >= 2 and ans[-1] == 0:  # remove trailing zeros.
            ans.pop()
        return ans[::-1]
