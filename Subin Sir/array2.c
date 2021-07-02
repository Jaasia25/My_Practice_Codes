#include<stdio.h>

int main()
{
    int i, j, n = 4, count = 0;

    //printf("Enter the number of students : ");
    //scanf("%d",&n);

    //int fmarks[4], smarks[4], amarks[4];
    double Tmarks[n];

    int fmarks[4] = {10, 20, 40, 30};
    int smarks[4] = {20, 30, 40, 60};
    int amarks[4] = {40, 50, 20, 10};

    /*printf("Enter 1st Term marks : \n");
    for(i=0; i<n; i++)
    {
        printf("First Term marks [%d] = ",i+1);
        scanf("%d", &fmarks[i]);
    }

    printf("Enter 2nd Term marks : \n");
    for(i=0; i<n; i++)
    {
        printf("Second Term marks [%d] = ",i+1);
        scanf("%d", &smarks[i]);
    }

    printf("Enter annual Term marks : \n");
    for(i=0; i<n; i++)
    {
        printf("Annual marks [%d] = ",i+1);
        scanf("%d", &amarks[i]);
    }*/

    for(i=0; i<n; i++)
    {
        Tmarks[i] = fmarks[i]*0.25+ smarks[i]*0.25+ amarks[i]*0.50;
    }

    printf("\nNow Displaying Total marks : \n");
    for(i=0; i<n; i++)
    {
        printf("Total marks [%d] = %.2lf\n",i+1,Tmarks[i]);
    }

    printf("\n");

    for(i=0; i<n; i++)
    {
        for(j=i+1; j<n; j++)
        {
            if(Tmarks[j]==Tmarks[i])
            {
                count++;
            }

            if(count>=1)
            {
                Tmarks[j] = 0;
            }
        }
        if(Tmarks[i]!=0)
        {
            printf("There are %d students who got %.2lf\n", count+1, Tmarks[i]);
        }
        count = 0;
    }
}
