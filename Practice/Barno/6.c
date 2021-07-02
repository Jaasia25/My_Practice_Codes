#include<stdio.h>

//6.Write a program in C to print
// all unique elements in an array

int main()
{
    int i,j,n;
    printf("Enter the number of the elements : ");
    scanf("%d",&n);
    int arr[n];

    for(i=0; i<n; i++)
    {
        printf("arr[%d] = ",i);
        scanf("%d",&arr[i]);
    }

    for(i=0; i<n; i++)
    {
        printf("\t%d",arr[i]);
    }

    printf("\nThe Unique elements are : ");
    for(i=0; i<n; i++)
    {
        for(j=i+1; j<n; j++)
        {
            if(arr[i]==arr[j])
            {
                arr[i]=0;
                arr[j]=0;
            }
        }

        if(arr[i]!=0)
            printf("\t%d",arr[i]);
    }
}
