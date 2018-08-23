
	class Solution {
    

    
    public ListNode middleNode(ListNode head) {        
    int index=0;
    ListNode temp=head;
    while(head.next!=null)
    {
    	head=head.next;
    	index++;
    }	
    for(int i=0;i<(index%2==1?(index/2)+1:index/2);i++)
    {
    	temp=temp.next;
    }   
    return temp;
    }
	
}
