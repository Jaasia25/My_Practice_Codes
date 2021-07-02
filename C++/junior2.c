#include<stdio.h>

int main()
{
    int k=1,a;
    int j;
    while(k<4)
    {
        for(j=0;j<k;j++)
        {
        if((k+j)%4==1)
        {
            printf("%d ",k+j);
        }
        else
            printf("%d ", k-j);
        }

        a= k+j;
        printf("\n%d\n",a);
        k++;
    }
    return 0;
}




