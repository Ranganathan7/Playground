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
int main()
{
  node *temp,*head;
  int x;
  cin>>x;
  node *curr = new node(x);
  head = curr;
  while(1){
  cin>>x;
  if(x<0) break;
  temp = new node(x);
  curr->next = temp;
  curr = temp;

}
 
  head = head->next;

  
temp = head;
while(temp!=NULL){
  cout<<temp->value<<endl;
  temp = temp->next;
}  //Type your code here
  return 0;
}