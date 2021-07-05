
//10. Write a program in C to separate odd and even integers in separate arrays

#include<stdio.h>

int main()
{
    int a[10]={1,2,3,4,5,6,7,8,9,10};
    int odd[5], even[5], i, j=0,k=0;

    for(i=0; i<10; i++)
    {
        if(a[i]%2==0)
        {
            even[j] = a[i];
            j++;
        }

        else
        {
            odd[k] = a[i];
            k++;
        }
    }

    printf("\nThe odd integer Array : ");
    for(i=0; i<5; i++)
    {
        printf("\t%d",odd[i]);
    }

    printf("\nThe even integer Array : ");
    for(i=0; i<5; i++)
    {
        printf("\t%d",even[i]);
    }

    return 0;
}
