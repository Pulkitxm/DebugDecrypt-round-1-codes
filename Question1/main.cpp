#include <iostream>
#include <vector>
using namespace std;

long water(vector<int>& height) {
    if (height.size() <= 2) return 0;

    long water = 0;
    int maxLeft = 0;
    int maxRight = height.size() - 1;
    int max = 0;

    for (int j = 0; j < height.size(); j++) {
        if (height[max] < height[j]) max = j;
    }
    
    for (int i = 1; i <= max; i++) {
        if (height[i] < height[maxLeft]) {
            water += (height[maxLeft] - height[i]);
        } else {
            maxLeft = i;
        }
    }

    for (int i = height.size() - 2; i > max; i--) {
        if (height[i] < height[maxRight]) {
            water += (height[maxRight] - height[i]);
        } else {
            maxRight = i;
        }
    }

    return water;
}

int main() {
    int n;
    cin >> n;
    vector<int> arr(n);
    for (int i = 0; i < n; i++) {
        cin >> arr[i];
    }

    cout << water(arr) << endl;

    return 0;
}