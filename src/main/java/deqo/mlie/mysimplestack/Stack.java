package deqo.mlie.mysimplestack;

import java.util.EmptyStackException;

/**
 * classe Stack
 * represente une simple pile
 *
 * @author Mathieu Lievre
 *
 *
 *   \o__
 *   |
 *  |\
 *
 */
public class Stack implements SimpleStack {

    private Item top;
    private int size;

    /**
     * constructeur par defaut
     * cree une pile vide
     */
    public Stack() {
        this.top = null;
        this.size = 0;
    }

    /**
     * methode isEmpty
     * permet de savoir si la pile est vide ou non
     *
     * @return true si la pile est vide, false sinon
     */
    public boolean isEmpty() {
        return this.size == 0;
    }

    /**
     * methode getSize
     * permet de connaitre le nombre d'items dans la pile
     *
     * @return size : nombre d'items presents dans la pile
     */
    public int getSize() {
        return this.size;
    }

    /**
     * methode push
     * permet d'ajouter un item en sommet de pile
     *
     * @param item item a ajouter
     */
    public void push(Item item) {
        item.setPrevious(this.top);
        this.top = item;
        this.size++;
    }

    /**
     * methode peek
     * permet de connaitre l'item en sommet de pile sans le depiler
     *
     * @return top : l'item en sommet de pile
     * @throws EmptyStackException lorsque la pile est vide
     */
    public Item peek() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        return top;
    }

    /**
     * methode pop
     * permet de depiler : enlever l'item en sommet de pile
     * la methode remplace l'item au sommet par son suivant s'il existe
     *
     * @return top : l'item en sommet de pile avant l'operation
     * @throws EmptyStackException lorsque la pile est vide
     */
    public Item pop() throws EmptyStackException {
        if(isEmpty()) throw new EmptyStackException();
        Item item = this.top;
        this.top = top.getPrevious();
        this.size--;
        return item;
    }
}
