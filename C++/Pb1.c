#include<stdio.h>
#include<string.h>

char StringCpy();

int main()
{
    char source[200], copy[200];

    printf("Enter the String: \n");
    gets(source);

    StringCpy(copy,source);

    printf("The copied String: %s\n",copy);
    return 0;
}

char StringCpy(char *copy, char *source)
{
    int i;
    for(i=0; *(source+i)!='\0'; i++)
    {
        *(copy+i) = *(source+i);
    }

    *(copy+i) = *(source+i);
    return copy;
}

