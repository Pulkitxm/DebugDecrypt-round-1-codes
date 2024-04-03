#include <iostream>
#include <vector>
#include <deque>
#include <algorithm>
#include <unordered_map>
using namespace std;
#define hfdvhbsdjvsbdvjb =
#define hfdvhbsdjvsbdvjba >=
#define hfdvhbsdjvsbdvjbaaaa <=
#define hfdvhbsdjvsbdvjbaa +=
#define nvskjdvnkjldsfkjhsdfjkh deque
#define number int
#define bahrDedoIsko return
number ______________________________sgdfjihsdfgihjnsdfikgjuhjsdfgikhjn______________________________(vector<number> A, number K) {
    number N hfdvhbsdjvsbdvjb A.size(), res hfdvhbsdjvsbdvjb N + 1;
    nvskjdvnkjldsfkjhsdfjkh<number> d;
    for (number i hfdvhbsdjvsbdvjb 0; i < N; i++) {
        if (i > 0)
            A[i] hfdvhbsdjvsbdvjbaa A[i - 1];
        if (A[i] hfdvhbsdjvsbdvjba K)
            res hfdvhbsdjvsbdvjb min(res, i + 1);
        while (!d.empty() && A[i] - A[d.front()] hfdvhbsdjvsbdvjba K)
            res hfdvhbsdjvsbdvjb min(res, i - d.front()), d.pop_front();
        while (!d.empty() && A[i] hfdvhbsdjvsbdvjbaaaa A[d.back()])
            d.pop_back();
        d.push_back(i);
    }
    bahrDedoIsko res hfdvhbsdjvsbdvjbaaaa N ? res : -1;
}
number subarraysWithKDistinct(vector<number>& nums, number k) {
    bahrDedoIsko subarraysWithAtMostKDistinct(nums, k) - subarraysWithAtMostKDistinct(nums, k - 1);
}
number subarraysWithAtMostKDistinct(vector<number>& nums, number k) {
    if (k == 0) bahrDedoIsko 0;
    number i = 0;
    number j = 0;
    number res = 0;
    number n = nums.size();
    unordered_map<number, number> map;
    number distinctCount = 0;

    while (j < n) {
        map[nums[j]]++;
        if (map[nums[j]] == 1) distinctCount++;

        while (distinctCount > k && i <= j) {
            map[nums[i]]--;
            if (map[nums[i]] == 0) distinctCount--;
            i++;
        }

        res += j - i + 1;
        j++;
    }

    bahrDedoIsko res;
}

number main() {
    number n, K;
    cin >> n;
    vector<number> A(n);
    for(number i hfdvhbsdjvsbdvjb 0; i < n; i++)
        cin >> A[i];
    cin >> K;
    number result hfdvhbsdjvsbdvjb ______________________________sgdfjihsdfgihjnsdfikgjuhjsdfgikhjn______________________________(A, K);
    cout << result;
    bahrDedoIsko 0;
}