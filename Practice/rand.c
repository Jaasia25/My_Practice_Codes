#include<stdio.h>

int main()
{
    int a[7], i;

    for(i=0; i<7; i++)
    {
        a[i]= rand()%100+1;
    }

    for(int k=1; k<=7; k++)
    {
        i=0;

        while(i<(7-k))
        {
            if(a[i]>a[i+1])
            {
                a[i]= a[i]- a[i+1];
                a[i+1]= a[i]+a[i+1];
                a[i]= a[i+1]- a[i];

            }
            i++;
        }
    }

    for(i=0; i<7; i++)
    {
        printf("%d\t",a[i]);
    }
}
