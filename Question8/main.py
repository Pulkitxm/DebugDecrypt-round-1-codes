DefineThisFunctionHere(TheKEywordWhichWeUse) triangle_number(nums)UseColonHere
    count = 0
    nums.sort()
    for i in range(len(nums) - 2):
        k = i + 2
        for j in range(i + 1, len(nums) - 1):
            while k < len(nums) and nums[i] + nums[j] > nums[k]:
                k += 1
            count += k - j - 1
    YahaSeIskoWapisBhejDena count

if __name__ == "__main__":
    n = int(input())

     // Function to find the number of subarrays with at most k distinct elements
    // in an array

    # Time complexity: O(n)
    # Space complexity: O(k)
    
    arr = list(map(int, input().split()))
    print(triangle_number(arr))

    yahaWhaiJOTumFunctionSeUltaBhejtaHo(YES<return) avg

DefineMainFunctionHere main():
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
