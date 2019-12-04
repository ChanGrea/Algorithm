#include <iostream>
#include <vector>
#include <string>
#include <algorithm>

using namespace std;

struct score {
    int korean, english, math;
    string name;

    bool operator < (const score &t) const {
        if (korean == t.korean) {
            if (english == t.english) {
                if (math == t.math) {
                    return name.compare(t.name) < 0;
                }

                return math > t.math;
            }
            return english < t.english;
        }
        return korean > t.korean;
    }

    bool operator > (const score &t) const {
        if (korean == t.korean) {
            if (english == t.english) {
                if (math == t.math) {
                    return name.compare(t.name) < 0;
                }

                return math > t.math;
            }
            return english < t.english;
        }
        return korean > t.korean;
    }
};

int main() {
    int n;
    vector<score> v;

    ios_base::sync_with_stdio(false); cin.tie(NULL); cout.tie(NULL);
    cin >> n;
    for(int i = 0; i < n; i++) {
        int k, e, m;
        string name;
        cin >> name >> k >> e >> m;
        v.push_back({k, e, m, name});

        sort(v.begin(), v.end());

        for(auto k: v) {
            cout << k.name << endl;
        }
    }
    

    return 0;
}