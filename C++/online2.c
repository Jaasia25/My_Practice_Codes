#include<stdio.h>

int input();

int main()
{
    int i,arr[5];

    input(arr);

    printf("The Array elements are:\t");

    for(i=0;i<5;i++)
    {
        printf("%d\t",*arr+i);
    }

}

int input(int *a)
{
    int i;

    for(i=0;i<5;i++)
    {
        scanf("%d",a+i);
    }
}
