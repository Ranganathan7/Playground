#include<iostream>
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
  if(tail == NULL){
    head = new node(x);
    return head;
  }
  tail->next = new node(x);
  return tail->next;
}
int main()
{
  
  int x;
  int s = 0;
  node *head = NULL, *tail = NULL;
  while(1){
    cin>>x;
    if(x<0) break;
    s++;
    if(head==NULL){
      head = new node(x);
      tail = head;
      continue;
    }
    tail = insert(head, tail, x);
  }
  int n;
  cout<<"Enter the nth node:\n";
  cin>>n;
  n = s - n;
  if(n<0) {
    cout<<"There is no nth node in the list";
    return 0;
  }
  //type your code here
  node *curr = head;
  for(int i=0;i<n;i++) curr = curr->next;
  cout<<curr->value<<" is the nth node element in the list";
    
  return 0;
}