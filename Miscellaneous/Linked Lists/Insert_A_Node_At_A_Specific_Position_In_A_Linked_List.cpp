#include <iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

Node* InsertNth(Node *head, int data, int position)
{
    Node*temp1 = new Node();
    temp1->data = data;
    if(position == 0)
    {
        temp1->next= head;
        head = temp1;
        return head;
    }
    else
    {
        Node*temp2 = head;
        for(int i = 0; i< position -1; i++)
        {
            temp2 = temp2->next;
        }
        temp1->next = temp2->next;
        temp2->next = temp1;
        return head;
    }
}

void Print(Node* head)
{
	while(head != NULL)
	{
		cout<<head->data;
		head=head->next;
	}
}

int main()
{
	int t;
	cin>>t;
	Node *head = NULL;
	head = new Node();
	head->data = 2;
	head->next = NULL;
	while(t-- >0)
	{
		int x,n; 
		cin>>x>>n;
		head = InsertNth(head,x,n);
	}
	Print(head);
	cout<<"\n";
}