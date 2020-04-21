#include <iostream>

using namespace std;

int main() {
    int passengers = 0, max = 0;;

    for(int i = 0; i < 4; i++) {
        int out, in;
        cin >> out >> in;

        passengers = passengers + in - out;
        if(passengers > max)
            max = passengers;
    }

    cout << max << endl;
    
    return 0;
}