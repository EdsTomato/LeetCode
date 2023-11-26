class Solution(object):
    def containsDuplicate(self, nums):
        mySet = set()

        for n in nums:
            if n in mySet:
                return True
            mySet.add(n)
        return False