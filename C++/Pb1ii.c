#include<stdio.h>
#include<string.h>

char StringCat();

int main()
{
    char str2[200], str1[400];

    printf("Enter the String: \n");
    gets(str1);

    printf("Enter another String: \n");
    gets(str2);

    StringCat(str1,str2);

    printf("The Concatenated String: %s\n",str1);
    return 0;
}

char StringCat(char *str1, char *str2)
{
    int i=0, j=0, len=0;
    while(*(str1+i)!='\0')
    {
        i++;
        len++;
    }

    while(*(str2+j)!='\0')
    {
        *(str1+len+j)= *(str2+j);
        j++;
    }

    return str1;
}


