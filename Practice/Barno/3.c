#include<stdio.h>

//3.Write a program in C to find the sum
//  of all elements of the array.

int main()
{
    int i, sum=0;

    int arr[5];
    printf("Enter the elements of the array : \n");

    for(i=0; i<5; i++)
    {
        printf("arr[%d] = ",i);
        scanf("%d",&arr[i]);
    }

    for(i=0; i<5; i++)
    {
        sum = sum + arr[i];
    }

    printf("The sum of the elements of the array is : %d\n",sum);
    return 0;
}
