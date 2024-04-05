def main():
    n, r, c = map(int, input().split())
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

    for i in range(r):
        for j in range(c):
            if count[i][j] == n:
                count_planet += 1
            elif count[i][j] != 0:
                count_star += 1

    print(count_planet, count_star)

if __name__ == "__main__":
    main()
