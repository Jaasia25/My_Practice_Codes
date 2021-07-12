#include<bits/stdc++.h>
using namespace std;

struct student{
    int place;
    int id;
    string name;
}stud[100];

void insertData()
{
    stud[0].place = 5;
    stud[0].id = 35;
    stud[0].name = "Jolil";

    stud[1].place = 6;
    stud[1].id = 45;
    stud[1].name = "Montu";

    stud[2].place = 1;
    stud[2].id = 63;
    stud[2].name = "Galib";

    stud[3].place = 4;
    stud[3].id = 56;
    stud[3].name = "Niloy";

    stud[4].place = 2;
    stud[4].id = 60;
    stud[4].name = "Adnan";

    stud[5].place = 3;
    stud[5].id = 14;
    stud[5].name = "Rais";
}

void printList()
{
    cout<<"place\tid\tname\n";
    for(int i=0; i<6; i++)
    {
        cout<<stud[i].place<<"\t"<<stud[i].id<<"\t"<<stud[i].name<<endl;
    }
}

void Swap(struct student *a, struct student *b)
{
    struct student *temp;
    *temp =*a;
    *a = *b;
    *b = *temp;
}

void selectionSort()
{
    int i, j=0,loc=0, temp;

    int minimum;

    while(j<6)
    {
        i=j;
        minimum = stud[i].id;

        while(i<6)
        {
            if(minimum>=stud[i].id)
            {
                minimum = stud[i].id;
                loc = i;
            }
            i++;
        }

        if(minimum!=stud[j].id)
        {
            Swap(&stud[j], &stud[loc]);
        }
}
}

int binSer(int id)
{
    int low=0, high=6-1, counter=0, loc;
    int mid = ceil((low+high)/2);

    while(low<=high)
    {
        if(id == stud[mid].id)
        {
            loc = mid+1;
            counter = 1;
            break;
        }

        else if(id < stud[mid].id)
        {
            low= 0;
            high = mid-1;
            mid = ceil((low+high)/2);
        }

        else if(id > stud[mid].id)
        {
            low= mid+1;
            high = 6-1;
            mid = ceil((low+high)/2);
        }
    }

    if(counter!=0)
    {
        return loc;
    }

    else
    {
        return -9999;
    }
    //this line is for nothing,change it according to your need
}

int main()
{
    int id;
    insertData();
    cout<<"*************Your unsorted list*************"<<endl;
    printList();
    selectionSort();
    cout<<"*************Your sorted list*************"<<endl;
    printList();

    int x;
    cout<<"Enter your student id: ";
    scanf("%d",&id);

    cout<<"Given student place is "<<binSer(id)<<endl;
    return 0;
}

