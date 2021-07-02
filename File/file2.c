#include<stdio.h>

int main()
{
    FILE *student;
    student = fopen("student.txt", "r");

    char name[20];
    int id, phone, i, num,p;


    if(student==NULL)
        printf("File Doesn't Exist");

    else
    {
         /*printf("How many Students: ");
        scanf("%d",&num);

       for(i=1;i<=num;i++)
        {
            printf("Student Name: ");
            fflush(stdin);
            gets(name);
            printf("Student ID: ");
            scanf("%d",&id);
            printf("Student Contact No: ");
            scanf("%d",&phone);

            fprintf(student, "\n%s\t%d\t%d\n", name, id, phone);
        }*/

        while(1)
        {
            p= fscanf(student, "%s%d%d", &name, &id, &phone);

            if(p==EOF)
                break;
            else
                printf("\n%s\t%d\t%d\n", name, id, phone);
        }
    }
    fclose(student);
}
