public class PopulatingNextRightPointersInEachNode {
    public Node connect(Node root) {
        Node answer = root;

        dfs(answer);
        return answer;
    }

    public void dfs(Node root) {
        if(root == null) {
            return;
        }

        if(root.left != null) {
            // 현재의 깊이에서 오른쪽 노드를 참조
            root.left.next = root.right;
            // 왼쪽 및 오른쪽 하위 트리 확인
            if(root.next != null) {
                root.right.next = root.next.left;
            }
        }

        dfs(root.left);
        dfs(root.right);
    }
}

// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
