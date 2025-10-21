#include <iostream>
#include <string>
#include <vector>
using namespace std; 

class arrayStack{
    private:
    vector<char> arrstack;
    public:
    bool isempty() { 
        return arrstack.empty(); 
        }
    char top(){
    if (isempty()) {
        cout << "Stack is empty\n";
            return -1;
        }
        return arrstack.back();
    }
    void push(char paren){
        arrstack.push_back(paren);
    }
    void pop(){
        if(arrstack.empty()){
           std::cout <<"Stack is empty";
        }
        else{
            arrstack.pop_back();    
        }
    }
    bool isBalanced(string statement){
        for(char paren: statement ){
            if(paren== '(' || paren== '{' || paren=='['){
                push(paren); //push opening paren
            }
            else if (paren == ')' || paren == '}' || paren == ']') {
                 if (isempty()) {
                return false;
            }
        
        if (!isempty() && 
                ((top() == '(' && paren == ')') ||
                 (top() == '{' && paren == '}') ||
                 (top() == '[' && paren == ']'))) {
                pop(); 
            }
            else {
                return false; 
            }
    }
    }
    return isempty();
}
};
//now making a stack with LL
class node{
    public:
    char data;
    node* next;
};
class linkStack{
    public:
    node *top=NULL;

     bool linkisempty() {
        if(top==NULL){
            return true;
        }
        else{
        return false;
        }
     }
    void linkpush(char value){
        node* newnode = new node();
        newnode->data = value;
        newnode->next = top;
        top = newnode;
    }
    void linkpop(){
        if(linkisempty()){
            cout<<"Stack is empty";
        }
        else{
            node* temp = top;
            top = top->next;
            delete temp;
        }
    }
    char linktop(){
    if (linkisempty()) {
        cout << "Stack is empty\n";
        }
        else{
        return top->data;
    }
}
bool linkisBalanced(string statement) {
    for(char paren: statement ){
            if(paren== '(' || paren== '{' || paren=='['){
                linkpush(paren); //push opening paren
            }
            else if (paren == ')' || paren == '}' || paren == ']') {
                 if (linkisempty()) {
                return false;
            }
        
        if (!linkisempty() && 
                ((linktop() == '(' && paren == ')') ||
                 (linktop() == '{' && paren == '}') ||
                 (linktop() == '[' && paren == ']'))) {
                linkpop(); 
            }
            else {
                return false; 
            }
    }
    }
    return linkisempty();
    }
};

int main(){
    string input=" a+(b * [c - d)"; 
    linkStack linkstack;
    arrayStack arrstack;
    cout << "Input for arrays: " << input<< endl;
    if (arrstack.isBalanced(input)) {
        cout << "Output for arrays:Parentheses are balanced." << endl;
    } else {
        cout << "Output for arrays: Parentheses are not balanced." << endl;
    }
        cout << "Input for linkedlists: " << input << endl;
    if (linkstack.linkisBalanced(input)) {
        cout << "Output for linkedlists: Parentheses are balanced." << endl;
    } else {
        cout << "Output for linkedlists: Parentheses are not balanced." << endl;
    }
    return 0;
}
