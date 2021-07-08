#include <iostream>
using namespace std;
struct node{
  node *next, *prev;
  int data;
  node(int x){
    data = x;
    prev = NULL;
    next = NULL;
  }
};

node *insert(node *head, int x){
  node *temp = new node(x);
  if(head == NULL) {
    temp->next = temp;
    temp->prev = temp;
    return temp;
  }
  temp->data = head->data;
  head->data = x;
  temp->prev = head;
  temp->next = head->next;
  head->next = temp;
  head->prev->prev = temp;
  head = head->next;
  return head;

}

int main() 
{
  int T, n, r;
  
  cin>>T;
  for(int t=0;t<T;t++){
    node *head = NULL;
    cin>>n;
    cin>>r;
  int x;
  for(int i=0;i<n;i++){
    cin>>x;
    head = insert(head , x);
  }
  for(int j=0;j<r;j++){
    head = head->next;
  }
    node *curr = head;
    cout<<curr->data<<" ";
    curr = curr->next;
    while(curr!=head){
      cout<<curr->data<<" ";
      curr = curr->next;
    }
    cout<<endl;
  }
    return 0;
}