#include<stdio.h>

int main()
{
    int n,*p;
    printf("Enter the Integer: ");
    scanf("%d",&n);

    p=&n;

    printf("The address of n: %d",p);

    //m= n*2;
    p+1= p*2;

    printf("The value of n*2 is %d and the address is %d\n",n*2,(p+1));
}


