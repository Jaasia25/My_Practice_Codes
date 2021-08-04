//Concatenation

#include<stdio.h>

int main()
{
    char name1[] = "Jaasia";
    char name2[] = " Anjum";
    char name[20];

    int i, j;

    for(i=0; name1[i]!='\0'; i++)
    {
        name[i]= name1[i];
    }

    int len = i;

    for(i=0, j=len; name2[i]!='\0'; i++, j++)
    {
        name[j]= name2[i];
    }

    printf("%s",name);
}
