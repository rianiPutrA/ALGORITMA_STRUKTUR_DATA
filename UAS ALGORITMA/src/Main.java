import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Bag
        Bag<Integer> bag = new Bag<>();
        System.out.print("Masukkan jumlah elemen untuk Bag: ");
        int bagSize = scanner.nextInt();
        for (int i = 0; i < bagSize; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            bag.add(scanner.nextInt());
        }
        System.out.println("Isi Bag:");
        for (int item : bag) System.out.println(item);

        // Queue
        Queue<String> queue = new Queue<>();
        System.out.print("Masukkan jumlah elemen untuk Queue: ");
        int queueSize = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < queueSize; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            queue.enqueue(scanner.nextLine());
        }
        System.out.println("Dequeuing Queue:");
        while (!queue.isEmpty()) System.out.println(queue.dequeue());

        // Stack
        Stack<Integer> stack = new Stack<>();
        System.out.print("Masukkan jumlah elemen untuk Stack: ");
        int stackSize = scanner.nextInt();
        String stackSIze = scanner.nextLine();
        for (int i = 0; i < stackSize; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            stack.push(scanner.nextInt());
        }
        System.out.println("Popping Stack:");
        while (!stack.isEmpty()) System.out.println(stack.pop());

        // Binary Tree
        BinaryTree tree = new BinaryTree();
        tree.insertNodesFromUser();
        System.out.println("Inorder Traversal:");
        tree.inorder(tree.root);
        System.out.println();

        // Graph
        System.out.print("Masukkan jumlah node untuk Graph: ");
        int graphVertices = scanner.nextInt();
        Graph graph = new Graph(graphVertices);
        graph.buildGraphFromUser();
        System.out.println("Adjacency List dari Graph:");
        graph.printGraph();

        scanner.close();
    }
}