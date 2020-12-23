/**
 * 链表中倒数第k个节点
 * 两个指针 时间复杂度O(N)
 * @Author hyx
 * @Date 2020/12/23
 */
public class GetKthFromEnd {
    public class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public ListNode getKthFromEnd(ListNode head, int k) {
        ListNode former = head;
        ListNode latter = head;
        while(k > 0){
            latter = latter.next;
            k--;
        }
        while(latter != null){
            latter = latter.next;
            former = former.next;
        }
        return former;
    }
}
