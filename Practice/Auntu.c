#include<stdio.h>

int present(int m, int a[])
{
    int i;
    for(i=0; i<m; i++)
    {
        scanf("%d",&a[i]);
    }

    printf("\nThe Present students are : ");

    for(i=0; i<m; i++)
    {
        printf("%d ",a[i]);
    }
}

int absent(int n, int m, int a[], int b[])
{
    int i=0, j=0;
    while(i<n)
    {
        j=0;
        while(j<m)
        {
            if(b[j]==a[i])
                {
                    a[i]=0;
                    break;
                }

            j++;
        }

        if(a[i]!=0)
            printf("%d ",a[i]);

        i++;
    }
}

int main()
{
    int i, n, m, student[5], p[5];

    printf("Enter the number of students : ");
    scanf("%d", &n);

    for(i=0; i<n; i++)
    {
        student[i] = 202036000 + (i+1);
    }

    printf("Enter the number of present students: ");
    scanf("%d", &m);

    printf("Enter the IDs of present students: ");
    present( m, p);

    printf("\nThe Absent students are : ");
    absent(n, m, student, p);
}
