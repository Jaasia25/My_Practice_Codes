#include<stdio.h>
#define l 15

int main()
{
    int a[l], x=0,count=0;
    while(x<l)
    {
        a[x]=(-9999);
        x++;
    }

    int i,in,j1=0,k,value,itemp,jtemp=0;

    while(1)
    {
        printf("\nInput : 1\nDisplay: 2\nDelete :3\nExit: 4\n");
        scanf("%d",&in);

        if(in==1)
        {
            printf("Enter your value: ");
            scanf("%d",&value);
            if(a[l-1]!=(-9999))
            {
                a[j1]=value;
                j1++;
            }
            else
            {
                for(i=0;i<l;i++)
                {
                    if(a[i]==(-9999)&&a[i+1]==(-9999))
                    {
                        a[i]=value;
                        break;
                    }
                    else if(a[i]!=(-9999)&&a[i+1]==(-9999))
                    {
                        a[i+1]=value;
                        break;
                    }
                }
                itemp=i;
            }
            jtemp=j1;
        }

        else if(in==2)
        {
            for(i=jtemp;i<l;i++)
            {
                if(a[i]!=(-9999))
                    printf("%d\t",a[i]);
            }
            for(i=0;i<jtemp;i++)
            {
                if(a[i]!=(-9999))
                    printf("%d\t",a[i]);
            }
        }

        else if(in==3)
        {
            if(jtemp==0)
            {
                i=0;
                while(a[i]==(-9999))
                {
                    i++;
                }
                a[i]=(-9999);
            }
            else if(jtemp!=0)
            {
                i=jtemp;
                while(a[i]==(-9999))
                {
                    i++;
                }
                a[i]=(-9999);
            }
        }

        else if(in==4)
            break;
    }
}
