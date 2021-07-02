#include <stdio.h>
#include <math.h>

struct Sphere {
	int x;
	int y;
	int z;
	int radius;

	Sphere (int x1, int y1, int z1, int radius1) {
		x = x1;
		y = y1;
		z = z1;
		radius = radius1;
	}

	double Volume () {
		return (4.0 / 3.0) * acos (-1.0) * radius * radius * radius;
	}
};

double Distance(Sphere sp1, Sphere sp2) {
	return sqrt ((sp2.x - sp1.x) * (sp2.x - sp1.x) + (sp2.y - sp1.y) * (sp2.y - sp1.y) + (sp2.z - sp1.z) * (sp2.z - sp1.z));
}

void Intersect(Sphere sp1, Sphere sp2) {
	if (Distance(sp1, sp2) < sp1.radius + sp2.radius) {
		printf("Spheres Intersect");
	}
	else {
		printf("Spheres Don't Intersect");
	}
}

int main () {
	struct Sphere sp1 (0, 0, 0, 20);
	struct Sphere sp2 (20, 20, 20, 10);

	printf ("Volume of the sphere is : %lf\n", sp1.Volume ());
	printf ("Distance of two spheres from center to center is : %lf\n", Distance(sp1, sp2));
	Intersect(sp1, sp2);
}
