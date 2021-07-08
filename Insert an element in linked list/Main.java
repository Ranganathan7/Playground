#include<iostream>
using namespace std;
struct Node{
  Node *next;
  int value;
  Node(int x){
    value = x;
    next = NULL;
  }
};

int main()
{
  int x;
  cin>>x;
  Node *root = new Node(x);
  Node *curr = root;
  while(1){
    cin>>x;
    if(x==-1) break;
    curr->next = new Node(x);
    curr = curr->next;
  }
  curr = root;
  while(curr!=NULL){
    cout<<curr->value<<endl;
    curr = curr->next;
  }
  //Type your code here
  return 0;
}