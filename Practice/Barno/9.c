
//9. Write a program in C to find the maximum and minimum element in an array.

#include<stdio.h>

int main()
{
    int i=0,min,max;
    int a[]={12,2,343,65,7,32,122,324,443,24};

    min = a[0];
    max = a[0];

    while(i<10)
    {
        if(min>a[i])
        {
            min = a[i];
        }
        i++;
    }

    i=0;

    while(i<10)
    {
        if(max<a[i])
        {
            max = a[i];
        }
        i++;
    }

    printf("The minimum number is : %d\n", min);
    printf("The maximum number is : %d\n", max);

    return 0;
}
