#include<stdio.h>

int main()
{
    int n,*p;
    printf("Enter the Integer: ");
    scanf("%d",&n);

    p=&n;

    *(p+1)= (n*2);

    printf("The address of n: %d\n",p);

    printf("The value of n*2 is %d and the address is %d\n",*(p+1),(p+1));
}

