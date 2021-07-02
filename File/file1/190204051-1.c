#include<stdio.h>

int main()
{
    FILE *data;
    data = fopen("data.txt", "w");

    char name[20];
    int id=190204051;


    if(data==NULL)
        printf("File Doesn't Exist");

    else
    {
        fputs("Jaasia Anjum",data);
        fprintf(data,"\n%d",id);
    }

    fclose(data);
}

