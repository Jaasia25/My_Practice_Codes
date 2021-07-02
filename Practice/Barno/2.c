#include<stdio.h>

//2.Write a program in C to read n number of values
//  in an array and display it in reverse order.

int main()
{
    int n,i;
    printf("Enter the size of array, n: ");
    scanf("%d",&n);

    int arr[n];
    printf("Enter the elements of the array : ");

    for(i=0; i<n; i++)
    {
        printf("arr[%d] = ",i);
        scanf("%d",&arr[i]);
    }

    for(i=n-1; i>=0; i--)
    {
        printf("\t%d",arr[i]);
    }

    return 0;
}
