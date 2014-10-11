#include <iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

Node* RemoveDuplicates(Node *head)
{
    Node *temp = head;
    if(temp == NULL)
    {
        return NULL;
    }
    while(temp->next != NULL)
    {
        Node *temp1 = temp->next;
        if(temp->data == temp1->data)
        {
            temp->next = temp1->next;
            delete temp1; 
        }
        else
        {
            temp = temp->next; 
        }
    }
	return head;
}

void Print(Node *head)
{
	bool ok = false;
	while(head != NULL)
	{
		if(ok)cout<<" ";
		else ok = true;
		cout<<head->data;
		head = head->next;
	}
	cout<<"\n";
}
 
Node* Insert(Node *head, int x)
{
   Node *temp = new Node();
   temp->data = x;
   temp->next = NULL;
   if(head == NULL) 
   {
       return temp;
   }
   Node *temp1;
   for(temp1 = head;temp1->next!=NULL;temp1= temp1->next);
   temp1->next = temp;return head;
}

int main()
{
	int t;
	cin>>t;
	while(t-- >0)
	{
		Node *A = NULL;
		int m;cin>>m;
		while(m--)
		{
			int x; cin>>x;
			A = Insert(A,x);
		}
		A = RemoveDuplicates(A);
		Print(A);
	}
}