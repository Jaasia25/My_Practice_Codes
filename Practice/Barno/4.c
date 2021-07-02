#include<stdio.h>

//4.Write a program in C to copy the elements of
//  one array into another array

int main()
{
    int i, a[5], b[5];

    printf("Enter the elements of the array : \n");

    for(i=0; i<5; i++)
    {
        printf("a[%d] = ",i);
        scanf("%d",&a[i]);
    }

    for(i=0; i<5; i++)
    {
        b[i]=a[i];
        printf("\t%d",b[i]);
    }
}
