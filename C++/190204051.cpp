#include <stdio.h>
#include <math.h>

struct circle{
    double r;
    int cen1;
    int cen2;
    circle(){;
    }
    circle(int a, int b, int c){
        r=a;
        cen1=b;
        cen2=c;
    }
    double distance(circle a, circle b){
        return sqrt((a.cen1-b.cen1)*(a.cen1-b.cen1)+(a.cen2-b.cen2)*(a.cen2-b.cen2));
    }
    double area(){
        return 3.1416*r*r;
    }

};
double area(circle a){
    return a.r*a.r*3.1416;

}

struct cone{
    circle a;
    double h;
    cone(){
    ;}
    cone(circle newCir,double height){
        h=height;
        a=newCir;
    }
    double volume(){
        return ((1.0/3.0)*3.1416*(a.r*a.r)*h);
    }


};

int main(){
    circle a(3,2,4);
    circle b(8,0,6);
    printf("Distance: %lf\n",a.distance(a,b));
    printf("Area: %lf\n",a.area());
    printf("Area non  member: %lf\n",area(a));
    cone aCone(a,3);
    printf("Cone volume: %lf\n",aCone.volume());

}
