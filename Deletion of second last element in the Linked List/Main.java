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
  if(head == NULL) return temp;
   node *curr = head;
  while(curr->next != NULL) curr = curr->next;
  curr->next = temp;
   return head;
}

node *del(node *head){
  if (head == NULL || head->next == NULL) {
  
    return head;
  }
  node *secondlast;
  node *curr;
  secondlast = head;
  curr = head->next;
  while(curr->next!=NULL) {
    curr = curr->next;
    secondlast = secondlast->next;
  } 

  secondlast->data = curr->data;
  secondlast->next = NULL;
  delete curr;
  return head;
}
int main()
{
  node *head = NULL;
  int x;
  while(1){
    cin>>x;
    if(x<0) break;
    head = insert(head, x);
  }
    if (head == NULL || head->next == NULL) {
    cout<<"Deletion of second last element is not possible";
    return 0;
  }
  head = del(head);
  node* curr = head;
  while(curr!=NULL){
    cout<<curr->data<<" ";
    curr = curr->next;
   }
  return 0;
}