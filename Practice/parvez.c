#include<stdio.h>

int main()
{
    int n, i, j, count=1, round=1;
    printf("Enter a Number: ");
    scanf("%d",&n);

    int a[n], b[n], c[n];

    printf("Enter %d Numbers: ", n);

    for(i=0; i<n; i++)
    {
        scanf("%d", &a[i]);
    }

    for(i=0; i<n; i++)
    {
        printf("%d\t", a[i]);
    }


   while(count<=n)
    {
        i=0;
        j=1;

        if(i==0)
        {
            if(a[j]%a[j-1]==0)
            {
                c[j]= a[j]/a[j-1];
                i++;
                j++;
            }

            else
            {
                c[j]= a[j];
                i++;
                j++;
            }
        }

        for(i=1, j=2; i< n, j< n; i++, j++)
        {
            if(a[j]%c[j-1]==0)
            {
                c[j]= a[j]/c[j-1];
            }

            else
            {
                c[j]= a[j];
            }
        }

        if(a[n-1]%c[n-2]==0)
            c[0]= a[n-1]/c[n-2];

        else
            c[0]= a[0]/a[n-1];

        printf("\nROUND : %d\n", round);
        for(i=0; i<n; i++)
        {
            printf("%d\t", c[i]);
        }

        if(round==1)
        {
            for(i=0; i<n; i++)
            {
                b[i]= c[i];
                a[i]= c[i];
            }
        }

        else
        {
            for(i=0; i<n; i++)
            {
                if(b[i]==c[i])
                    count++;
            }

            if(count!=n)
            {
                a[i]= b[i];
                b[i]= c[i];
            }

        }

        round++;
        printf("\n");
    }

    printf("\nThe Game Round is: %d\n", round-1);

    return 0;
}
