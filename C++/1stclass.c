#include<stdio.h>

int main()
{
    int array[10]= {0,1,2,4,2,3,4,6,6,3};
    int temp[7]= {0};
    int i=0, j;

    while(i<=6)
    {
        for(j=0; j<=9; j++)
        {
            if(array[j]==i)
            {
                temp[i]=temp[i]+1;
                printf("%d\t",i);
            }
        }
        i++;
    }
}
