#include<iostream>
using namespace std;
struct node{
  node *next;
  int data;
  node(int x){
    next = NULL;
    data = x;
  }
};

node *insert(node *head, int x){
  node *temp = new node(x);
  if(head==NULL) return temp;
  node *curr = head;
  while(curr->next!=NULL) curr = curr->next;
  curr->next = temp;
  return head;
}

void swap(node *head){
  if(head == NULL) return;
  if(head->next == NULL) return;
  int temp;
  node *curr1 = head;
  node *curr2 = head->next;
  while(curr1!=NULL && curr2!=NULL){
    temp = curr1->data;
    curr1->data = curr2->data;
    curr2->data = temp;
    if(curr2->next == NULL || curr2->next->next==NULL) break;
    curr1 = curr2->next;
    curr2 = curr1->next;
    
  }
}
int main()
{
  int x;
  node *head;
  while(1){
    cin>>x;
    if(x<0) break;
    head = insert(head, x);
  }
  swap(head);
  node *curr = head;
  if(curr==NULL){
    cout<<"List is empty";
    return 0;
  }
  while(curr!=NULL){
    cout<<curr->data<<endl;
    curr = curr->next;
  }
  return 0;
}