#include<stdio.h>
#include<string.h>

char StringCmp();

int main()
{
    int com;
    char str1[200], str2[200];

    printf("Enter the String: \n");
    gets(str1);

    printf("Enter another String: \n");
    gets(str2);

    com = StringCmp(str1,str2);

    if(com==0)
        printf("The Strings are EQUAL");
    else
        printf("The Strings are NOT EQUAL");

    return 0;
}

char StringCmp(char *str1, char *str2)
{
    int i=0;
    while(*(str1+i)!='\0' && *(str1+i)!='\0')
    {
        if(*(str1+i)>*(str2+i))
            return 1;
        else if(*(str1+i)<*(str2+i))
            return -1;
        else
            return 0;
    }

    if(*(str1+i))
        return 1;
    else if(*(str2+i))
        return -1;
    else
        return 0;
}



