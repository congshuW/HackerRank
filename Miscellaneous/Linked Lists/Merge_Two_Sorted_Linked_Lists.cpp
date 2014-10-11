#include <iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

Node* MergeLists(Node *headA, Node* headB)
{
    Node *temp1= headA;
    Node *temp2 = headB;
    if(temp1 == NULL && temp2 == NULL)
    {
        return NULL;
    }
    else if(temp1 == NULL && temp2 !=NULL)
    {
        return temp2;
    }
    else if(temp1 != NULL && temp2 == NULL)
    {
        return temp1;
    }
    else
    {
    	if(temp1->data <= temp2->data)
       	{
    		temp1->next= MergeLists(temp1->next, temp2);
           	return headA;
       	}
		else
    	{
            temp2->next= MergeLists(temp2->next, temp1);
            return headB;
        }  
    }
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
		Node *A = NULL;
		Node *B = NULL;
		int m;cin>>m;
		while(m--)
		{
			int x; cin>>x;
			A = Insert(A,x);
		}
		int n; 
		cin>>n;
        while(n--)
        {
			int y;
			cin>>y;
			B = Insert(B,y);
		}
		A = MergeLists(A,B);
		Print(A);
	}
}