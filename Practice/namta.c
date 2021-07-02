#include<stdio.h>

int main()
{
    int i=10;

    while(i<=99)
    {
        if(i%11==0)
        {
            printf("\t%d",i);
        }
        i++;
    }
}
