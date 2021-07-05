
//12. Write a program in C to sort an array using Count sort

#include<stdio.h>

int main()
{
    int i,j,sum=0;
    int array[14] = {1,2,3,4,2,1,2,2,3,7,8,9,10,9};
    int temp[14];
    int count[11];

    for(i=0; i<11; i++)
    {
        count[i]=0;
    }

    for(i=0; i<14; i++)
    {
        count[(array[i])]++;
    }

    for(i=0; i<11; i++)
    {
        printf("  %d ",count[i]);
    }

    i=0;

    while(i<11)
    {
        j=i+1;
        sum = count[i] + count[i+1];
        count[j] = sum;

        i++;
    }

    printf("\n");

    for(i=0; i<11; i++)
    {
        printf("  %d ",count[i]);
    }

    i = 13;

    while(i>=0)
    {
        j = array[i];
        count[j] = count[j]-1;
        temp[count[j]] = j;

        i--;
    }

    for(i=0; i<14; i++)
    {
        array[i]=temp[i];
    }

    printf("\n\n");

    for(i=0; i<14; i++)
    {
        printf("  %d ",array[i]);
    }

    return 0;
}
