#include<stdio.h>

int main()
{
    int arr[11]= {1,2,3,4,5,7,9,11,14,17,20};
    int lowPoint=0, highPoint=10;
    int item=3;
    int midPoint=(highPoint+lowPoint)/2;


    while (lowPoint<=highPoint)
    {


        if (arr[midPoint]==item)
        {
            break;
        }

        if (arr[midPoint]>item)
        {
            highPoint=midPoint-1;
            midPoint= ((highPoint+lowPoint)/2);
        }
        else
        {
            lowPoint=midPoint+1;
            midPoint= (highPoint+lowPoint)/2;
        }

    }
    if (lowPoint>highPoint)
    {
        printf("The item was not found.");
    }
    else
    {
        printf("Found the item on %dth index", midPoint);
    }
    return 0;

}
