#include<bits/stdc++.h>
using namespace std;

#define pi 3.1416


struct Sphere {
	double x, y, z, r;

	Sphere (double x, double y, double z, double r) {
		this->x = x;
		this->y = y;
		this->z = z;
		this->r = r;
	}

};

double SpVolume (double r) {
		return (4.0 / 3.0) * pi * r * r * r;
	}

double SpDistance(Sphere s1, Sphere s2) {
	return sqrt ((s2.x - s1.x) * (s2.x - s1.x) + (s2.y - s1.y) * (s2.y - s1.y) + (s2.z - s1.z) * (s2.z - s1.z));
}

bool SpIntersection(Sphere s1, Sphere s2) {
	if (SpDistance(s1, s2) < s1.r + s2.r) {
		return true;
	}
	else {
		return false;
	}
}

int main () {
	struct Sphere s1 (14.5, 20.32, 40.76, 20.98);
	struct Sphere s2 (34.5, 40.09, 60.65, 11.56);

	double vol, dis;

	vol= SpVolume(s1.r);
    cout << "The Sphere's volume : " << vol << endl;

	dis = SpDistance(s1, s2);
	cout << "Distance between two Spheres : " << dis << endl;

	if(SpIntersection(s1, s2))
        cout << "Spheres intersect each other" << endl;

    else
        cout << "Spheres do not intersect each other" << endl;
}
