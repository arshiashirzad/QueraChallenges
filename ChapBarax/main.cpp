#include <iostream>

using namespace std;
struct Node {
    int data;
    Node* next;

    Node(int val) : data(val), next(nullptr) {}
};

class LinkedList {
private:
    Node* head;

public:
    LinkedList() : head(nullptr) {}

    void push(int val) {
        Node* newNode = new Node(val);
        newNode->next = head;
        head = newNode;
    }

    void printReverse() {
        Node* current = head;
        while (current != nullptr) {
            cout << current->data << endl;
            current = current->next;
        }
    }
};

int main() {
    LinkedList list;
    int number;

    while (true) {
        cin >> number;
        if (number == 0) {
            break;
        }
        list.push(number);
    }

    list.printReverse();

    return 0;
}
