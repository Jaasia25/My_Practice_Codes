#include<stdio.h>

int main()
{
    int i;
    int total_marks[] = {86,78,94,90,54,88,89,98,90,78,67,78,89,70,67,68,69,78,79,89,90,98,87,76,65};

    int marks_count[101];

    for(i=0; i<101; i++)
    {
        marks_count[i]=0;
    }

    for(i=0; i<25; i++)
    {
        marks_count[total_marks[i]]++;
    }

    for(i=50; i<=100; i++)
    {
        if(marks_count[i]!=0)
        {
            printf("\tMarks : %d\tCount : %d\n",i,marks_count[i]);
        }
    }

    return 0;
}
