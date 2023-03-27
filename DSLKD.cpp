#include <iostream>
using namespace std;
struct Node
{
    int Data;
    Node *Next;
};
typedef Node *list;

void addFirst(int x, list &f)
{
    list p = new (Node);
    p->Data = x;
    p->Next = f;
    f = p;
}
void addLast(int x, list &f)
{
    list p = new (Node);
    p->Next = NULL;
    p->Data = x;
    if (f == NULL)
    {
        f = p;
    }
    else
    {
        list q = f;
        while (q->Next)
        {
            q = q->Next;
        }
        q->Next = p;
    }
}
void print(list f)
{
    list p = f;
    while (p != NULL)
    {
        cout << p->Data << " ";
        p = p->Next;
    }
}

int main()
{
    int x;
    list f = NULL;
    while (true)
    {
        cin >> x;
        if (x == 0)
        {
            break;
        }
        else if (x % 2 == 0)
        {
            addFirst(x, f);
        }
        else
        {
            addLast(x, f);
        }
    }
    print(f);

    return 0;
}