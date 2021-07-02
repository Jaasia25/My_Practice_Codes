#include<stdio.h>

int main()
{
    int a2,b2,c2,a1,b1,c1,x,y;

    printf("Enter the values of a1,b1 and c1: ");
    scanf("%d%d%d",&a1,&b1,&c1);

    printf("Enter the values of a2,b2 and c2: ");
    scanf("%d%d%d",&a2,&b2,&c2);

    int d = (a1*b2-a2*b1);

    if(d!=0)
    {
        x = (b2*c1-b1*c2)/d;
        y = (a1*c2-a2*c1)/d;
    }
    printf("The value of x : %d\nThe value of y : %d\n",x,y);

    return 0;
}
