#include<stdio.h>

int main()
{
    int i=0,length=0;
    char name[]= "Jaasia Anjum";

    while(name[i]!='\0')
    {
        length++;
        i++;
    }

    printf("String length : %d", length);
}
