#include<iostream>
using namespace std;
struct node{
  node *next;
  int value;
  node(int x){
    next = NULL;
    value = x;
  }
};
node* insert(node *head, int x){
  node *temp = new node(x);
  if(head == NULL) return temp;
  node* curr = head;
  while(curr->next!=NULL) curr = curr->next;
  curr->next = temp;
  return head;
}
bool search(node *head, int x){
  if(head==NULL) return false;
  node *curr = head;
  while(curr!=NULL){
    if(curr->value == x) return true;
    curr = curr->next;
  }
  return false;
}
int main()
{
  node *head = NULL;
  int x;
  while(1){
    cin>>x;
    if(x<0) break;
    if(!search(head, x)) head = insert(head, x);
  }
  node* curr = head;
  if(curr==NULL){
    cout<<"List is empty";
    return 0;
  }
  while(curr!=NULL){
    cout<<curr->value<<endl;
    curr = curr->next;
  }
  return 0;
}