#include<stdio.h>

//7.Write a program in C to merge two arrays of same
//  size sorted in descending order.

int main()
{
    int a[5]= {1,2,-2,4,0};
    int b[5]= {4,5,-5,6,7};
    int c[10];
    int i,j=0,k=0;

    for(i=0; i<10; i++)
    {
        if(i<5)
            c[i]= a[i];
        else
            c[i] = b[i-5];
    }

    for(i=0; i<10; i++)
    {
        printf("%d\t",c[i]);
    }

    for(i=0; i<10; i++)
    {
        for(j=0; j<10-1; j++)
        {
            if(c[j]<=c[j+1])
            {
                k= c[j+1];
                c[j+1]= c[j];
                c[j]= k;
            }
        }

    }

    printf("\n");

    for(i=0; i<10; i++)
    {
        printf("%d\t",c[i]);
    }

    return 0;
}
