import javax.xml.soap.Node;

/**
 * Created by Lenovo on 3/24/2022.
 */
public class Binary<E> {
    private Node<E>root=null;
    private  int Size=0;

    public boolean isEmpty(){
        return Size==0;
    }
    public int Size(){
        return Size;
    }
    protected Node<E>createnode(E e,Node<E>p,Node<E>L,Node<E>R){
        return new Node<E>(e,p,L,R);
    }
    protected Node<E>validate(postion<E>p){
        if(!(p instanceof Node))
            throw new IllegalArgumentException("p is not validate postion");
        Node<E>n=(Node<E>)p;
        if(n.getParent()==n)
            throw new IllegalArgumentException("p is not existed");
        return n;
    }
    public postion<E>parent(postion<E>p){
        Node<E>n=validate(p);
        return n.getParent();
    }
    public postion<E>Left(postion<E>p){
        Node<E>n=validate(p);
        return n.getLeft();
    }
    public postion<E>Right(postion<E>p){
        Node<E>n=validate(p);
        return n.getRight();
    }
    public int numofChildern(postion<E>p){
        int count=0;
        if(Left(p)!=null)
            count++;
        return count;
    }
    private static class Node<E>implements postion<E>{
        private final Node<E> parent;
        E element;
        Node<E>Parent;
        Node<E>Left;
        Node<E>Right;

        public Node(E element,Node<E>parent,Node<E>Left,Node<E>Right){
            this.element=element;
            this.parent=parent;
            this.element=element;
            this.Left=Left;
            this.Right=Right;

        }
        public E getElement(){
            return element;
        }
        public void setElement(E element){
            this.element=element;
        }
        public Node<E>getParent(){
            return parent;
        }
        public void setParent(Node<E>parent){
            this.Parent=parent;
        }
        public Node<E>getLeft(){
            return Left;
        }
        public void setLeft(Node<E>Left){
            this.Left=Left;
        }
        public Node<E>getRight(){
            return Right;
        }
        public void setRight(Node<E>Right){
            this.Right=Right;
        }
        public E getElement(){
            return element;
        }


    }
}
