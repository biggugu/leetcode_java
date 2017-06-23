package test;

class ListNode{
	int val;
	ListNode next;
	ListNode(int x){val=x;}
}
public class solution {
	public ListNode addTwoNumbers(ListNode l1,ListNode l2){
		ListNode l3=new ListNode(0);
		ListNode head=new ListNode(0);
		head.next=l3;
		while(l1!=null){
			l3.val+=l1.val+l2.val;
			if(l3.val>=10){
				l3.next=new ListNode(1);
				l3.val-=10;
			}
			else{
				if(l1.next!=null)
					l3.next=new ListNode(0);
			}
			l1=l1.next;
			l2=l2.next;
			l3=l3.next;
		}
		return head.next;
	}
	public static void main(String[] args){
		solution s=new solution();
		ListNode l1=new ListNode(2);
		l1.next=new ListNode(4);
		l1.next.next=new ListNode(3);
		ListNode l2=new ListNode(5);
		l2.next=new ListNode(6);
		l2.next.next=new ListNode(4);
		ListNode l3=new ListNode(0);
		l3=s.addTwoNumbers(l1, l2);
		while(l3!=null){
			System.out.println(l3.val);
			l3=l3.next;
		}
	}
}
