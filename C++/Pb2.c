#include <stdio.h>

int main()
{
  int a[100], *max, n, i, place=1;

  printf("Number of elements: ");
  scanf("%d",&n);

  printf("Enter the elements: \n");

  for(i=0 ;i<n; i++)
    scanf("%d",(a+i));

  max = a;

  for(i=1; i<n; i++)
  {
    if(*(a+i)> *max)
    {
       *max= *(a+i);
       place = i+1;
    }
  }

  printf("Maximum value of array: %d\nThe element is at %d place\n",*max,place);
  return 0;
}
