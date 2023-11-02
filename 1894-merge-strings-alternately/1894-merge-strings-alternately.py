class Solution(object):
    def mergeAlternately(self, word1, word2):
        """
        :type word1: str
        :type word2: str
        :rtype: str
        """
        i = 0
        j = 0
        word = ''
        while (i < len(word1) and j < len(word2)):
            word += word1[i]
            word += word2[i]
            i+=1
            j+=1
        
        if (i < len(word1)):
            word += word1[i: len(word1)]

        elif (j < len(word2)):
            word += word2[i: len(word2)]

        return word 

        
