#include<stdio.h>

void swap(int *a, int *b)
{
    int temp;
    temp =*a;
    *a = *b;
    *b = temp;
}

int main()
{
    int i,j=0,loc=0;
    //printf("Enter the Size of the array: ")

    int a[8]= {3,2,5,7,1,5,3,2};
    int min;
    int n = 8;

    while(j<8)
    {
        i=j;
        min = a[i];
        //max = a[n-(i+1)];

        //min loop
        while(i<8)
        {
            if(min>=a[i])
            {
                min = a[i];
                loc = i;
            }
            i++;
        }

        swap(&a[j], &a[loc]);
        j++;

    }

    printf("\n");

    for(i=0; i<8; i++)
    {
        printf("\t%d",a[i]);
    }

    //printf("\nThe comparison is : %d\nThe swap is : %d\n",count, count2);
    //printf("\nThe loop count is : %d\n",j);

    //joto jai kori loop count always n ee hobe baal
}

