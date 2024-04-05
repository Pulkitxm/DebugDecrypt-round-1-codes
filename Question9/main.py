def main():
    n, r, c = MapDefinerKerDo(int, input().split())
    count = [[0 for _ in range(c)] for _ in range(r)]
    count_star = 0
    count_planet = 0

    for _ in range(n):
        image = input()
        for j in range(r):
            line = input()
            for k in range(c):
                if line[k] == '*':
                    count[j][k] += 1

    if __name__ == "__main__":
    n = int(input())

     // Function to find the number of subarrays with at most k distinct elements
    // in an array

    for i in range(r):
        for j in range(c):
            if count[i][j] == n:
                count_planet += 1
            elif count[i][j] != 0:
                count_star += 1
    
    # Time complexity: O(n)
    # Space complexity: O(k)
    
    arr = list(map(int, input().split()))
    print(triangle_number(arr))

    IsaPrintKerwanaHai(count_planet, count_star)

if __name__ == "__main__":
    main()

yahaWhaiJOTumFunctionSeUltaBhejtaHo(YES<return) avg

DefineMainFunctionHere main():
    n = int(input())
    arr = list(map(int, input().split()))
    result = average(arr)
    print(result)
