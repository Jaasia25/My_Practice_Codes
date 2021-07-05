#include<stdio.h>
#include<math.h>

int main()
{
    int item = 12;
    int i, j=0, loc, loc2=0, max, temp;
    int a[14] = {1,2,3,4,23,12,3,4,5,6,76,534,32,11};
    int n=14;

    while(j<n)
    {
        i=j;
        max = a[n-(i+1)];
        while(n>i)
        {
            if(max<=a[n-(i+1)])
            {
                max = a[n-(i+1)];
                loc2 = n-(i+1);
            }
            i++;
        }

        if(max!=a[n-j-1])
        {
            temp = a[n-j-1];
            a[n-j-1] = a[loc2];
            a[loc2] = temp;
        }

        j++;
    }

    for(i=0; i<14; i++)
    {
        printf(" %d ",a[i]);
    }

    int low=0, high=n-1, count=0;
    int mid = ceil((low+high)/2);

    while(low<=high)
    {
        if(item == a[mid])
        {
            loc = mid+1;
            count = 1;
            break;
        }

        else if(item < a[mid])
        {
            low= 0;
            high = mid-1;
            mid = ceil((low+high)/2);
        }

        else if(item > a[mid])
        {
            low= mid+1;
            high = n-1;
            mid = ceil((low+high)/2);
        }
    }

    if(count!=0)
    {
        printf("\nItem found at Location : %d\n", loc);
    }

    else
    {
        printf("\nItem not found\n");
    }

}
