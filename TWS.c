#include <iostream>
#include <iomanip>
using namespace std;

int main() {
    int x;
    int d = 16;

    cout << "Welcome to the Ounce Conversion Program!" << endl << endl;
    cout << "How many ounces do you have? ";
    cin >> x;
    cout << "Thank you! Converting ounces to pounds." << endl << endl;

    int lbs = x / d;
    int oz = x % d;
    double dec = x / 16.0;

    cout << x << " oz is equivalent to " << lbs << " lbs and " << oz << " oz." << endl;
    cout << x << " oz is equivalent to " << fixed << setprecision(4) << dec << " lbs." << endl << endl;

    cout << "Thank you for using the OCP!" << endl;
    return 0;
}
