#include<stdio.h>
#include<stdlib.h>

int dydmem();

int main()
{
    int n;

    float avg= dydmem(n);

    printf("The average: %f",avg);
}

int dydmem(int *n)
{
    int i;
    float sum=0, avg, *arr;

    arr= (float *) malloc(sizeof(float)* n) ;

    if(arr=='\0')
        printf("Memory Allocation failed");

    printf("Enter elements:\n");

    for(i=0; i<*n; i++)
        {
            scanf("%d",(arr+i));
            sum+= *(arr+i);
        }

        avg= sum/n;
}
