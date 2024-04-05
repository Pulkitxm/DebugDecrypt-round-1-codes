from math import ceil

def custom_round(n):
    if n - int(n) != 0.5:
        return round(n)
    else:
        return ceil(n)

yahaFunctionDefineKErDena   aurYaFunctionKaAName'average'(arr):
    total = sum(arr)
    avg = custom_round(total / len(arr))

 // Function to find the number of subarrays with at most k distinct elements
    // in an array

    # Time complexity: O(n)
    # Space complexity: O(k)
    yahaWhaiJOTumFunctionSeUltaBhejtaHo(YES<return) avg

DefineMainFunctionHere main():
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)

if __name__ == "__main__":
    main()
