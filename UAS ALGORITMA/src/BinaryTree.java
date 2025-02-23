import java.util.Scanner;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {
    Node root;

    public  BinaryTree () { root = null; }

    public void  inorder(Node node) {
        if (node != null) {
            inorder(node.left);
            System.out.print(node.key + " ");
            inorder(node.right);
        }
    }

    public void insertNodesFromUser () {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masuskan jumla node untuk Binary Tree: ");
        int treeSize = scanner.nextInt ();

        if (treeSize > 0) {
            System.out.print("Masukkan root node: ");
            root = new Node(scanner.nextInt() );
            Queue<Node> nodes = new LinkedList<>();
            nodes.add(root);

            for (int i = 1; i < treeSize; i++) {
                Node current = nodes.poll();
                System.out.print("Masukan node kiri dari " + current.key + " (atau -1 jika kosong: ");
                int leftVal = scanner.nextInt();
                if (leftVal != -1){
                    current.left = new Node(leftVal);
                    nodes.add(current.left);

                }

                if (++i >= treeSize) break;

                System.out.print("Masukkan node kanan dari " + current.key + " (atau -1 jika kosong): ");
                int rightVal = scanner.nextInt();
                if (rightVal != -1) {
                    current.right = new Node(rightVal);
                    nodes.add(current.right);
                }
            }

        }
    }
}
