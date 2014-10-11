#include<iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

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
   for(temp1 = head; temp1->next!=NULL; temp1= temp1->next);
   temp1->next = temp;
   return head;
}

Node* Delete(Node *head, int position)
{

    int count = position -1;
    if(head == NULL)
    {
        return NULL;
    }
    else
    {
        Node *current = head;
        if(count < 0)
        {
            head = current->next ;
            delete current;
            return head;
        }
        else
        {
            for(int i = 0; i< count ; i++)
            {
                if(current->next!= NULL)
                {
                    current = current->next;
                }
                else
                {
                    return head;
                }
            }
            Node *n  = current->next;
            current->next = n->next  ;
            delete n;
            return head;
        }   
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
	while(t-- >0)
	{
		int x; cin>>x;
		Node *head = NULL;
        while(x--)
		{
        	int y;
        	cin>>y;
		    head = Insert(head,y);
      	}
       	int pos;cin>>pos;
	   	head = Delete(head,pos);
	   	Print(head);
	   	cout<<"\n";
	}
}