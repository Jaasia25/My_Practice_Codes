#include<stdio.h>

int main()
{
    char name[] = "Jaasia Anjum";
    int i=0;

    printf("%s\n",name);

    while(name[i]!='\0')
    {
        if(name[i]>=97 && name[i]<=122)
        {
            name[i] = 65 + (name[i]- 97);
        }

        else if(name[i]>=65 && name[i]<=90)
        {
            name[i] = 97 + (name[i]- 65);
        }

        i++;
    }

    printf("%s\n",name);

    return 0;
}
