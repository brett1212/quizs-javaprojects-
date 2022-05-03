/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examples;

import java.util.Scanner;

/**
 *
 * @author Stacy.Williams
 */
public class BinaryTreeArray {

    int lastNode, maxNodes;
    String[] T;

    public BinaryTreeArray(Scanner in, int max) {
        T = new String[max + 1];
        lastNode = 0;
        maxNodes = max;
        buildTree(in, 1);

    }

    void buildTree(Scanner in, int root) {
        String str = in.next();
        if (str.equals("@")) {
            if (root <= maxNodes) {
                T[root] = "*";
            }
            return;
        }
        if (root > maxNodes) {
            System.out.printf("\nArray is too small to bold tree\n");
            System.exit(1);

        }
        if (root > lastNode) {
            lastNode = root;
        }
        T[root] = str;
        buildTree(in, root * 2); //build the left tree
        buildTree(in, root * 2 + 1); //build the right subtree
    }

    public void preOrder() {
        preOrderTraversal(1);
    }

    void preOrderTraversal(int root) {
        //tree is stored in T[1] to T[lastNode]
        if (root <= lastNode && !T[root].equals("*")) // if not null
        {
            visit(root);
            preOrderTraversal(root * 2);
            preOrderTraversal(root * 2 + 1);
        }
    }

    void visit(int node) {
        System.out.printf("%s ", T[node]);
    }
}
