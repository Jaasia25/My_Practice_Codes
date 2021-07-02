#include<stdio.h>

//5.Write a program in C to count a total number of
//  duplicate elements in an array.

int main()
{
    int i, j, n, count=0;
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

    for(i=0;i<n;i++)
    {
        for(j=i+1;j<n;j++)
        {
            if(arr[i]==arr[j])
            {
                count++;
                break;
            }
        }
    }

    printf("\nThe Duplicate element count is : %d",count);
}
