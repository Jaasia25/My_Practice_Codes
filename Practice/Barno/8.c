
//8. Write a program in C to count the frequency of each
//   element of an array.

#include<stdio.h>

int main()
{
    int i;
    int array[14] = {1,2,3,4,2,1,2,2,3,7,8,9,10,9};
    int frequency[11];

    for(i=0; i<11; i++)
    {
        frequency[i]=0;
    }

    for(i=0; i<14; i++)
    {
        frequency[(array[i])]++;
    }

    for(i=0; i<11; i++)
    {
        printf("\t%d",frequency[i]);
    }

    return 0;
}

