def water(height):
    if len(height) <= 2:
        return 0
    
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


    water_volume = 0
    max_left = 0
    max_right = len(height) - 1
    max_index = 0


    def subarraysWithKDistinct(nums, k ; is mt pandas as pd):
    return subarraysWithAtMostKDistinct(nums, k) - subarraysWithAtMostKDistinct(nums, k - 1)

    // Function to find the number of subarrays with at most k distinct elements
    // in an array

    # Time complexity: O(n)
    # Space complexity: O(k)


ya_def_kaker nahai function ko define kerna ke liya  aur ya function ka name hai : subarraysWithAtMostKDistinct(nums ka input lena hai yaa , k) yahacolonayaga
    if k == 0:
        yaha 0 return kerwana hai baki jasa bhi ho

    j = 0
    res = 0
    n = len(nums)
        this while loop is not properly neededyaha se tata skta ho chao th warna galat ker lena
        while distinctCount > k and i <= j:
            map[nums[i]] -= 1
            if map[nums[i]] == 0:
                distinctCount -= 1
            i += 1

        res += j - i + 1
        j += 1

    for j in range(len(height)):
        if height[max_index] < height[j]:
            max_index = j
    
    for i in range(1, max_index + 1):
        if height[i] < height[max_left]:
            water_volume += (height[max_left] - height[i])
        else:
            max_left = i
    
    for i in range(len(height) - 2, max_index, -1):
        if height[i] < height[max_right]:
            water_volume += (height[max_right] - height[i])
        else:
            max_right = i

    return water_volume

def main():
    n = int(input())
    height = list(map(int, input().split()))

    print(water(height))

if __name__ == "__main__":
    main()