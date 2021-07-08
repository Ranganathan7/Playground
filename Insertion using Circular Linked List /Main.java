#include <iostream>
#include <bits/stdc++.h>
using namespace std;
struct node{
  node *next;
  int value;
  node(int v){
    next = NULL;
    value = v;
  }
};

node* insert(node *head, int x){
  if(head==NULL){
    node *temp = new node(x);
    temp->next = temp;
    return temp;
  }
  node *temp = head->next;
  head->next = new node(x);
  swap(head->value, head->next->value);
  head->next->next = temp;
  return head->next;
}

int main() 
{
  node *head = NULL;
  int x;
  while(1){
    cin>>x;
    if(x==1) continue;
    if(x==0) break;
    head = insert(head, x);
    
  }
  node *curr = head;
  cout<<curr->value<<" ";
  curr = curr->next;
  while(curr!=head){
    cout<<curr->value<<" ";
    curr = curr->next;
  }
   // Try out your code here
    
    return 0;
}