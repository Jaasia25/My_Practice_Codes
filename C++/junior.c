#include<stdio.h>

int isPrime(int n);
int highlow_Prime(int n);
int main()
{
    int n,flag=0,hs,ls;
    printf("Enter a Positive Number: ");
    scanf("%d",&n);
    if(isPrime(n)==n)
    {
        printf("%d is a Prime Number: ",n);
    }
    else
            printf("%d is the closest prime number: ", highlow_Prime(n));
}
int isPrime(int n)
{
    int i,flag=0;
    for(i=2; i<=n/2 ; i++)
    {
        if(n%i==0)
        {
            flag=1;
            break;
        }
    }
 if(flag==0)
    return n;
 else
    return 0;
}
int highlow_Prime(int n)
{
    int input=n,temp=n,min,max;
    while (n>=1)
  {
     if(isPrime(n)==n)
    {
        min=n;
        break;
    }
    n--;
  }
    while (input>=1)
    {
        if(isPrime(input)==input)
        {
            max=input;
            break;
        }
     input++;
    }
    if((temp-min)>(max-temp))
        return max;
    else
        return min;
}
