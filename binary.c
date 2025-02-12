#include <stdio.h>

int main ()
{
    int a[] = {1,2,3,4,5,6,7,8};
    int se = 42 ;
    int start = 0;
    int end = sizeof(a) / sizeof(a[0])-1;
    int mid = ( start + end )/2 ;
    while(start<=end)
    {
        if(a[mid]==se)
        {
            printf("found");
            break;
        }
        else if(a[mid]<se)
        {
            start=mid+1;
        }
        else
        {
            end=mid-1;
        }
        mid = ( start + end )/2 ;
    }

    return 0;
}




    

    
