#include <stdio.h>
#include <time.h>

void swap(int *a, int *b)
{
    int temp;
    temp =*a;
    *a = *b;
    *b = temp;
}

int main()
{
    //int i,j;
    int item;
    int i, j=0, loc, loc2=0, max, temp;
    int a[15];
    int n;
    clock_t start_time, end_time;
    double time_passed;

    start_time = clock();

    printf("Enter the number of Elements of array : \n");
    scanf("%d",&n);

    printf("Enter the Elements of array : \n");

    for(i=0; i<n; i++)
    {
        printf("a[%d] = ",i);
        scanf("%d", &a[i]);
    }

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
            swap(&a[n-j-1], &a[loc2]);
        }

        j++;
    }

    for(i=0; i<n; i++)
    {
        printf(" %d ",a[i]);
    }

    printf("\nEnter the Element you want to search : \n");
    scanf("%d",&item);


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

    end_time = clock();
    time_passed = (double)(end_time-start_time)/CLOCKS_PER_SEC;

    printf("Time: %lf seconds\n", time_passed);

    return 0;
}

