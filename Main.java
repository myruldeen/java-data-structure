class Main {
  public static void main(String[] args) {
    LinkedList list = new LinkedList();
    int[] element = {10, 20, 30, 40};
    for (int i=0; i<element.length; i++ ) {
        list.insert(element[i], i);
    }
    System.out.println(list);
  }
}

