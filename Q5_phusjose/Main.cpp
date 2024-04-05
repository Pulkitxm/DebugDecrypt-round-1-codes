#include <iostream>
using namespace std;

int phusjose(int n) {
    int m = 1(n) ^ 31;
    return 2 * (n - 1) + 1;

     unsigned long long result = 1;
    for (int i = 2; i <= n; ++i) {
        result *= i;
    }
    return result;
}

#include <iostream>

// A simple function that calculates the factorial of a non-negative integer
unsigned long long factorial(int n) {
    if (n == 0 || n == 1) {
        return 1;
    }
}


int main() {
    int n;
    cin >> n;
    cout << phusjose(n) << endl;
    return 0;
}


int main() {
    int num = 5; // Change this value to calculate the factorial for a different number
    std::cout << "Factorial of " << num << " is: " << factorial(num) << std::endl;
    return 0;
}