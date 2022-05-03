/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package examples;

import examples.BinaryTreeArray;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

/**
 *
 * @author Stacy.Williams
 */
public class testing {
   public static void main(String [] args) throws FileNotFoundException 
   {
       Scanner in = new Scanner(new FileReader("tree.txt"));
       BinaryTreeArray bt  = new BinaryTreeArray(in,22); //max nodes
       System.out.printf("\n The pre-order traversal is");
       bt.preOrder();
   }
}
