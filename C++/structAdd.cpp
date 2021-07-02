#include<stdio.h>

struct Vec
{
    double x;
    double y;

    Vec()
    {;
    }

    Vec(double a, double b)
    {
        x=a;
        y=b;
    }

    void printVec()
    {
        printf("%.2lfi %.2lfj\n",x,y);
    }

};

Vec vecadd(Vec v1, Vec v2)
    {
        Vec SV;
        SV.x= v1.x+ v2.x;
        SV.y= v1.y+ v2.y;
        return SV;
    }

int main()
{
    struct Vec v1(2.0,3.0), v2(4.0,5.0), SV;
    printf("Vector 1 has Co-ordinates: ");
    v1.printVec();

    printf("Vector 2 has Co-ordinates: ");
    v2.printVec();

    SV = vecadd(v1,v2);
    printf("Resultant Vector has Co-ordinates: ");
    SV.printVec();

    return 0;
}


