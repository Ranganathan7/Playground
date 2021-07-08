#include <iostream>

using namespace std;
struct node{
  node *left, *right;
  int data;
  node(int x){
    left = NULL;
    right = NULL;
    data = x;
  }
};

node* insert(node *root, int x){
  node *temp = new node(x);
  node *parent = NULL, *curr = root;
  while(curr!=NULL){
    parent = curr;
    if(curr->data > x) curr = curr->left;
    else if(curr->data < x) curr = curr->right;
    else return root;
  }
  if(parent == NULL) return temp;
  if(parent->data > x) parent->left = temp;
  else parent->right = temp;
  return root;
}

int sum(node* root){
  if(root==NULL) return 0;
  return (root->data + sum(root->left) + sum(root->right));
}

int main() 
{
  node *root = NULL;
  int x;
  while(1){
    cin>>x;
    if(x<0) break;
    root = insert(root, x);
  }
  int s = sum(root);
  cout<<"Sum of all nodes are "<<s;
    return 0;
}