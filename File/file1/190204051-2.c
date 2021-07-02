#include<stdio.h>

int main()
{
    FILE *data;
    data = fopen("data.txt", "a+");

    int id = 190204051;
    id = id%1000;

    fprintf(data,"\n%d",id);

    fclose(data);
}


