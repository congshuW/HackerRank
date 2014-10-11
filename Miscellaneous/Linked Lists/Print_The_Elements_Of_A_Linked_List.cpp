#include <iostream>
#include <cstdio>
#include <cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

void Print(Node *head)
{
    Node *temp = head;
    if(temp == NULL)
        return;
    while(temp != NULL )
    {
        cout<<temp->data<<endl;
        temp = temp->next;
    }
}

Node* Insert(Node *head,int x)
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
		int x; 
		cin>>x;
		Node *head = NULL;
    	while(x--)
    	{
    		int y;cin>>y;
		    head = Insert(head,y);
        }
    	Print(head);
		free(head);
	}
}