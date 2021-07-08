#include<iostream>
using namespace std;
struct node{
  node *next;
  int data;
  node(int x){
    data = x;
    next = NULL;
  }
};

node* insert(node *head, int x){
  node *temp = new node(x);
  if(head == NULL) return temp;
  node *curr = head;
  while(curr->next!=NULL) curr = curr->next;
  curr->next = temp;
  return head;
}

node* merge(node *head1, node *head2){
  if(head1==NULL) return head2;
  if(head2==NULL) return head1;
  node *head;
  node *h1, *h2;
  h1 = head1;
  h2 = head2;
  if(head1->data<head2->data){
    head = h1;
    h1 = h1->next;
  }
  else{ 
    head = h2;
    h2 = h2->next;
  }
  node *curr = head;

  while(h1!=NULL && h2!=NULL){
   if(h1->data < h2->data){
    curr->next = h1;
    h1 = h1->next;
    curr = curr->next;
  }
  else{ 
    curr->next = h2;
    h2 = h2->next;
    curr = curr->next;
  }
  }
  while(h1!=NULL){
    curr->next = h1;
    h1 = h1->next;
    curr = curr->next;
  }
  while(h2!=NULL){
    curr->next = h2;
    h2 = h2->next;
    curr = curr->next;
  }
  return head;
}

int main()
{
  int m, n, x;
  node *head1 = NULL, *head2 = NULL;
  cin>>m;
  for(int i=0;i<m;i++){
    cin>>x;
    head1 = insert(head1, x);
  }
  cin>>n;
  for(int i=0;i<n;i++){
    cin>>x;
    head2 = insert(head2, x);
  }
 
  node *head = merge(head1, head2);
  node *curr = head;
  while(curr!=NULL){
    cout<<curr->data<<"->";
    curr = curr->next;
  }
  cout<<"NULL";
  return 0;
}