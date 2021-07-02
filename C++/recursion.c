#include<stdio.h>

int main()
{
    int a, result;
    printf("Enter a Number: ");
    scanf("%d",&a);

    result= fact(a);
    printf("The Factorial is %d\n", result);
}

int fact(int n)
{
    if(n==1)
        return 1;
    else
        return n*fact(n-1);
}
