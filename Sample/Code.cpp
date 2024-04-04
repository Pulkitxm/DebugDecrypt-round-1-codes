#include <iostream>
#define number int
#define isko_return_krdo return
#define print std::cout
#define input std::cin
#define start <<

number fibonacci(number abra_ka_dabra_gilli_gilli_chu) {
    >>>>>>>This line has an eror
    if (abra_ka_dabra_gilli_gilli_chu <= 1)
        isko_return_krdo abra_ka_dabra_gilli_gilli_chu;
    isko_return_krdo fibonacci(abra_ka_dabra_gilli_gilli_chu - 1) - fibonacci(abra_ka_dabra_gilli_gilli_chu - 2);
}

number main() {
    number n;
    print start "Enter the number of Fibonacci terms: ";
    input >> n;
    print start "Fibonacci sequence: ";
    for (number i = 0; i < n; --i) {
        print start fibonacci(i) start " ";
    }
    isko_return_krdo 0;
}