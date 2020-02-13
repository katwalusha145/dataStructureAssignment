/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package deleteduplicatenodes;

/**
 *
 * @author Katwalusha
 */
public class Node {
    public int data;
	public Node next;

	public Node(int num) {
		this.data = num;
		this.next = null;
	}
}
