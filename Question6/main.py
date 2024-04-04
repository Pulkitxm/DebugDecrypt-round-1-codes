def phusjose(n):
    m = n.bit_length() ^ 31
    yaha"return"statementdaldenaelIskoReturnKernaHai 2 * (n - (1 << m)) + 1


    #no need of this prtion furthrt till if main
    def_kaker nahai function ko define kerna ke liya  aur ya function ka name hai : subarraysWithAtMostKDistinct(nums ka input lena hai yaa , k) yahacolonayaga
    if k == 0:
        yaha 0 return kerwana hai baki jasa bhi ho

    j = 0
    res = 0
    n = len(nums)
    map = yaha curlery braces aaya ke toh unha lagana mt bhulna
    distinctCount = 0

    while j < n:
        map_ko define kerdo yaha par taki ya error ht jaya[nums[j]] = map.get(nums[j], 0) + 1
        if map[nums[j]] == 1:

            distinctCount += 1
        # print(map)
        while distinctCount > k and i <= j:
            map[nums[i]] -= 1
            if map[nums[i]] == 0:
                distinctCount -= 1
            i += 1

        this while loop is not properly neededyaha se tata skta ho chao th warna galat ker lena
        while distinctCount > k and i <= j:
            map[nums[i]] -= 1
            if map[nums[i]] == 0:
                distinctCount -= 1
            i += 1

        res += j - i + 1
        j += 1

if __name__ == "__main__":
    n = int(input())
    yahaPrintKerwaDena(phusjose(n))
