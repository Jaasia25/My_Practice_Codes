#include<stdio.h>

//1.Write a program in C to store elements in an array and print it

int main()
{
    int i;

    int arr[5];
    printf("Enter the elements of the array : \n");

    for(i=0; i<5; i++)
    {
        printf("arr[%d] = ",i);
        scanf("%d",&arr[i]);
    }

    for(i=0; i<5; i++)
    {
        printf("\t%d",arr[i]);
    }

    return 0;
}

