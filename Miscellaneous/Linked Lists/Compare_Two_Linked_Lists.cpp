#include <iostream>
#include<cstdio>
#include<cstdlib>

using namespace std;

struct Node
{
	int data;
	Node *next;
};

int CompareLists(Node* headA, Node* headB)
{
    Node* temp1 = headA;
    Node* temp2 = headB;
    if(temp1 == NULL && temp2 == NULL)
    {
        return 1;
    }
    while(temp1->next != NULL && temp2->next!= NULL)
    {
    	if(temp1->data != temp2->data)
    	{
    		return 0;
    	}
      	else
      	{
      		temp1= temp1->next;
         	temp2 = temp2->next;
          	if(temp1->next == NULL && temp2->next == NULL)
          	{
        		return 1;
          	}
      	}      
   	}   
   	return 0;   
}

Node* Insert(Node* head, int x)
{
	Node* temp = new Node();
	temp->data = x;
	temp->next = NULL;
	if(head == NULL) 
	{
		return temp;
   	}
   	Node* temp1;
   	for(temp1 = head;temp1->next!=NULL;temp1= temp1->next);
   	temp1->next = temp;return head;
}

int main()
{
	int t;
	cin>>t;
	while(t-- >0)
	{
		Node* A = NULL;
		Node* B = NULL;
		int m;cin>>m;
		while(m--){
			int x; cin>>x;
			A = Insert(A,x);}
		int n; cin>>n;
        while(n--){
			int y;cin>>y;
			B = Insert(B,y);
		}
		cout<<CompareLists(A,B)<<"\n";
	}
}