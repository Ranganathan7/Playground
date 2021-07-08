#include <iostream>
using namespace std;
struct node{
  node *next;
  int value;
  node(int v){
    value = v;
    next = NULL;
  }
};

node* insert(node *head, node *tail, int x){
  if(head==NULL){
    head = new node(x);
    return head;
   }
  node *curr = head;
  while(curr->next!=NULL){
  curr= curr->next;
  }
  curr->next = new node(x);
  return head;
}
int main() 
{
  node *head = NULL,*tail = NULL;
  int x;
  while(1){
    cin>>x;
    if(x<0) break;
    if(head==NULL){
      head = new node(x);
      tail = head;
      continue;
    }
    tail = insert(head, tail,  x);
     
  }
  int m = 0;
  node *curr = head;
  while(curr!=NULL){
    if(curr->value>m) m = curr->value;
    curr = curr->next;
  }
   // Try out your code here
    cout <<m;
    return 0;
}