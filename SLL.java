class Node{
    int data;
    Node next;
    
    Node(int data){
        this.data = data;
        this.next = null;
    }
    
    public static void insBeg(int data){
        Node newNode= new Node(data);
        if(head!=null){
            newNode.next=head;
        }
        head=newNode;
    }
    
    public static void insEnd(int data){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newNode;
        }
        
    }
    
    public static void insPos(int data, int pos){
        Node newNode= new Node(data);
        if(head==null){
            head=newNode;
        }
        else{
        Node temp=head;
        for(int i=0;i<pos-1;i++){
            temp=temp.next;
        }
        newNode.next= temp.next;
        temp.next=newNode;
            }
        }
    }

    public static Node printLL() {
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " -> ");
                temp = temp.next;
            }
            System.out.println("null");
        }
    
    public static void main(String[] args) {
        insBeg(5);
        printLL();
        insBeg(15);
        printLL();
        insEnd(20);
        insEnd(30);
        printLL();
        insPos(25, 3);
        printLL();
    }
}
