#include <iostream>
using namespace std;
struct node{
  node *next;
  int data;
  node(int x){
    next = NULL;
    data = x;
  }
};
node* stackInsert(node *head, int x){
  node *temp = new node(x);
  if(head==NULL) return temp;
  temp->next = head;
  return temp;
}
int main() 
{
 int x;
  node *head = NULL;
  while(1){
    cin>>x;
    if(x<0) break;
    head = stackInsert(head, x);
  }
  node *curr = head;
  while(curr!=NULL){
    cout<<curr->data<<" ";
    curr = curr->next;
  }
    return 0;
}