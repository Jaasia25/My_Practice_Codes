#include<stdio.h>

int main()
{
    int a, b, r, temp, gcd, lcd;

    printf("Enter two numbers : ");
    scanf("%d%d",&a,&b);

    if(b>a)
    {
        temp = a;
        a = b;
        b = temp;
    }

    int d = a*b;

    while(b!=0)
    {
        r = b;
        b = a%b;
        a = r;
    }

    gcd = a;

    lcd = d/gcd;

    printf("GCD is %d\n",gcd);
    printf("LCD is %d\n",lcd);

    return 0;
}
