#include<stdio.h>

int main()
{
    int ara[] = {10,20,30,40,50,60,70,80,90,100};
    int i,j,temp;

    for(i=0, j=9; i<(10/2); i++,j--)
    {
        temp=ara[j];
        ara[j]=ara[i];
        ara[i]= temp;
    }

    for(i=0; i<10; i++)
    {
        printf("\t%d",ara[i]);
    }

    return 0;
}
