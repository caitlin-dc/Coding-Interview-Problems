class Solution(object):
    def isIsomorphic(self, s, t):
        my_dict = {}
        for i in range(len(s)):
            if s[i] in my_dict.keys():
                if my_dict[s[i]] != t[i]:
                    return False
            elif t[i] in my_dict.values():
                return False
            else:
                my_dict[s[i]] = t[i]
        return True
