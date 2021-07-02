#include<stdio.h>

int main()
{
    FILE *file1;

    fopen("file1.txt", "w");

    if(file1==NULL)
        printf("File Doesn't Exist");

    else
        printf("File is Open");

    fclose(file1);
}
