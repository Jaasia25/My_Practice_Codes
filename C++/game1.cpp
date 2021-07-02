#include<iostream>
#include<string>
#include<fstream>
using namespace std;

int main()
{
    string name;

    ofstream file;
    file.open("Player.txt",ios::out|ios::app);

    cout<< "Enter your Name : ";
    getline(cin,name);
    file<< name<< endl;
    cin.ignore();

    file.close();

    return 0;
}
