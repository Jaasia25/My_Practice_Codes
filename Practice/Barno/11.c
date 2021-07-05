
//11. Write a program in C to sort an array using Bubble sort

#include<stdio.h>

int main()
{
    int arr[10]= {4,43,2,5443,23134,5432,32,43,5,3};
    int i,k,sCount=0,n=10;

    for(k=1; k<=10; k++)
    {
        i = 0;
        sCount=0;

        while(i<(n-k))
        {
            if(arr[i]>arr[i+1])
            {
                int temp= arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
            else
                sCount++;

            i++;
        }
        if(sCount==(n-k))
            break;
    }

    for(i=0; i<n; i++)
    {
        printf("\t%d",arr[i]);
    }

    return 0;
}
