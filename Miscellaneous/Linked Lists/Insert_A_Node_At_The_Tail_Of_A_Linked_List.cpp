#include<iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

Node* Insert(Node *head,int data)
{
    Node *temp = new Node();
    temp->data = data;
    Node *temp1= head;
    if(temp1 == NULL)
    {
        temp->next = NULL;
        return temp;
    }
    else
    {
        while(temp1->next != NULL)
        {
            temp1= temp1->next;
            
        }
        temp->next = NULL;
        temp1->next = temp;
        return head;
    }
}
    
void Print(Node *head)
{
	Node *temp = head;
	while(temp!= NULL)
	{ 
		cout<<temp->data<<"\n";
		temp = temp->next;
	}
}

int main()
{
	int t;
	cin>>t;
	Node *head = NULL;
	while(t-- >0)
	{
		int x; cin>>x;
		head = Insert(head,x);
	}
	Print(head);
}