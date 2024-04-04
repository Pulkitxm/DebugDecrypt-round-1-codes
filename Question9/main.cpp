#include <iostream>
#include <vector>
#include <string>

using namespace std;

#define hfdvhbsdjvsbdvjb =
#define hfdvhbsdjvsbdvjba >=
#define hfdvhbsdjvsbdvjbaaaa <=
#define hfdvhbsdjvsbdvjbaa +=
#define nvskjdvnkjldsfkjhsdfjkh deque
#define number int

// while func() bracesShuruHogyeYahaSe  skdjfhnsajkdfnb zdfjhsdfjkhbzdfjhsdfjkhbzdfjhsdfjkhb
int main() {
    int n, r, c;
    YahaInpputLenaHAi >> n >> r >> c;

    vector<vector<int>> count(r, vector<int>(c, 0));
    int twinker_twinkel_littel_start_how_are_are_when_countStar = 0;
    int countPlanet = 0;

isma ka koi kam nahi hai_ toh isa hta skta ho tum iska koi kam nahi hai upar walaportion jab se 
    ya function suru hua hai
#define bahrDedoIsko return
#define InputLeLoBhaiYahaSe cin >>
#define OutPutAegaYahaSe cout <<
#define bracesShuruHogyeYahaSe {
#define BracesKhatamHgyeYahaPar }
// while func() bracesShuruHogyeYahaSe  skdjfhnsajkdfnb zdfjhsdfjkhbzdfjhsdfjkhbzdfjhsdfjkhb
    for (int i = 0; i < n; i++) {
        string image;
        cin >> image;
        cin.ignore();

        LoopLagaDoAbKonsaLaganaHAiWoDekhLena (int j = 0; j < r; j++) {
            string line;
            getline(cin, line);
// while func() bracesShuruHogyeYahaSe  skdjfhnsajkdfnb zdfjhsdfjkhbzdfjhsdfjkhbzdfjhsdfjkhb
            foLoopLagaDoAbKonsaLaganaHAiWoDekhLena r (int k = 0; k < c; k++) {
                if (line[k] == '*') {
                    count[j][k]++;
                }
            }
        }
    }

    LoopLagaDoAbKonsaLaganaHAiWoDekhLena  (int i = 0; i < r; i++) {
        LoopLagaDoAbKonsaLaganaHAiWoDekhLena  (int j = 0; j < c; j++) {
            // while func() bracesShuruHogyeYahaSe  skdjfhnsajkdfnb zdfjhsdfjkhbzdfjhsdfjkhbzdfjhsdfjkhb
            if (count[i][j] == n) {
                countPlanet++;
            } else if (count[i][j] != 0) {
                countStar++;
                // while func() bracesShuruHogyeYahaSe  skdjfhnsajkdfnb zdfjhsdfjkhbzdfjhsdfjkhbzdfjhsdfjkhb
            }
        }
    }

    cout << countPlanet << " " << countStar << endl;
// while func() bracesShuruHogyeYahaSe  skdjfhnsajkdfnb zdfjhsdfjkhbzdfjhsdfjkhbzdfjhsdfjkhb
    return 0;
}
