#include<stdio.h>
#include <stdlib.h>
#include<time.h>
#include<math.h>

int main()
{
    int a[10];
    int n,i,k,temp;

    clock_t start_time, end_time;
    double time_passed;

    start_time = clock();

    printf("Enter the number of elements : ");
    scanf("%d", &n);

    srand(time(0));

    for(i=0; i<n; i++)
    {
        a[i] = (rand()%20)+50;
    }

    for(i=0; i<n; i++)
    {
        printf("\t%d",a[i]);
    }

    for(k=1; k<n; k++)
    {
        temp = a[k];
        i = k-1;

        while(temp<a[i])
        {
            a[i+1]= a[i];
            i--;
        }

        a[i+1] = temp;
    }

    printf("\n");

    for(i=0; i<n; i++)
    {
        printf("\t%d",a[i]);
    }

    int item;
    printf("\nEnter the Item you want to search : ");
    scanf("%d",&item);

    int low=0, high=n-1, counter=0, loc=0;
    int mid = ceil((low+high)/2);

    while(low<=high)
    {
        if(item == a[mid])
        {
            loc = mid+1;
            counter = 1;
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

    if(counter!=0)
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

}
