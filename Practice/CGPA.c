#include<stdio.h>

int main()
{
    double theory[5];
    double lab[3];
    double medraw;
    double cgpa=0;
    int i;

    printf("Enter your EEE1241: ");
    scanf("%lf",&theory[0]);

    printf("Enter your CSE1205: ");
    scanf("%lf",&theory[1]);

    printf("Enter your CSE1203: ");
    scanf("%lf",&theory[2]);

    printf("Enter your MATH1219: ");
    scanf("%lf",&theory[3]);

    printf("Enter your ME1211: ");
    scanf("%lf",&theory[4]);

    printf("Enter your EEE1242: ");
    scanf("%lf",&lab[0]);

    printf("Enter your CSE1206: ");
    scanf("%lf",&lab[1]);

    printf("Enter your CSE1200: ");
    scanf("%lf",&lab[2]);

    printf("Enter your ME1214: ");
    scanf("%lf",&medraw);

    for(i=0; i<5; i++)
    {
        cgpa= cgpa + 3*theory[i];
    }

    for(i=0; i<3; i++)
    {
        cgpa= cgpa + 1.5*lab[i];
    }

    cgpa = cgpa + .75*medraw;

    double CGPA = cgpa/ (3*5+ 1.5*3+ 0.75);

    printf("Your Total CGPA is : %.3lf",CGPA);

    return 0;

}
