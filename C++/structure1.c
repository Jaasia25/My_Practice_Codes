#include<stdio.h>

struct Jaasia
{
    int a1;
    char a2[10];
    float a3;
};

struct Vector
{
    double x;
    double y;
};

int main()
{
    struct Vector V;

    V.x = 2.0;
    V.y = 3.0;

    printf("Vector V has co ordinates: %.2lfi %.2lfj\n",V.x,V.y);
    return 0;
}
