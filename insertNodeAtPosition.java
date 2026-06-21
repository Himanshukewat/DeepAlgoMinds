class Result {

    /*
     * Complete the 'insertNodeAtPosition' function below.
     *
     * The function is expected to return an INTEGER_SINGLY_LINKED_LIST.
     * The function accepts following parameters:
     *  1. INTEGER_SINGLY_LINKED_LIST llist
     *  2. INTEGER data
     *  3. INTEGER position
     */

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */

    public static SinglyLinkedListNode insertNodeAtPosition(SinglyLinkedListNode llist, int data, int position) {
    // Write your code here
    SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);
    SinglyLinkedListNode curr = llist;
    int count = 0;
    while( curr != null){
       count++;
       if(count == position){
        SinglyLinkedListNode temp = curr.next;
        curr.next = newNode;
        newNode.next = temp;
       } 
       else {
        curr = curr.next;
       }
    }
    return llist;

    }

}
