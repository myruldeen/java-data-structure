class LinkedList {
  public LinkedList () {
    length = 0;
  }
  Node head;
  private int length = 0;

  public synchronized Node getHead() {
    return head;
  }
  public synchronized void insertAtBegin(Node node) {
    node.setNext(head);
    head = node;
    length++;
  }
  public synchronized void insertAtEnd(Node node) {
    if (head == null) {
      head = node;
    } else {
      Node p, q;
      for (p = head; (q = p.getNext()) != null; p = q) {
        p.setNext(node);
      }
    }
    length++;
  }
  public void insert(int data, int position) {
      
    if (position < 0) {
      position = 0;
    }
    if (position > length) {
      position = length;
    }
    if (head == null) {
      head = new Node(data);
    } else if (position == 0) {
      Node temp = new Node(data);
      temp.next = head;
      head = temp;
    } else {
      Node temp = head;
      for (int i = 1; i < position; i+=1) {
        temp = temp.getNext();
      }
      Node newNode = new Node(data);
      newNode.next = temp.next;
      temp.setNext(newNode);
    }
    length += 1;
  }
  public synchronized Node removeFromBegin() {
    Node node = head;
    if (node != null) {
      head = node.getNext();
      node.setNext(null);
    }
    return node;
  }
  public synchronized Node removeFromEnd() {
    if (head == null) {
      return null;
    }
    Node p = head, q = null, next = head.getNext();
    if (next == null) {
      head = null;
      return p;
    }
    while ((next = p.getNext()) != null) {
      q = p;
      p = next;
    }
    q.setNext(null);
    return p;
  }
  public synchronized void removeMatched(Node node) {
    if (head == null) {
      return;
    }
    if (node.equals(head)) {
      head = head.getNext();
      return;
    }
    Node p = head, q = null;
    while((q = p.getNext()) != null) {
      if (node.equals(q)) {
        p.setNext(q.getNext());
        return;
      }
      p = q;
    }
  }
  public void remove(int position) {
    if (position < 0) {
      position = 0;
    }
    if (position >= length) {
      position = length - 1;
    }
    if (head == null) return;
    
    if (position == 0) {
      head = head.getNext();
    } else {
      Node temp = head;
      for (int i=1; i < position; i+=1) {
        temp = temp.getNext();
      }
      temp.setNext(temp.getNext().getNext());
    }
    length = 1;
  }
  public String toString() {
    String result = "[";
    if (head == null) {
      return result+"]";
    }
    result = result + head.getData();
    Node temp = head.getNext();
    while (temp != null) {
      result = result + ","+ temp.getData();
      temp = temp.getNext();
    }
    return result+"]";
  }
  public int length() {
    return length;
  }
  public int getPosition(int data) {
    Node temp = head;
    int pos = 0;
    while (temp != null) {
      if (temp.getData() == data) {
        return pos;
      }
      pos += 1;
      temp = temp.getNext();
    }
    return Integer.MIN_VALUE;
  }
  public void clearList() {
    head = null;
    length = 0;
  }
}